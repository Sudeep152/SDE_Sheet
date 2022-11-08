package Arrays;

public class Hello {
    public static void main(String [] args){

        System.out.println(remove("aabbccc"));

    }
    static boolean isPrimeString(String str)
    {int len = str.length(), n = 0;
        for (int i = 0; i < len; i++)
            n += (int)str.charAt(i);
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    static String remove(String s){

        String result = "";
        if (isPrimeString(s)){
            result= "MARY";
        }else {
            result=s;
        }

        return result;

    }
}
