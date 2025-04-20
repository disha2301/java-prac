package com.gevernova.datastructure.linkedlist.singly.socialmediamanagement;
import java.util.*;
public class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // List of User IDs that this user is friends with
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
