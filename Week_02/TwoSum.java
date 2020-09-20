package myleetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数字之和 leetcode 1
 *
 * @author shanmingda
 * @date 2020-09-13 22:51
 */
public class TwoSum {

    // Hash
    public int[] getTwoNumSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= nums.length; i++) {
            int needNum = target - nums[i];
            if (map.containsKey(needNum)) {
                return new int[]{map.get(needNum), i};
            }
            map.put(nums[i], i);
        }
        return new int [] {-1, -1};
    }

}
