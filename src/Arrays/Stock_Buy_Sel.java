package Arrays;

public class Stock_Buy_Sel {
    public static void main(String[] args) {
int [] ar = {2,55,68,9,2};

        System.out.println(best_app(ar));
    }

    public int Naive_maxProfit(int[] prices) {

        int max = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }


        }
        return max;

    }
    public static int best_app(int []ar){

        int max=Integer.MIN_VALUE;
        int n = ar.length;
        int min = ar[0];
        for (int i =0; i< n;i++){
            if (min< ar[i]){
                min = ar[i];
            }
            int ans = ar[i] - min;

            max = Math.max(max,ans);


        }
        return max;

    }
}
