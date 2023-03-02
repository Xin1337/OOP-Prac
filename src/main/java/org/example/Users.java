package org.example;

public class Users {

    public class User extends OOP {

        public User(int scores, String name) {
            super(scores, name);
        }

        @Override
        void print() {
            System.out.printf("%s's score is %s%n", getName(), getScores());
        }

    }

    public class User2 extends OOP {

        public User2(int scores, String name) {
            super(scores, name);
        }

        @Override
        void print() {
            System.out.printf("%s's score is %s%n", getName(), getScores());
        }
    }

    public class User3 extends OOP {

        public User3(int scores, String name) {
            super(scores, name);
        }

        @Override
        void print() {
            System.out.printf("%s's score is %s%n", getName(), getScores());
        }
    }

    public class User4 extends OOP {

        public User4(int scores, String name) {
            super(scores, name);
        }

        @Override
        void print() {
            System.out.printf("%s's score is %s%n", getName(), getScores());
        }
    }
}