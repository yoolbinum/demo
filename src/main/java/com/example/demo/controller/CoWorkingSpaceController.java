package com.example.demo.controller;

import com.example.demo.model.CoWorkingSpace;
import com.example.demo.model.result.CoWorkingSpaceResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;

@Controller
public class CoWorkingSpaceController {

    @RequestMapping("/get")
    public String getCoworking(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Mashape-Key", "ShedIfdxswmsh7n7BWdKbLix2oxep1oKrryjsnl9MPWgR9vWwa");
        HttpEntity entity = new HttpEntity(headers);
        String url = "https://card4b-masai-masai-coworkingcoffee-stg-v1.p.mashape.com/coworkingspace/api/discovery/getCoWorkingSpaces" +
                "?City=Lisboa, Portugal";

        ResponseEntity<CoWorkingSpaceResponse> response = restTemplate.exchange(
                url, HttpMethod.GET, entity, CoWorkingSpaceResponse.class);

        return "";
    }
}
