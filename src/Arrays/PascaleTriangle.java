package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascaleTriangle {
    public  static  void main(String [] args){

         List<List<Integer>> asn = generate(5);
         System.out.println(asn);

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer= new ArrayList<>();
        List<Integer>row =new ArrayList<>();

        for (int i =0;i<numRows;i++){
           List<Integer> temp= new ArrayList<>();
            for (int j =0; j<=i;j++){
                if (j==0|| j==i){
                    temp.add(1);
                }else {
                    temp.add(row.get(j)+row.get(j-1));
                }
            }
            row = temp;
            answer.add(row);

        }



        return answer;
    }
}
