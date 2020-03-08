package guru.springframework.sfgdi.services;

public class I18nGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from  I18n";
    }

}
