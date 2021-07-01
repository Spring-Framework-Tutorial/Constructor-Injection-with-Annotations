package me.kodysimpson.constructorinjectionspringannotations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This class must be a bean itself if we want Spring to manage it and inject into it
@Service
public class ArcadeService {

    //the dependency
    private final GameProviderService gameProviderService;

    //Mark it as @Autowired on the constructor so Spring knows to inject the dependency when
    //instantiating this object.
    @Autowired
    public ArcadeService(GameProviderService gameProviderService){
        this.gameProviderService = gameProviderService;
    }

    public void startGame(){
        System.out.println(this.gameProviderService.getGameToPlay() + " is being started.");
    }

    public void stopGame(){
        System.out.println(this.gameProviderService.getGameToPlay() + " is being stopped.");
    }

}
