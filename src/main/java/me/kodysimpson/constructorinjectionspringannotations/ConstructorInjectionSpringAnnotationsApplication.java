package me.kodysimpson.constructorinjectionspringannotations;

import me.kodysimpson.constructorinjectionspringannotations.services.ArcadeService;
import me.kodysimpson.constructorinjectionspringannotations.services.GameProviderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionSpringAnnotationsApplication {

    public static void main(String[] args) {
        //get the context so we can retrieve our bean
        ApplicationContext context = SpringApplication.run(ConstructorInjectionSpringAnnotationsApplication.class, args);

        //Obtain a reference to the ArcadeService bean
        //behind the scenes, the dependency was injected into the constructor
        //and so we can call the two methods below with no issue.
        ArcadeService arcadeService = context.getBean(ArcadeService.class);
        arcadeService.startGame();
        arcadeService.stopGame();

    }

}
