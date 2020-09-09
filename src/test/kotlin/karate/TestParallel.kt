package karate

import com.intuit.karate.Results
import com.intuit.karate.Runner
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestParallel {

    @Test
    fun testParallel() {
        val results: Results = Runner.path("classpath:karate/hello").tags("~@ignore").parallel(5)
        assertEquals(0, results.failCount, results.errorMessages)
    }
}