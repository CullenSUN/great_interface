package com.great.polymorphism;

class CDPlayer implements Player {
    @Override
    public void play() {
        System.out.println("play a CD");
    }

    @Override
    public void stop() {
        System.out.println("stopped CD");
    }

    @Override
    public void pause() {
        System.out.println("paused CD");
    }
}