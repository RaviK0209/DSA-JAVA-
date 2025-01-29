import java.util.Arrays;

class SumCloset {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2], n = nums.length;
        for (int i = 0; i < n; i++) {
            int comp = target - nums[i], j = i + 1, k = n - 1;
            while (j < k) {
                int curr = nums[j] + nums[k] + nums[i];
                if (Math.abs(curr - target) < Math.abs(ans - target)) ans = curr;
                if (nums[j] + nums[k] == comp) return ans;
                else if (nums[j] + nums[k] > comp) k--;
                else j++;
            }
        }
        return ans;
    }
}