package com.example.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TellJoke {

    public String tellMeAJoke(){
        String[] jokes = new String[]{"1 - Why are astronauts always so calm and efficient? Because Zero pressure in vacuum.",
                "2 - Romantic relationships can actually be represented in algebra. You for example, have definitely at some point looked at your X and asked yourself Y.",
                "3 - Time is money. Therefore, ATMs are time machines."};


        Random r = new Random();
        System.out.println(jokes[r.nextInt(jokes.length)]);

        return jokes[r.nextInt(jokes.length)];
    }


}
