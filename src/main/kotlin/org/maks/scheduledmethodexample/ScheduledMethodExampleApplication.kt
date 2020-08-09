package org.maks.scheduledmethodexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class ScheduledMethodExampleApplication

fun main(args: Array<String>) {
	runApplication<ScheduledMethodExampleApplication>(*args)
}
