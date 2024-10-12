package com.raspberrypi.piDeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {
    @RequestMapping(value = "/{path:[^\\.]*}")
    public String forwardToFrontend() {
        return "forward:/index.html";
    }
}
