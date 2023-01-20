package com.home.geradorDeMassa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "https://baconipsum.com", name = "lorenClient")
public interface LorenClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/?type=meat-and-filler")
    List<String> getLoren();
}
