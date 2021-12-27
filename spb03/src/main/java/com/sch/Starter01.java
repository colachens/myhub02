package com.sch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Starter01 {

    static Logger log = LoggerFactory.getLogger( Starter01.class);
    public static  void main(String[] args){


        //SpringApplication.run( Starter01.class);
        log.debug("----------------------");
        SpringApplication app = new SpringApplication(Starter01.class);
        //app.setBannerMode(Banner.Mode.OFF);
        app.run();

    }
}
