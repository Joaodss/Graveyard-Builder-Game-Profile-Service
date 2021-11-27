package com.ironhack.profileservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-model-service", path = "/api/v1/users")

public interface UserModelProxy {
}
