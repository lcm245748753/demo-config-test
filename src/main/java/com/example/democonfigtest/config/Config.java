package com.example.democonfigtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class Config {
    @Value("${config-test-uri:}")
    private String dataSourceUrl;
    @Value("${config-test-username:}")
    private String dataUsername;
    @Value("${config-test-password:}")
    private String dataPassword;

    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public String getDataUsername() {
        return dataUsername;
    }

    public String getDataPassword() {
        return dataPassword;
    }
}
