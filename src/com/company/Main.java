package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;
        double num = (Math.random() * max) + 1;
        String strNum = Double.toString(num);
        System.out.println(strNum);

        strNum = strNum.substring(0,strNum.indexOf("."));
        System.out.println(strNum);

        int realNum = Integer.parseInt(strNum);
        System.out.println(realNum);
        //everything b4 this line establishes the num

        int right = 0;
        String guess = "";
        int realGuess = 0;

        while(right == 0)
        {
            System.out.println("What is your guess?");
            guess = input.nextLine();

            if(guess.length() == 0)
            {
                System.out.println("Please input a guess.");
            }
            else
            {
                realGuess = Integer.parseInt(guess);
                if(realGuess ==)
            }
        }


        input.close();
    }
}
