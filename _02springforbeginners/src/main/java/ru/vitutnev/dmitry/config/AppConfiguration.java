package ru.vitutnev.dmitry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.vitutnev.dmitry.language.Language;
import ru.vitutnev.dmitry.language.Russian;

@Configuration
@ComponentScan({"ru.vitutnev.dmitry.bean"})
public class AppConfiguration {

    @Bean(name ="language")
    public Language getLanguage() {

        return new Russian();
    }

}
