package com.great.polymorphism;

class DVDPlayer implements Player {
    @Override
    public void play() {
        System.out.println("play a DVD");
    }

    @Override
    public void stop() {
        System.out.println("stopped DVD");
    }

    @Override
    public void pause() {
        System.out.println("paused DVD");
    }
}