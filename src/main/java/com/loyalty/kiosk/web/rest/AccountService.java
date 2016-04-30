package com.loyalty.kiosk.web.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kabachko on 4/30/2016.
 */
@RestController
@RequestMapping("/api")
public class AccountService {

    @RequestMapping(
    value = "/users",
    produces={
        MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public Map<String, Object> getUsers(){
        return new HashMap<String, Object>(){
            {
                put("userName","Anton");
                put("surName","Kabachkov");
                put("age","28");
            }
        };

    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }


}
