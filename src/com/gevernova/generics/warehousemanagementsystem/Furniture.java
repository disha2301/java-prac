package com.gevernova.generics.warehousemanagementsystem;

// concrete subclass
class Furniture extends WarehouseItem {

    // constructor
    public Furniture(String name){
        super(name);
    }

    // get the item type
    public String getType(){
        return "Furniture";
    }
}
