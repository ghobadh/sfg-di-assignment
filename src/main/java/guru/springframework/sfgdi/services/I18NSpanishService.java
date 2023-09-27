package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 *
 *
 * Gavin Hashemi:
 * We removed
 * @Profile({"ES", "default"})
 * @Service("i18nService")
 *
 * and add this service to config class file GreetingServicesConfig file
 */

public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
