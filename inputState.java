package com.company;
//input State
import java.util.Scanner;

public class inputState extends state {
    inputState(Products p1)
    {
        this.p = p1;
    }

    @Override
    int input() {

        int amount;
        Scanner myObj = new Scanner(System.in);
        System.out.printf("\n--> PLEASE DEPOSIT YOUR MONEY , YOUR SELECTION WILL CAUSE %d DOLLARS",p.priceOfitem);//show options
        System.out.print("\n--> INPUT : ");
        amount = myObj.nextInt();
        return amount;
    }

    @Override
    void despense(int amount,String name) {

    }

}
