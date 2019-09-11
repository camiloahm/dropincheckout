package com.jumbo.dipayment.gateway

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthcheckController {

    @GetMapping("/healthcheck")
    fun healthcheck(): String = "OK"

}