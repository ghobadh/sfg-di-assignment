package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gavinhashemi on 2023-09-27
 * The configuration annotation will tell the springframework to scan this class file and a configuration file for the project .
 *
 * We are creating a config folder to centeralize all configuration file in one place
 */
@Configuration
public class GreetingServicesConfig {
    /*
    *  This is more traditional use to call a third party object.
     */
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    /*
        This PropertyInjectedGreetingService had @Service annotation. We removed the annotation to enforce the class file is not servicing anymore
        and now we added it in traditional way. Please not the object name we named it will be the bean name.
        for example if we change the name of the method from propertyInjectedGreetingService to xyz, from now on, the created bean name will be xyz.
     */
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return  new SetterInjectedGreetingService();
    }
}
