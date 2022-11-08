package com.company;
//concrete classes
//The design pattern we are going to use is the factory method
import java.util.Scanner;

public class snackTypeA extends Products {
    snackTypeA()
    {
        noOfitem=3;
        priceOfitem = 15;
    }
    @Override
    void buyItem(Products p,String name) {

        inputState i=new inputState(p);
        despenseState d=new despenseState(p);
        int amount = i.input();
        d.despense(amount,name);


    }

}

