package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DequeTest {

    private Deque<String> strDeque;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        strDeque = new Deque<String>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        strDeque.clear();
    }

    @org.junit.jupiter.api.Test
    void clear() {
        strDeque.addFront("B");
        assertTrue(strDeque.size() == 1);
        strDeque.clear();
        assertTrue(strDeque.size() == 0);
    }

    @org.junit.jupiter.api.Test
    void size() {
        //System.out.println("size test case running correctly");
        assertTrue(strDeque.size() == 0);
        strDeque.addFront("1");
        assertTrue(strDeque.size()==1);
        strDeque.addFront("2");
        assertTrue(strDeque.size()==2);
    }

    @org.junit.jupiter.api.Test
    void addFront() {
        strDeque.addFront("B");
        strDeque.addFront("A");
        assertTrue(strDeque.peekFront()=="A");
        assertTrue(strDeque.peekBack()=="B");
    }

    @org.junit.jupiter.api.Test
    void addBack() {
        strDeque.addBack("B");
        strDeque.addBack("A");
        assertTrue(strDeque.peekBack()=="A");
        assertTrue(strDeque.peekFront()=="B");
    }

    @org.junit.jupiter.api.Test
    void peekFront() {
        assertTrue(strDeque.peekFront()== null);
        strDeque.addFront("D");
        assertTrue(strDeque.peekFront()== "D");
    }

    @org.junit.jupiter.api.Test
    void peekBack() {
        assertTrue(strDeque.peekBack()== null);
        strDeque.addBack("Z");
        assertTrue(strDeque.peekBack()== "Z");
    }

    @org.junit.jupiter.api.Test
    void removeFront() {
        strDeque.addFront("D");
        strDeque.addFront("E");
        strDeque.removeFront();
        assertTrue(strDeque.contains("D"));
        strDeque.removeFront();
        assertTrue(strDeque.size() == 0);
        assertFalse(strDeque.contains("E"));
    }

    @org.junit.jupiter.api.Test
    void removeBack() {
        strDeque.addBack("X");
        strDeque.addBack("Y");
        strDeque.removeBack();
        assertTrue(strDeque.contains("X"));
        strDeque.removeBack();
        assertTrue(strDeque.size() == 0);
        assertFalse(strDeque.contains("S"));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        strDeque.addFront("D");
        strDeque.addBack("X");
        strDeque.addFront("P");
        assertTrue(strDeque.contains("D"));
        assertFalse(strDeque.contains("S"));
    }
}