package com.example._pp_api_calling_scheduler.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "application.web-socket-messenger")
public class WebSocketMessengerProperties {
    private String url;
    private String testApiEndPoint;
}
