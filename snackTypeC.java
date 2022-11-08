package com.company;
//concrete classes
//The design pattern we are going to use is the factory method
import java.util.Scanner;

public class snackTypeC extends Products{

    snackTypeC()
    {
        noOfitem=3;
        priceOfitem = 20;
    }
    @Override
    void buyItem(Products p,String name) {
        inputState i=new inputState(p);
        despenseState d=new despenseState(p);
        int amount = i.input();
        d.despense(amount,name);


    }
}
