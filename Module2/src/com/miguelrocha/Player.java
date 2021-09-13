package com.miguelrocha;

import java.util.Objects;

public class Player {
    private int ID;
    private String name;
    private int element;

    public Player(int ID, String name, int element) {
        this.ID = ID;
        this.name = name;
        this.element = element;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return element;
    }

    public void setLevel(int level) {
        this.element = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", Name='" + name + '\'' +
                ", Element=" + element +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return ID == player.ID &&
                element == player.element &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, element);
    }
}
