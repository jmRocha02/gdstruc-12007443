package com.miguelrocha;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random(); // initialize randomizer

        // array of card names
        String[] cardNames = {"King", "Queen", "Jack", "Joker", "Peasant", "Knight", "Archer", "General", "Spy", "Madman"};

        // initialize piles
        CardStack playerDeck = new CardStack();
        CardStack discardPile = new CardStack();
        CardStack playerHand = new CardStack();

        // initial pile size
        int initialPileSize = 30;

        // initialize random cards
        for (int i = 0; i < initialPileSize; i++) {
            playerDeck.push(new Card(cardNames[rand.nextInt(cardNames.length)]));
        }

        // play rounds until there's no more cards
        while (playerDeck.size() > 0) {
            playRound(playerHand, playerDeck, discardPile);
        }

    }

    private static void printDetails(CardStack hand, CardStack deck, CardStack discardPile) {
        System.out.print("Player hand: ");
        hand.printStack();
        System.out.println("\nPlayer hand size: " + hand.size());
        System.out.println("Player deck size: " + deck.size());
        System.out.println("Discard pile size: " + discardPile.size());
        System.out.println("\n");
    }

    private static void playRound(CardStack hand, CardStack deck, CardStack discardPile) {
        Random rand = new Random(); // initialize randomizer
        int selector = rand.nextInt(3); // random int to select command
        int randomAmount = rand.nextInt(5) + 1; // random int to determine how many cards to move

        // select based from selector
        switch (selector) {
            case 0 -> drawFromDeck(hand, deck, randomAmount);
            case 1 -> discard(hand, discardPile, randomAmount);
            case 2 -> drawFromDiscardPile(hand, discardPile, randomAmount);
        }

        // print player and pile details
        printDetails(hand, deck, discardPile);

    }

    private static void drawFromDeck(CardStack hand, CardStack deck, int amount) {
        int adjustedAmount = amount; // initialize adjusted amount
        System.out.println("Drawing " + amount + " cards from the deck.");

        // check if amount is larger than pile
        if (amount > deck.size()) {
            // adjust amount so the program doesn't overdraw
            adjustedAmount = deck.size();
            System.out.println("Drawing only " + adjustedAmount + " cards from the deck because there's only " + adjustedAmount + " in the deck.");
        }

        // draw from deck based on amount
        for (int i = 0; i < adjustedAmount; i++) {
            hand.push(deck.pop());
        }
    }

    private static void discard(CardStack hand, CardStack discardPile, int amount) {
        int adjustedAmount = amount; // initialize adjusted amount
        System.out.println("Discarding " + amount + " cards from your hand.");

        // check if amount is larger than pile
        if (amount > hand.size()) {
            // adjust amount so the program doesn't over discard
            adjustedAmount = hand.size();
            System.out.println("Discarding only " + adjustedAmount + " cards from your hand because there's only " + adjustedAmount + " in your hand.");
        }

        // discard from hand based on amount
        for (int i = 0; i < adjustedAmount; i++) {
            discardPile.push(hand.pop());
        }
    }

    private static void drawFromDiscardPile(CardStack hand, CardStack discardPile, int amount) {
        // initialize adjusted amount
        int adjustedAmount = amount;
        System.out.println("Drawing " + amount + " cards from the discard pile.");

        // check if amount is larger than pile
        if (amount > discardPile.size()) {
            adjustedAmount = discardPile.size();
            System.out.println("Drawing " + adjustedAmount + " cards from the discard pile because there's only " + adjustedAmount + " in the pile.");
        }

        // discard from hand based on amount
        for (int i = 0; i < adjustedAmount; i++) {
            hand.push(discardPile.pop());
        }
    }
}
