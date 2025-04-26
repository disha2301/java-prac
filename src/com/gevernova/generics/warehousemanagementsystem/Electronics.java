package com.gevernova.generics.warehousemanagementsystem;
// concrete subclass
class Electronics extends WarehouseItem{

    // constructor
    public Electronics(String name){
        super(name);
    }
    // to get type of item
    public String getType(){
        return "Electronics";
    }
}
