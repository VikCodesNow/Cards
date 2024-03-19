package com.master.spring.boot.card.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "cards")
public class CardApiDto {
    String env;
    String version;
}
