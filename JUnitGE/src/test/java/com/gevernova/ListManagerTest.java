package com.gevernova;

import com.gevernova.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setUp(){
        manager = new ListManager();
        list = new ArrayList<>();
    }
    @Test
    void testAddElement(){
        manager.addElement(list, 5);
        manager.addElement(list, 10);
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
        assertEquals(2, manager.getSize(list));
    }

    @Test
    void testRemoveElement(){
        list.add(1);
        list.add(2);
        list.add(3);
        manager.removeElement(list,2);
        assertFalse(list.contains(2));
        assertEquals(2, manager.getSize(list));
    }
    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));
        list.add(100);
        assertEquals(1, manager.getSize(list));
    }
}
