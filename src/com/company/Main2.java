package com.company;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;
        String response = "";

        System.out.println("Think of a number from 1-100 and I will guess it...");
        System.out.println("For each response, type higher, lower, or correct.");
        System.out.println("");

        while(max-min>0)
        {
            if (max % 2 == 0)
            {
                System.out.println("Is your number " + (max/2) + "?");
            }
            else
            {
                System.out.println("Is your number " + ((max+1)/2) + "?");
            }

            response = input.nextLine();

            if(response.equals("lower"))
            {
                
            }
            else
            {
                if(response.equals("higher"))
                {

                }
                else
                {
                    if(response.equals("correct"))
                    {

                    }
                    else
                    {

                    }
                }
            }
        }

        input.close();
    }
}
