package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {}

    // Constructor if you want to pass in already initialized ArrayList
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set. 5 pts.
    public void clear() {
        set.clear();
    }

    // Returns the length of the set. 5 pts.
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     * This overrides the equals method from the Object class. 10 pts.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false. 5 pts.
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set. 5 pts.
    public int largest() throws Exception {
        if (set.isEmpty()) {
            throw new Exception("The set is empty.");
        }
        int max = set.get(0);
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Returns the smallest item in the set. 5 pts.
    public int smallest() throws Exception {
        if (set.isEmpty()) {
            throw new Exception("The set is empty.");
        }
        int min = set.get(0);
        for (int num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Adds an item to the set or does nothing if it's already there. 5 pts.
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there. 5 pts.
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union. 11 pts.
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
    }

    // Set intersection, all elements in s1 and s2. 12 pts.
    public void intersect(IntegerSet intSetb) {
        set.removeIf(num -> !intSetb.set.contains(num));
    }

    // Set difference, i.e., s1 - s2. 12 pts.
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1. 11 pts.
    public void complement(IntegerSet intSetb) {
        // Placeholder for complement logic (not fully specified in the prompt)
    }

    // Returns true if the set is empty, false otherwise. 5 pts.
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. This overrides the toString method from Object class. 5 pts.
    @Override
    public String toString() {
        return set.toString();
    }
}
