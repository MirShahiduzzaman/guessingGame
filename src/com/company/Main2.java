package com.company;

import java.util.Scanner;

//ask if I should do anything if on last num and user still puts lower or higher
//ex: only num left to guess is 1, but user still puts higher or lower

public class Main2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        int min = 0;
        int max = 10;

        int range = max-min;
        String response = "";

        System.out.println("Think of a number from 1-100 and I will try to guess it...");
        System.out.println("For each response, type higher, lower, or correct.");
        System.out.println();

        while(range>=0)
        {
            if(range%2 !=0)
            {
                System.out.println("Is your number " + (((max + min + 1) / 2)) + "?");
            }
            else
            {
                System.out.println("Is your number " + (((max + min) / 2)) + "?");
            }
            //guess number

            response = (input.nextLine()).toLowerCase();
            //lower case result

            //check response
            //if need to check if last num, use if range<=1, then print Oh I got ur number! Its __. Then end the game.
            // Else do the code after this comment
            if(range<=1)
            {
                System.out.println("I know your number now! Its " + ((max + min) / 2) + ".");
                range = -1;
            }
            else
            {
                if (response.equals("lower")) //lower means change max
                {
                    if (range % 2 != 0) {
                        max = ((max + min + 1) / 2);
                    } else {
                        max = ((max + min) / 2);
                    }
                    System.out.println();

                    range = max - min;
                }
                else
                {
                    if (response.equals("higher")) //higher means change min
                    {
                        if (range % 2 != 0) {
                            min = ((max + min + 1) / 2);
                        } else {
                            min = ((max + min) / 2);
                        }
                        System.out.println();

                        range = max - min;
                    } else {
                        if (response.equals("correct")) {
                            System.out.println("Yay!");
                            range = -1;
                        } else {
                            System.out.println("For each response, type higher, lower, or correct.");
                        }
                    }
                }
            }
        }

        input.close();
    }
}
