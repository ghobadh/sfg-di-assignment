package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 *
 *  Gavin Hashemi:
 *
 *  We removed
 *  @Profile("EN")
 * @Service("i18nService")
 *  and mored them to the config class file GreetingServicesConfig
 */

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
