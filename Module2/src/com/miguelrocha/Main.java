package com.miguelrocha;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        //ArrayListExample();

        Player viper = new Player(1, "Viper", 10);
        Player jett = new Player(2, "Jett", 25);
        Player omen = new Player(3, "Omen", 56);
        Player killjoy = new Player(4, "Killjoy", 35);
        Player skye = new Player(5, "Skye", 45);


        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(viper);
        playerLinkedList.addToFront(jett);
        playerLinkedList.addToFront(omen);
        playerLinkedList.addToFront(killjoy);
        playerLinkedList.addToFront(skye);

        playerLinkedList.removeFrontNode();
        playerLinkedList.printList();
        playerLinkedList.DisplayNextAndPreviousPlayer(1);


    }

}
