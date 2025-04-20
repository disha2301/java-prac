package com.gevernova.datastructure.linkedlist.singly.socialmediamanagement;

public class SocialMediaManagement {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        network.addUser(1, "Alice", 22);
        network.addUser(2, "Bob", 24);
        network.addUser(3, "Charlie", 23);
        network.addUser(4, "Disha", 21);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(3, 4);

        network.displayFriends(1);
        network.displayFriends(3);

        network.findMutualFriends(1, 2);

        network.searchUser("Disha");
        network.searchUser("3");

        network.countAllFriends();

        network.removeFriendConnection(1, 3);
        network.displayFriends(1);
    }
}
