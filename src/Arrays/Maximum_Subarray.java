package Arrays;

public class Maximum_Subarray {
    public  static void main(String  [] args){

        int  [] arr= {7,1,5,3,6,4};

        System.out.println(maxSubArray(arr));
        System.out.println(maxAdavance(arr));

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

    static  int maxAdavance(int [] arr){

        int max =arr[0];
        int sum =0;

        for (int i =0; i< arr.length;i++){
            sum = sum+arr[i];
            if (sum>max){
                max = sum;
            }
            if(sum < 0){
                sum =0;
            }

        }
        return  max;

    }
}
