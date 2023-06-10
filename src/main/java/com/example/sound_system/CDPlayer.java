package com.example.sound_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements IMediaPlayer {
    private ICompactDisc cd;

    //why @Autowired  unnecessary? 
    public CDPlayer(ICompactDisc cd) {//used in constructor
        this.cd = cd;
    }

    @Autowired(required = false)
    public void setCompactDisc(ICompactDisc cd) {//used in setter
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}