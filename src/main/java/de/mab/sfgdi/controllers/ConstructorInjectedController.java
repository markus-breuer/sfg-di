package de.mab.sfgdi.controllers;

import de.mab.sfgdi.services.GreetingService;

/**
 * Created by mbreuer on 16.02.21.
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
