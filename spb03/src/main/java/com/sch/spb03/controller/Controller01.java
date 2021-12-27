package com.sch.spb03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller01 {
    Logger log = LoggerFactory.getLogger( Controller01.class);
    @RequestMapping("/mg/f1.do")
    @ResponseBody
    public String method01(){
        log.debug("gogogogogogogg..............");
        return "abcxyz";
    }
}
