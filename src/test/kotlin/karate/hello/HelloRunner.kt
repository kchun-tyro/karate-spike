package karate.hello

import com.intuit.karate.junit5.Karate

class HelloRunner {
    @Karate.Test
    fun testAll(): Karate {
        return Karate.run().relativeTo(javaClass)
    }
}