package com.github.nikolaybespalov.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @see <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/">380. Insert Delete GetRandom O(1)</a>
 */
public class A380InsertDeleteGetRandomO1 {
    public static class RandomizedSet {

        private final HashMap<Integer, Integer> map = new HashMap<>();
        private final ArrayList<Integer> array = new ArrayList<>();
        private final Random random = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                array.add(val);
                map.put(val, array.size() - 1);

                return true;
            }

            return false;
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int i = map.get(val);

                if (i == array.size() - 1) {
                    map.remove(val);
                    array.remove(array.size() - 1);

                    return true;
                }

                int tmp = array.get(array.size() - 1);
                array.set(i, tmp);
                array.remove(array.size() - 1);

                map.remove(val);
                map.remove(tmp);
                map.put(tmp, i);

                return true;
            }

            return false;
        }

        public int getRandom() {
            int i = random.nextInt(array.size());

            return array.get(i);
        }
    }
}
