package Arrays;

public class Maximum_Subarray {
    public  static void main(String  [] args){

        int  [] arr= {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));

    }
    static public int maxSubArray(int[] nums) {
          int max = Integer.MIN_VALUE;
          int   n = nums.length;
          for (int i =0; i<n;i++){
              for (int j=i;j<n;j++){
                  int sum =0;
                  for (int k =i;k<=j;k++)
                      sum = sum+nums[k];
                  max = Math.max(max,sum);
              }

          }
          return max;
    }
}
