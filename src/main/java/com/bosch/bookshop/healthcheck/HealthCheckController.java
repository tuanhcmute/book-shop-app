package com.bosch.bookshop.healthcheck;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
@Slf4j
public class HealthCheckController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public HealthCheckResponse<Void> getHealthStatus() {
        return HealthCheckResponse.<Void>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Application is running")
                .path("/api/v1/healthcheck")
                .data(null)
                .build();
    }
}
