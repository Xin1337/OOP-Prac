package org.example;

abstract class OOP {

    private int scores;
    private String name;

    public OOP(int scores, String name) {
        this.scores = scores;
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }

    abstract void print();
    abstract void total();
}
