package com.company;
//The design pattern we are going to use is the factory method for different snack types
//this is the abstract class the function buy item is implemented in the base classes
public abstract class Products {
    int noOfitem;
    int priceOfitem;

    abstract void buyItem(Products p,String name);
}
