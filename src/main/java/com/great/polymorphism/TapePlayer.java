package com.great.polymorphism;

class TapePlayer implements Player {
    @Override
    public void play() {
        System.out.println("play a Tape");
    }

    @Override
    public void stop() {
        System.out.println("stopped Tape");
    }

    @Override
    public void pause() {
        System.out.println("paused Tape");
    }
}