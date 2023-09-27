package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author gavinhashemi on 2023-09-27
 * The configuration annotation will tell the springframework to scan this class file and a configuration file for the project .
 *
 * We are creating a config folder to centeralize all configuration file in one place
 */
@Configuration
public class GreetingServicesConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService (){
        return new I18NSpanishService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }



    /*
    This is the primary bean
     */

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }



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
