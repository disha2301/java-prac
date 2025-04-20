package com.gevernova.datastructure.linkedlist.singly.inventorymanagementsystem;

public class InventoryOperations {
    private InventoryItem head;

    // Add at beginning
    public void addFirst(InventoryItem item) {
        item.next = head;
        head = item;
    }

    // Add at end
    public void addLast(InventoryItem item) {
        if (head == null) {
            head = item;
            return;
        }

        InventoryItem temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = item;
    }

    // Add at position (1-based index)
    public void addAtPosition(InventoryItem item, int position) {
        if (position <= 1 || head == null) {
            addFirst(item);
            return;
        }

        InventoryItem temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        item.next = temp.next;
        temp.next = item;
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        InventoryItem prev = null, curr = head;
        while (curr != null && curr.itemId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }
    }

    // Update quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Item ID
    public void searchById(int id) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Search by Item Name
    public void searchByName(String name) {
        InventoryItem temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item with name \"" + name + "\" not found.");
    }

    // Calculate total value (price * quantity)
    public void calculateTotalValue() {
        double total = 0;
        InventoryItem temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Sort inventory (by item name or price)
    public void sortInventory(String criteria, boolean ascending) {
        head = mergeSort(head, criteria, ascending);
    }

    // Merge sort implementation
    private InventoryItem mergeSort(InventoryItem node, String criteria, boolean ascending) {
        if (node == null || node.next == null) return node;

        InventoryItem middle = getMiddle(node);
        InventoryItem nextToMiddle = middle.next;
        middle.next = null;

        InventoryItem left = mergeSort(node, criteria, ascending);
        InventoryItem right = mergeSort(nextToMiddle, criteria, ascending);

        return merge(left, right, criteria, ascending);
    }

    private InventoryItem getMiddle(InventoryItem head) {
        if (head == null) return head;

        InventoryItem slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private InventoryItem merge(InventoryItem left, InventoryItem right, String criteria, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (criteria.equalsIgnoreCase("price")) {
            condition = ascending ? left.price <= right.price : left.price >= right.price;
        } else { // sort by name
            condition = ascending
                    ? left.itemName.compareToIgnoreCase(right.itemName) <= 0
                    : left.itemName.compareToIgnoreCase(right.itemName) >= 0;
        }

        InventoryItem result;
        if (condition) {
            result = left;
            result.next = merge(left.next, right, criteria, ascending);
        } else {
            result = right;
            result.next = merge(left, right.next, criteria, ascending);
        }
        return result;
    }

    // Display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        InventoryItem temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    // Helper method
    private void printItem(InventoryItem item) {
        System.out.println("ID: " + item.itemId + ", Name: " + item.itemName +
                ", Quantity: " + item.quantity + ", Price: ₹" + item.price);
    }
}