package dsa.array;

import java.util.HashMap;
import java.util.Map;

class Two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lookup.put(nums[i], i);
            // We're overriding the index in case of duplicates, since we have to make
            // only 2 values, and it won't hurt in missing the first element's index,
            // when it's first encountered, i and the second index will be the pair.
        }

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (lookup.containsKey(complement) && (lookup.get(complement) != i)) {

                return new int[]{i, lookup.get(complement)};

            }

        }
        return new int[]{};

    }
}