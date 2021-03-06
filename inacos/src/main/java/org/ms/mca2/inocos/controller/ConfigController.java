package org.ms.mca2.inocos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${aa.bb}")
    private String configInfo;

    @GetMapping(value = "getConfig")
    public String getConfig() {
        return configInfo;
    }
}
