package de.mab.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by mbreuer on 16.02.21.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
