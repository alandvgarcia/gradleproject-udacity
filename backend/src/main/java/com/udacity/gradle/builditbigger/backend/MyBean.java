package com.udacity.gradle.builditbigger.backend;

import com.example.jokes.TellJoke;

/** The object model for the data we are sending through endpoints */


public class MyBean {

    private String myData;

    public String getData() {
        TellJoke tellJoke = new TellJoke();
        myData = tellJoke.tellMeAJoke();
        return myData;
    }

}