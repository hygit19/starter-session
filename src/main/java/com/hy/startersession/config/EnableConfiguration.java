package com.hy.startersession.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebMvcConfig.class,ApplicationContextUtils.class})
@EnableConfigurationProperties(HySessionProperties.class)
public class EnableConfiguration {


}
