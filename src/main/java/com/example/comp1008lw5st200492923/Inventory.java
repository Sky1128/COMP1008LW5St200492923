package com.example.comp1008lw5st200492923;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Phone> phones;

    public Inventory (){
        phones = new ArrayList<Phone>();
    }

    public void addPhone(Phone obj1)
    {
        phones.add(obj1);
    }
    public int getNumOfPhoness()
    {
        int numberOfPhones = phones.size();
        return numberOfPhones;
    }
}
