package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.config.AppConfig;
import ru.itis.models.Film;
import ru.itis.services.AfishaService;

import java.util.List;

/**
 * 02.06.2017
 * Main
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AfishaService afishaService = context.getBean(AfishaService.class);
        List<Film> films = afishaService.findAll();
        System.out.println(films);
    }

}
