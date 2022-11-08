package com.company;
import java.util.HashMap;
//The design pattern we are going to use is the factory method
import java.util.Map;
import java.util.Map.Entry;

public class productrepo {

    HashMap<String,Products> availableProduct = new HashMap<>();//hash map that maps the string with the object
    Products p;//to get the value of object from hashmap
    productrepo()//constructor
    {
        snackTypeA snack1A = new snackTypeA();
        snackTypeA snack1B = new snackTypeA();
        snackTypeA snack1C = new snackTypeA();
        snackTypeB snack2A = new snackTypeB();
        snackTypeB snack2B = new snackTypeB();
        snackTypeB snack2C = new snackTypeB();
        snackTypeC snack3A = new snackTypeC();
        snackTypeC snack3B = new snackTypeC();
        snackTypeC snack3C = new snackTypeC();

        availableProduct.put("Kitkat",snack1A);
        availableProduct.put("Cupcakes",snack1B);
        availableProduct.put("Eclairs",snack1C);
        availableProduct.put("Coke",snack2A);
        availableProduct.put("Limca",snack2B);
        availableProduct.put("Pepsi",snack2C);
        availableProduct.put("Lays",snack3A);
        availableProduct.put("UncleChips",snack3B);
        availableProduct.put("Cheetos",snack3C);
    }

    void UserChoice(String name)
    {
      p = availableProduct.get(name);//get the right object
      p.buyItem(p, name);
    }

}
