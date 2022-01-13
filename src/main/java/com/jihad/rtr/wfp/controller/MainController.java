//  Author: Mohammad Jihad Hossain
//  Create Date: 04/01/2022
//  Modify Date: 04/01/2022
//  Description: Main controller  model file

package com.jihad.rtr.wfp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity rootResponse() {
        String welcomeMessage = "Welcome to the WFP-RtR MIS api";
        return new ResponseEntity<String>(welcomeMessage, HttpStatus.OK);
    }
}
