package de.mab.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by mbreuer on 16.02.21.
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
