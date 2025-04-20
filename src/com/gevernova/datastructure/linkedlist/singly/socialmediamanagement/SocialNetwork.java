package com.gevernova.datastructure.linkedlist.singly.socialmediamanagement;

public class SocialNetwork {
    private User head;

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + name);
    }

    // Find user by ID
    private User getUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection (both ways)
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Remove friend connection (both ways)
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
            System.out.println("Friend connection removed.");
        } else {
            System.out.println("Users not found.");
        }
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        User user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int id : user.friendIds) {
            User friend = getUserById(id);
            if (friend != null) {
                System.out.println("ID: " + friend.userId + ", Name: " + friend.name);
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Users not found.");
            return;
        }

        System.out.println("Mutual friends of " + user1.name + " and " + user2.name + ":");
        for (int id : user1.friendIds) {
            if (user2.friendIds.contains(id)) {
                User mutual = getUserById(id);
                if (mutual != null) {
                    System.out.println("ID: " + mutual.userId + ", Name: " + mutual.name);
                }
            }
        }
    }

    // Search by name or user ID
    public void searchUser(String keyword) {
        User temp = head;
        boolean found = false;
        while (temp != null) {
            if (String.valueOf(temp.userId).equals(keyword) || temp.name.equalsIgnoreCase(keyword)) {
                System.out.println("User Found → ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No user matched the search.");
    }

    // Count number of friends for each user
    public void countAllFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + " → Friends Count: " + temp.friendIds.size());
            temp = temp.next;
        }
    }
}
