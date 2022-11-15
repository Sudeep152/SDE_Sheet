package Arrays;

import java.util.Arrays;

public class Sort_1s_2S {
    public static void main(String [] args){



    }
    static  void naiveApp(int [] arr){
        Arrays.sort(arr);
    }
    static void  bestApp(int [] nums){
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }

    }
}
