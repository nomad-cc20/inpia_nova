package net.nomad.inpia.cv03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "Hello world XXX";
    }
}
