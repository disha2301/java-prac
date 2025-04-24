package com.gevernova.collection.list.duplicateremoval;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space separated numbers");
        String str = sc.nextLine();
        String[] token = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String num : token ){
            list.add(Integer.parseInt(num));
        }
        // removing duplicates using LinkedHashSet to preserve insertion order
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(uniqueSet);
        System.out.println("List after removing duplicates: " + result);

    }
}
