package com.cnhtcqk.servicehi.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * @author fuxuelong
 * */
@EnableOAuth2Client
@EnableConfigurationProperties
@Configuration
public class OauthClientConfig {
    
}
