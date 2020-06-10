package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("set trile float place like A1A3");
        Scanner in = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        Game game = new Game();
        while (true){
            char[]  trip = in.next().toCharArray();
            if(c1 == 0){
                c1 = game.setTriple(trip);
                System.out.println("set trile float place like A1A2");
            }else if(c2==0){
                c2 = game.setDouble(trip);
                System.out.println("set trile float place like A1");
            }else if(c3==0){
                c3 = game.setSingle(trip);
            }
            if(Arrays.equals(trip, "stop".toCharArray())){
                break;
            }
            if(c4==1){
                game.attack(trip);
                if(game.status()==0){
                    System.out.println("You win");
                    break;
                }
                if(game.statusy()==0){
                    System.out.println("All of your float die you lose");
                    break;
                }
            }
            if(c3==1){
                c4=1;
                game.printGraund();
            }
        }
//        Game newGame = new Game();
//        System.out.println("triple set your triple float:");
//        System.out.println("triple set your triple float:");
//        System.out.println("triple set your triple float:");

    }
}
