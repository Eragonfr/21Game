package fr.cesi;

import java.util.List;

public class Player {
    private String name;
    private int count;

    public Player(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int generateNumber(int min, int max) {
        int newNumber = (int) (Math.random() * (max - min + 1) + min);
        return newNumber;
    }
}
