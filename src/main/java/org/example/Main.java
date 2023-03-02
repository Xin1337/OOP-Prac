package org.example;

public class Main {
    public static void main(String[] args) {

        Users heh = new Users();
        Users.User user = heh.new User(10, "Gamer 1");
        user.print();

        Users.User2 user2 = heh.new User2(20, "Gamer 2");
        user2.print();

        Users.User3 user3 = heh.new User3(30, "Gamer 3");
        user3.print();

        Users.User4 user4 = heh.new User4(40, "Gamer 4");
        user4.print();

        System.out.printf("Total average score is: %s", (user.getScores() + user2.getScores() + user3.getScores() + user4.getScores()) / 4);
    }
}