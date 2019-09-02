package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RedBlackTreeTest {

    List<Integer> master;
    RedBlackTree<Integer> tree;


    @BeforeEach
    void setUp() {
        tree = new RedBlackTree<Integer>();
    }

    @AfterEach
    void tearDown() {
        tree.makeEmpty();
    }

    @Test
    void insert() {
        for( int i = 1; i < 10; i++)
            tree.insert( i );

        assertTrue(tree.contains(8));
        assertFalse(tree.contains(50));
    }

    @Test
    void remove() {
        try{
            tree.insert(1);
            tree.insert(2);
            tree.insert(3);
            tree.remove(1);
            assertTrue(tree.contains(2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @Test
    void findMin() {
        int min;
        try {
            for( int i = 1; i < 10; i++)
                tree.insert( i );
            min = tree.findMin();
            assertEquals(tree.findMin(), 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    void findMax() {
        int max;
        try {
            for( int i = 1; i < 10; i++)
                tree.insert( i );
            max = tree.findMax();
            assertEquals(tree.findMax(), 9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void contains() {
        for (int j = 0; j < 10; j++) {
            assertFalse(tree.contains(j));
            tree.insert(j);
            assertTrue(tree.contains(j));
        }
    }

    @Test
    void makeEmpty() {
        assertTrue(tree.isEmpty()== true);
        assertFalse(tree.isEmpty()== false);
    }

    @Test
    void printTree() {

        for( int i = 1; i < 10; i++)
            tree.insert( i );

        tree.printTree();
        assertFalse(tree.isEmpty()== true);

    }

    @Test
    void isEmpty() {
        assertTrue(tree.isEmpty());
        tree.insert(1);
        assertFalse(tree.isEmpty());
    }
}
