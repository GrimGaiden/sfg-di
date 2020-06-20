package guru.springframework.sfgdi.controllers;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}