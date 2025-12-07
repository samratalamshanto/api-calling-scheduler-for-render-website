package com.example._pp_api_calling_scheduler.scheduler;

import com.example._pp_api_calling_scheduler.service.ExternalApiCallService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchedulerService {
    private final ExternalApiCallService externalApiCallService;

    @Scheduled(fixedDelay = 55000L)
    public void scheduledForSimpleMessengerApiCall() {
        log.info("scheduledForSimpleMessengerApiCall Started");
        externalApiCallService.callSimpleMessengerApi();
        log.info("scheduledForSimpleMessengerApiCall End");
    }
}
