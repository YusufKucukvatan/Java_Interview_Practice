package JavaSolutions;

public class ArrayWaysToSplit
{
    public static void main(String[] args) {
        // https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 2, 2, 2, 5, 0};
        System.out.println("waysToSplit = " + waysToSplit(nums2));
    }

    static int waysToSplit(int[] nums)
    {
        int n = nums.length;
        int ans = 0;

        for (int i = 1; i < n; ++i) {
            nums[i] += nums[i - 1];
        }

        for (int i = 0, j = 0, k = 0; i < n - 2; ++i) {
            while (j <= i || (j < n - 1 && nums[j] < nums[i] * 2)) {
                j++;
            }
            while (k < j || (k < n - 1 && nums[k] - nums[i] <= nums[n - 1] - nums[k])) {
                k++;
            }
            ans = (ans + k - j) % 1000000007;
        }
        return ans;
    }

    public int waysToSplit2(int[] nums) {

        int MOD = (int) (1e9 + 7);

        int N = nums.length;

        // prefix array
        int[] A = new int[N];
        A[0] = nums[0];
        for (int i = 1; i < N; ++i) A[i] = A[i - 1] + nums[i];

        int res = 0;
        for (int i = 1; i < N - 1; ++i) {

            if (A[i - 1] > (A[N - 1] - A[i - 1]) / 2) break;  // early termination

            int left = helper(A, A[i - 1], i, true);
            int right = helper(A, A[i - 1], i, false);

            if (left == -1 || right == -1) continue;  // none is satisfied

            res = (res + (right - left + 1) % MOD) % MOD;
        }

        return res;
    }

    private int helper(int[] A, int leftSum, int index, boolean searchLeft) {

        int N = A.length;
        int l = index, r = N - 2;
        int res = -1;

        while (l <= r) {

            int m = (r - l) / 2 + l;
            int midSum = A[m] - A[index - 1];
            int rightSum = A[N - 1] - A[m];

            if (leftSum <= midSum && midSum <= rightSum) {
                res = m;
                if (searchLeft) r = m - 1;
                else l = m + 1;
            } else if (leftSum > midSum) {  // shrink left
                l = m + 1;
            } else {  // shrink right
                r = m - 1;
            }

        }

        return res;
    }

    static int findCount(int arr[], int n)
    {

        // Stores the prefix sums
        int[] prefix_sum = new int[n];

        prefix_sum[0] = arr[0];

        for (int i = 1; i < n; i++)
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];

        // Stores the suffix sums
        int[] suffix_sum = new int[n];

        suffix_sum[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--)
            suffix_sum[i]
                = suffix_sum[i + 1] + arr[i];

        int s = 1, e = 1;
        int curr_subarray_sum = 0, count = 0;

        // Traverse the given array
        while (s < n - 1 && e < n - 1) {

            // Updating curr_subarray_sum until
            // it is less than prefix_sum[s-1]
            while (e < n - 1
                && curr_subarray_sum
                < prefix_sum[s - 1]) {
                curr_subarray_sum += arr[e++];
            }

            if (curr_subarray_sum <= suffix_sum[e]) {
                // Increase count
                count++;
            }

            // Decrease curr_subarray_sum by arr[s[]
            curr_subarray_sum -= arr[s++];
        }

        // Return count
        return count;
    }

}
