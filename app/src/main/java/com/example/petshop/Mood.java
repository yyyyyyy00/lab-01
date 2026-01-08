package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private String name;
    private Date moodDate;

    public Mood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mood(String name, Date moodDate) {
        this.name = name;
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public abstract String speak();
}
