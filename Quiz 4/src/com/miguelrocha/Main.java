package com.miguelrocha;

public class Main {

    public static void main(String[] args) {
        Player Gold = new Player(23,"King",98);
        Player Royal = new Player(30,"Queen", 95);
        Player Black = new Player(34, "Jack", 93);
        Player Paladin = new Player(3, "Knight", 94);
        Player Joke = new Player(23,"Joker", 99);
        Player Penta = new Player(1,"Ace", 90);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(Gold.getUsername(), Gold);
        hashTable.put(Royal.getUsername(),Royal);
        hashTable.put(Black.getUsername(), Black);
        hashTable.put(Paladin.getUsername(), Paladin);
        hashTable.put(Joke.getUsername(), Joke);
        hashTable.put(Penta.getUsername(), Penta);

        hashTable.printHashTable();
        hashTable.remove("Penta");
        System.out.println("new Hash Table: ");
        hashTable.printHashTable();
    }
}