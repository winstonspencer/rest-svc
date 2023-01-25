package com.wst.rest.controller;

import java.util.logging.Logger;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KattisController {


    private static final Logger logger = LoggerFactory.getLogger(MyController.class);


    @RequestMapping(value = "/kattis/logger", method = RequestMethod.POST)
    public String logKettisParams(@RequestBody String kattisInput) {

        JSONObject jsonObject = new JSONObject();

        logger.info(kattisInput);

        return jsonObject.toString();
    }

}
