package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy(String name) {
        super(name);
    }
    public Happy(String name, Date moodDate) {
        super(name, moodDate);
    }
    @Override
    public String speak() {
        return "Happy";
    }
}
