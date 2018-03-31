package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AaController {

    private static final Logger log = LoggerFactory.getLogger(AaController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> team(){

        log.info("Looks good");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");

        String t =  "{\"elements\":[\"First Name\", \"Last Name\", \"Address\", \"Age\", \"Sex\"]}";
        return new ResponseEntity<String>(t,headers, HttpStatus.OK);

    }
}
