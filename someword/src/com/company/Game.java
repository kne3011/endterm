package com.company;

import com.company.LifeState.Die;
import com.company.typeOfFloat.DoubleFloat;
import com.company.typeOfFloat.SingleFloat;
import com.company.typeOfFloat.TripleFloat;

public class Game {
    private int[][] you = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private int[][] bot = {{1, 1, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}};
    private int[][] fbot = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    private TripleFloat TripleFloat = new TripleFloat();
    private DoubleFloat DoubleFloat = new DoubleFloat();
    private SingleFloat SingleFloat = new SingleFloat();
    private int checkb = 6;
    private int checky = 6;

    public int setTriple(char[] triple){
        int a = 0;
        if(triple.length==4){
            if((triple[0]>='A'&&triple[0]<='E'&&
                    triple[1]>='1'&&triple[1]<='5'&&
                    triple[2]>='A'&&triple[2]<='E'&&
                    triple[3]>='1'&&triple[3]<='5')&&(
                    ((char)(triple[0]+2)==triple[2])||
                    ((char)(triple[2]+2)==triple[0])||
                    ((char)(triple[3]+2)==triple[1])||
                    ((char)(triple[1]+2)==triple[3]))){
                TripleFloat.setPlace(triple);
                you[triple[0]-65][triple[1]-'1'] = 1;
                you[triple[2]-65][triple[3]-'1'] = 1;
                a = 1;
                if (triple[0]==triple[2]){
                    you[triple[2]-65][triple[3]-1-'1'] = 1;
                }else{
                    you[triple[0]-65-1][triple[1]-'1'] = 1;
                }
            }else{
                System.out.println("Write in right form(A1A3)");
            }
        }
        else{
            System.out.println("Write in right form(A1A3)");
        }
        return a;
    }
    public int setDouble(char[] triple) {
        int a = 0;
        if ((triple.length == 4)){

            if ((triple[0] >= 'A' &&
                    triple[0] <= 'E' && triple[1] >= '1' &&
                    triple[1] <= '5' && triple[2] >= 'A' &&
                    triple[2] <= 'E' && triple[3] >= '1' &&
                    triple[3] <= '5')&&
                    (((char) (triple[0] + 1) == triple[2]) ||
                    ((char) (triple[2] + 1) == triple[0]) ||
                    ((char) (triple[3] + 1) == triple[1]) ||
                    ((char) (triple[1] + 1) == triple[3]))
        ){
            DoubleFloat.setPlace(triple);
            you[triple[0] - 65][triple[1] - '1'] = 1;
            you[triple[2] - 65][triple[3] - '1'] = 1;
            a = 1;
        }else{
                System.out.println("Write in right form(A1A2)");
            }
    }else{
            System.out.println("Write in right form(A1A2)");
        }
        return a;
    }
    public int setSingle(char[] triple){

        int a = 0;
        if(triple.length==2){
            if (triple[0]>='A'&&triple[0]<='E'&&
                    triple[1]>='1'&&triple[1]<='5'){
            SingleFloat.setPlace(triple);
            you[triple[0]-65][triple[1]-'1'] = 1;
            a = 1;
        }else{
                System.out.println("Write in right form(A1)");
            }
        }else{
            System.out.println("Write in right form(A1)");
        }
        return a;
    }
    public void attack(char[] triple){
        if(triple.length==2) {
            if (triple[0]>='A'&&triple[0]<='E'&&
                    triple[1]>='1'&&triple[1]<='5') {
                if (fbot[triple[0] - 65][triple[1] - '1'] == 0) {
                    fbot[triple[0] - 65][triple[1] - '1'] = -1;
                    if (bot[triple[0] - 65][triple[1] - '1'] == 1) {
                        fbot[triple[0] - 65][triple[1] - '1'] = 1;
                        checkb--;
                    } else {
                        int b = 0;
                        while (b == 0) {
                            int q = (int) (Math.random() * 6);
                            int w = (int) (Math.random() * 6);
                            if (you[q][w] != -1) {
                                if (you[q][w] == 1){
                                    checky--;
                                }
                                you[q][w] = -1;
                                b = 1;
                            }
                        }
                    }
                    bot[triple[0] - 65][triple[1] - '1'] = -1;
                }
            }else{
                System.out.println("you write incorectly or you attaced this place alredy");
            }
        }else{
            System.out.println("you write incorectly or you attaced this place alredy");
        }
    }
    public void printGraund(){
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print((char)(i+65)+" ");
                }
                if (this.you[i][j] == 0) {
                    System.out.print("- ");
                } else if (this.you[i][j] == 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print((char)(i+65)+" ");
                }
                if (this.fbot[i][j] == 0) {
                    System.out.print("- ");
                } else if (this.fbot[i][j] == 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
    public int status(){
        return this.checkb;
    }
    public int statusy(){
        this.SingleFloat.setLifeStatus(new Die());
        this.TripleFloat.setLifeStatus(new Die());
        this.DoubleFloat.setLifeStatus(new Die());
        this.DoubleFloat.sayYourStatus();
        this.TripleFloat.sayYourStatus();
        this.SingleFloat.sayYourStatus();
        return this.checky;
    }
}
