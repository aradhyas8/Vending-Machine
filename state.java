package com.company;
//Design pattern here is State Pattern for different states that the Vending Machine is in.
public abstract class state {
    Products p;



   abstract int input();
    abstract void despense(int amount,String name);


}
