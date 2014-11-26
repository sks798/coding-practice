/**
 * 
 */
package com.kenshin;

import java.util.HashMap;

/**
 * @author sks
 *
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> past = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (past.get(diff) != null) {
                return new int[] { past.get(diff)+1, i+1 };
            }
            past.put(numbers[i], i);
        }
        return null;
    }
}
