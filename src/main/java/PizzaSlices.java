/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
import java.io.PrintStream;

public class PizzaSlices {

    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();
        System.out.printf(people + " people with " + pizza + " pizzas (%s slices)\n", pizza * slices);

        int slicesPerPerson = (int)(pizza * slices / people);
        int slicesLeftover = pizza * slices % people;

        output.printf("Each person gets %d piece%s of pizza.\n", slicesPerPerson, slicesPerPerson == 1? "": "s");
        if (slicesLeftover == 1)
            output.println("There is 1 leftover piece.");
        else
            output.printf("There are %d leftover pieces.\n", slicesLeftover);

        input.close();
    }
}

