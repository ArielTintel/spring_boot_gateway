package br.com.arieltintel.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class Client {

    @GetMapping
    public String getClient(){
        return "Hello Client Ariel Tintel";
    }

}
