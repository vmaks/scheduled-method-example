package org.maks.scheduledmethodexample

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class ScheduledService {

    @Scheduled(fixedRate = 1000)
    fun run() {
        println("run() has been executed")
    }
}