package de.mab.sfgdi.controllers;

import de.mab.sfgdi.services.GreetingService;

/**
 * Created by mbreuer on 16.02.21.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
