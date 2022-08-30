package com.great.polymorphism;

class Person {
    private String name;
    private Player player;

    public Person(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    void listenToMusic() {
        System.out.printf("%s started to listen to music.\n", name);
        player.play();
        player.pause();
        player.play();
        player.stop();
    }

    public static void main(String[] args) {
        Player player1 = new CDPlayer();
        Person jack = new Person("Jack", player1);
        jack.listenToMusic();

        Player player2 = new DVDPlayer();
        Person tom = new Person("Tom", player2);
        tom.listenToMusic();

        Player player3 = new TapePlayer();
        Person lea = new Person("Lea", player3);
        lea.listenToMusic();
    }

}