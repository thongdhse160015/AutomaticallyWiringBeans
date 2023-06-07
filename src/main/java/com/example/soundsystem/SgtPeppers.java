package com.example.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements ICompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
