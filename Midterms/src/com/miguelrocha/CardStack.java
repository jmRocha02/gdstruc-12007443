package com.miguelrocha;

import java.util.LinkedList;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<>();
    }

    public void push(Card card) {
        stack.push(card);
    }

    public Card pop() {
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        for (Card card : stack) {
            System.out.print(card.getName() + " ");
        }
    }
}

