package org.dice;

import java.util.Random;

public enum Dice {
     D6 (6)
    ,D10 (10)
    ,D20 (20)
    ,D100 (100);

     private int value;

    Dice(int vlu) {
        this.value = vlu;
    }

    public int getValue(){
        return this.value;
    }

    public static int roll(int value){
        Random rand = new Random();
        value = rand.nextInt(value - 1 ) + 1;
        value +=1;

        return value;


    }
    public static void diceRoll(){
        ;
        System.out.println("Dice 1: "+roll(Dice.D6.getValue()));
        System.out.println("Dice 2: "+roll(Dice.D10.getValue()));
        System.out.println("Dice 3: "+roll(Dice.D20.getValue()));
        System.out.println("Dice 4: "+roll(Dice.D100.getValue()));
    }
}
