package com.gevernova.generics.warehousemanagementsystem;

// concrete subclass
class Groceries extends WarehouseItem {

    // constructor
    public Groceries(String name){
        super(name);
    }

    // to get the type of item
    public String getType(){
        return "Groceries";
    }
}
