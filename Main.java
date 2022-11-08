package com.company;
import java.util.Scanner;
//The design pattern we are going to use is the singleton for the Client
public class Main {

    public static void main(String[] args)
    {
        productrepo p1 = new productrepo();
        while(true)
        {
            Scanner myObj = new Scanner(System.in);
            String choice;//take the input of the product from the user
            System.out.println("----------------------WELCOME TO VENDING MACHINE-----------------------\n\n");
            System.out.println("--> WE HAVE PRODUCTS Kitkat , Pepsi , Cupcakes, Limca, Lays, UncleChips, Cheetos, Coke, Eclairs");//show options
            System.out.print("--> INPUT : ");
            choice = myObj.nextLine();
            p1.UserChoice(choice);
            System.out.print("\n\n\n");




        }




    }
}
