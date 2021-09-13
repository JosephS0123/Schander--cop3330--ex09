/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is the width of the room?" );
        int Width = uInput.nextInt();
        System.out.println("What is the length of the room?");
        int Length = uInput.nextInt();
        int Sqrf = (Length * Width);
        int Sqrf2 = Sqrf;
        int N = 0;
        while (Sqrf > 0){
            Sqrf = Sqrf - 350;
            N++;
        }
        System.out.println("You will need "+ N + " gallons of paint to cover "+ Sqrf2 + " square feet");
    }
}
