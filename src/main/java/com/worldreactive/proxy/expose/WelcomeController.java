package com.worldreactive.proxy.expose;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "¡Bienvenido al proxy de WorldReactive!";
    }
}
