package jliu2882;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] markers = {100,150,105,120,90,80,50,75,75,70,80,90,100};

        Trail trail = new Trail(markers);


        System.out.println(trail.isLevelTrailSegment(0,1));
        System.out.println(trail.isDifficult());

    }
}