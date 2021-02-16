package de.mab.sfgdi.controllers;

import de.mab.sfgdi.services.GreetingService;

/**
 * Created by mbreuer on 16.02.21.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
