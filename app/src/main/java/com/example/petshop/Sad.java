package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {
    public Sad(String name) {
        super(name);
    }

    public Sad(String name, Date moodDate) {
        super(name, moodDate);
    }

    @Override
    public String speak() {
        return "Sad";
    }
}
