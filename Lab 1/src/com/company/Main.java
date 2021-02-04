package com.company;
import java.lang.Math.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //question 1
//	System.out.println("Hello");
//        int rand = (int) (Math.random()*100) + 1;
        //question 2
//printing whether a random number between 1 and 100 is even or odd
//        if (rand%2 ==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        //question 2b
//        if (rand == 0){
//            System.out.println("Frozen");
//        }else if (rand <= 14){
//            System.out.println("Cold");
//        }else if (rand <= 24){
//            System.out.println("cool");
//        }else if (rand <= 40){
//            System.out.println("warm");
//        }else if (rand <= 60){
//            System.out.println("hot");
//        }else if (rand <= 80){
//            System.out.println("Very hot");
//        }else if (rand <= 99){
//            System.out.println("Extremely hot");
//        }else {
//            System.out.println("Boiling");
//        }

        //question 3
//        int rand = (int) (Math.random()*9) + 1;
//        if (rand == 1){
//            System.out.println("One");
//        }else if (rand == 2){
//            System.out.println("Two");
//        }else if (rand == 3){
//            System.out.println("Three");
//        }else if (rand == 4){
//            System.out.println("Four");
//        }else if (rand == 5){
//            System.out.println("Five");
//        }else if (rand == 6){
//            System.out.println("Six");
//        }else if (rand == 7){
//            System.out.println("Seven");
//        }else if (rand == 8){
//            System.out.println("Eight");
//        }else {
//            System.out.println("Nine");
//        }

        //question 4
//        int range = 3 - (-3);
//        int rand = 1;
//
//        do {
//            rand = (int) (Math.random() * range) + (-3);
//            System.out.println(rand);
//        }while(rand !=0);
//
//        //using while loop
//        while(rand != 0){
//            rand = (int) (Math.random() * range) + (-3);
//            System.out.println(rand);
//        }


        //question 5
        int count = 1;
        for (int i =1;i<=10;i++){
            for(int j=1;j<=12;j++){
                System.out.println(j + " X " + i + " = "+(j*i));
            }
            System.out.println("");
        }

        //question 6
//        int count =0;
//        while(count <6){
//            int rand = (int) (Math.random() * 49) + 1;
//            System.out.println(rand);
//            count++;
//        }

        //question 6b
//        int range = getInput();
//        int count = 0;
//        while(count <6){
//            int rand = (int) (Math.random() * 49) + 1;
//            System.out.println(rand);
//            count++;
//        }

   }

    private static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(num);
        return num;
    }
}
