package com.wst.rest.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KattisController {


    private static final Logger logger = LoggerFactory.getLogger(KattisController.class);


    @PostMapping("/kattis/logger")
    public String logKettisParams(@RequestBody String kattisInput) {

        JSONObject jsonObject = new JSONObject();

        logger.info(kattisInput);

        return jsonObject.toString();
    }

}
