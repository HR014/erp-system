package com.erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.dto.ApiResponse;
import com.erp.service.ErpService;

@RestController
public class HelloController {

    private final ErpService erpService;

    public HelloController(ErpService erpService) {
        this.erpService = erpService;
    }

    @GetMapping("/api/hello")
    public ApiResponse hello() {
        return new ApiResponse(
                erpService.getWelcomeMessage(),
                "SUCCESS"
        );
    }
}