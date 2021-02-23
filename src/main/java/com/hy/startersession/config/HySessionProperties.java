package com.hy.startersession.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ConfigurationProperties(prefix = "hy.session")
public class HySessionProperties {


    private String excludeToken;

    private String excludeUrls;

    public String getExcludeToken() {
        return excludeToken;
    }

    public void setExcludeToken(String excludeToken) {
        this.excludeToken = excludeToken;
    }

    public String getExcludeUrls() {
        return excludeUrls;
    }

    public void setExcludeUrls(String excludeUrls) {
        this.excludeUrls = excludeUrls;
    }


    public List<String> getExcludeUrlList(){
        List<String> urls = new ArrayList<>();
        if(StringUtils.hasLength(excludeUrls)){
            urls = Arrays.asList(excludeUrls.split(","));
        }
        return urls;
    }
}
