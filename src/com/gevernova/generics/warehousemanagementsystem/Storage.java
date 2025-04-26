package com.gevernova.generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }
    public List<T> getItems(){
        return items;
    }
}
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

