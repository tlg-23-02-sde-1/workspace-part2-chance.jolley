package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class DuckRacer {
    //fields or instance variables;
    private final int id;
    private String name;
    private final List<Reward> rewards = new ArrayList<>();

    //constructors

    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }

    //"action" or business methods

    public void win(Reward reward) {
        rewards.add(reward);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//  a derived property, we can "calculate" the number of wins from the 'rewards' collection
    public int getWins() {
        return rewards.size();
    }

    // NOTE: we are returning a direct reference to out List<Reward>

    public List<Reward> getRewards() {
        return Collections.unmodifiableList(rewards);
    }
@Override
    public String toString() {
    return String.format("%s, id=%s, name=%s, wins=%s, rewards=%s",
            getClass().getSimpleName(), getId(), getName(), getWins(),getRewards());
}
}

