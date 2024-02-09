package com.example.apiteste.controller

import com.example.apiteste.service.TimesNba
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/times")
class TimeController {
    @Autowired
    private lateinit var service: TimesNba
    @GetMapping("times-nba")
    fun getTimes(): String {
        return service.time()
    }
}