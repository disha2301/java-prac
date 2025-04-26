package com.gevernova.generics.warehousemanagementsystem;

// abstract base class
abstract class WarehouseItem {
    private String name;

    // constructor
    public WarehouseItem(String name) {
        this.name = name;
    }
    // use of getter method
    public String getName(){
        return name;
    }
    public abstract String getType();

    @Override
    public String toString(){
        return getType()+" : "+name;
    }
}
