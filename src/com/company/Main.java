package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 10;

        double num = (Math.random() * max) + 1;
        String realNum = Double.toString(num);

        realNum = realNum.substring(0,realNum.indexOf("."));
        //everything b4 this line establishes the num

        boolean right = false;
        String guess = "";

        while(!(right))
        {
            System.out.println("What is your guess? (" + min + "-" + max + ")");
            guess = input.nextLine();

            if(guess.length() == 0)
            {
                System.out.println("Please input a guess.");
            }
            else
            {
                System.out.println();
                if(guess.equals(realNum))
                {
                    System.out.println("You got it!");
                    right = true;
                }
                else
                {
                    System.out.println("Try Again.");
                }
            }
        }

        input.close();
    }
}
