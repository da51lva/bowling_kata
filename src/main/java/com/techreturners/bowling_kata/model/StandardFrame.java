package com.techreturners.bowling_kata.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class StandardFrame implements Frame{

    private Roll roll1;
    private Roll roll2;

    public StandardFrame(Roll roll1, Roll roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;
    }

    @Override
    public boolean canCalculateFrameScore(Queue<Frame> frames) {
        return true;
    }

    @Override
    public int calculateScore(Queue<Frame> frames) {
        return roll1.getValue() + roll2.getValue();
    }

    @Override
    public Stream<Roll> getRollsAsStream() {
        return Stream.of(roll1,roll2);
    }

}
