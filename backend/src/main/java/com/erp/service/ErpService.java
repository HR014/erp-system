package com.erp.service;

import org.springframework.stereotype.Service;

@Service
public class ErpService {

    public String getWelcomeMessage() {
        return "Welcome to ERP System";
    }
}