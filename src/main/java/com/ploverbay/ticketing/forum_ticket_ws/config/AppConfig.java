package com.ploverbay.ticketing.forum_ticket_ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;

@Configuration
@EnableWebMvc
@ComponentScan("com.ploverbay.ticketing.forum_ticket_ws")
public class AppConfig {

    private static final String PROPERTY_NAME_DISCOURSE_FORUM_URL = "discourse.forum.url";
    private static final String PROPERTY_NAME_DISCOURSE_API_KEY = "discourse.api.key";

    @Resource
    private Environment m_environment;


    @Bean(name = "discourseForumUrl")
    public String getDiscourseForumUrl() {
        return m_environment.getRequiredProperty(PROPERTY_NAME_DISCOURSE_FORUM_URL);
    }

    @Bean(name = "discourseApiKey")
    public String getDiscourseApiKey() {
        return m_environment.getRequiredProperty(PROPERTY_NAME_DISCOURSE_API_KEY);
    }

}