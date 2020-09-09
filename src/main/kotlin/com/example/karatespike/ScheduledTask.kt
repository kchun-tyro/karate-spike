package com.example.karatespike

import com.intuit.karate.Runner
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.time.ZonedDateTime

@Configuration
@EnableScheduling
class ScheduledTask(
    private val meterRegistry: MeterRegistry
) {

    private val counter = meterRegistry.counter("karate.tests")

    @Scheduled(fixedDelay = 5000)
    fun scheduleFixedDelayTask() {
        println(
            "Fixed delay task - " + ZonedDateTime.now()
        )
        val result = Runner.path("classpath:hello").tags("~@ignore").parallel(3)
        if (result.failCount == 0) counter.increment()
    }
}