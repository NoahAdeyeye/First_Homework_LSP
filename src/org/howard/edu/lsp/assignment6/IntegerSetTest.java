package org.howard.edu.lsp.assignment6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IntegerSetTest {
    private IntegerSet set1;
    private IntegerSet set2;

    @Before
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    public void testLength() {
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
    }

    @Test
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    public void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    public void testLargest() {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        try {
            assertEquals(3, set1.largest());
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown for non-empty set.");
        }
    }

    @Test
    public void testSmallest() {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        try {
            assertEquals(1, set1.smallest());
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown for non-empty set.");
        }
    }

    @Test
    public void testAdd() {
        set1.add(1);
        set1.add(1);
        assertEquals(1, set1.length());
    }

    @Test
    public void testRemove() {
        set1.add(1);
        set1.remove(1);
        assertFalse(set1.contains(1));
    }

    @Test
    public void testUnion() {
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(1));
    }

    @Test
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    public void testToString() {
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString());
    }

    @Test(expected = IntegerSetException.class)
    public void testLargestException() throws IntegerSetException {
        set1.largest();
    }

    @Test(expected = IntegerSetException.class)
    public void testSmallestException() throws IntegerSetException {
        set1.smallest();
    }
}
