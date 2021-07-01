package me.kodysimpson.constructorinjectionspringannotations.services;

import org.springframework.stereotype.Service;

//Dependency service
@Service
public class GameProviderService {

    public String getGameToPlay(){
        return "World of Warcraft";
    }

}
