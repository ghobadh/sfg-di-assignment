package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 *
 * We remove Service annotation from here and add the class file in the traditional way into GreetingServiceConfig class file and we will use
 * Bean annotation over there
 */

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
