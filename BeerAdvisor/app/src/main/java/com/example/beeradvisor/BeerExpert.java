package com.example.beeradvisor;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brends = new ArrayList<>();
        if(color.equals("amber")){
            brends.add("Jeck Amber");
            brends.add("Red Moose");
        }else{
            brends.add("Jane Pale Ale");
            brends.add("Gout Stout");
        }
        return brends;
    }
}
