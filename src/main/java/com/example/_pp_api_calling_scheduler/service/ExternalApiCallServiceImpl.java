package com.example._pp_api_calling_scheduler.service;

import com.example._pp_api_calling_scheduler.config.WebSocketMessengerProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExternalApiCallServiceImpl implements ExternalApiCallService {
    private final WebSocketMessengerProperties webSocketMessengerProperties;
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public void callSimpleMessengerApi() {
        String result = restTemplate.getForObject(webSocketMessengerProperties.getUrl() + "/" +
                        webSocketMessengerProperties.getTestApiEndPoint(),
                String.class
        );
        log.info("callSimpleMessengerApi result={}", result);
    }
}
