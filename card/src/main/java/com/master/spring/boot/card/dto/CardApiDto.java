package com.master.spring.boot.card.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
public record CardApiDto(String env,String version) {
}
