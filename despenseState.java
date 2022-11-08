package com.company;
//Dispense State
import java.util.Scanner;

public class despenseState extends state{
    despenseState(Products p1)
    {
        this.p = p1;
    }

    @Override
    int input() {

        int amount;
        Scanner myObj = new Scanner(System.in);
        System.out.println("--> PLEASE DEPOSIT YOUR MONEY , YOUR SELECTION WILL CAUSE 15 DOLLARS");//show options
        System.out.print("--> INPUT : ");
        amount = myObj.nextInt();
        return amount;
    }

    @Override
    void despense(int amount, String name) {
        System.out.printf("\n--> WE HAVE %d ITEM OF %s IN STOCK ", p.noOfitem,name);
        if(p.noOfitem > 0 && amount == p.priceOfitem )
        {
            System.out.printf("\n\n-->THANKS FOR PURCHASING %s, YOU PROVIDED %d , NO CHANGE NEEDED \n\n",name,amount);
            System.out.printf("______________________________________________________________________________");
            p.noOfitem--;

        }
        else if(p.noOfitem > 0 && amount > p.priceOfitem )
        {
            int change = amount - p.priceOfitem;
            System.out.printf("\n\n-->THANKS FOR PURCHASING %s, YOU PROVIDED %d , AND YOUR CHANGE IS %d \n\n",name,amount,change);
            System.out.printf("______________________________________________________________________________");
            p.noOfitem--;

        }
        else if(p.noOfitem > 0 && amount < p.priceOfitem )
        {

            System.out.printf("\n\n-->%s CANNOT BE PURCHASED INSUFFICIENT FUNDS, YOU PROVIDED %d WHICH IS RETURNED \n\n",name,amount);
            System.out.printf("______________________________________________________________________________");

        }
        else if(p.noOfitem <= 0  )
        {

            System.out.printf("\n\n-->THE PRODUCT IS NOT AVAILABLE , YOUR MONEY IS RETURNED : %d \n\n",amount);
            System.out.printf("______________________________________________________________________________");

        }

    }
}
