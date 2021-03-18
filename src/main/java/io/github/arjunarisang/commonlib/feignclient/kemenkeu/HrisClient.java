package io.github.arjunarisang.commonlib.feignclient.kemenkeu;

import io.github.arjunarisang.commonlib.util.response.UserProfileResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "hris-api",
        url = "${arjunarisang.commonlib.feign.mof-service-uri}",
        configuration = {KemenkeuClientConfig.class})
public interface HrisClient {

    @GetMapping(path = "/hris/profil/pegawai", consumes = "application/json")
    UserProfileResponse getUserProfile(@RequestHeader(value = "Authorization") String token);

}
