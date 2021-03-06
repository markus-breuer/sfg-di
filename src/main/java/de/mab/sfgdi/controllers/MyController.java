package de.mab.sfgdi.controllers;

import de.mab.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by mbreuer on 16.02.21.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
