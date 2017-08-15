package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int n = 100;
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime");
            }
        }

        System.out.println(clock(11, 30) + " degrees");

        //System.out.println(reverseStr("MIKEY"));
        reverseStr("MIKEY");

        palindrome("RACE carZ");
        //System.out.println(palindrome("RACE car"));

        intersect(new int[]{7,1,5,2,3,6}, new int[]{0,2,4,3,6,7});
    }

        // know that all primes can only be divided by 1 and itself
        // so it can't be even, so our condition would look something like n / n
        // prime is also greater than 1
        // this means that the initialization of my iterations must be greater than 1

        // optimization
            // Math.sqrt(n) to reduce numbers of loops
            // if you start plugging n = 100000, you'll start noticing processing is slower
            // since we're not iterating 1 anyway, there's no need to process it
                // to stop that we can say if (n == 1) { return false}
                // again, reducing unnecessary processes can speed up our code
    public static boolean isPrime(int num){
        for (int i = 2; i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double clock(double hr, double min){
        // know that 60min is 30d in hour hand and therefore, each min is .5d
        // know that 5min is 30d in min hand and therefore, each min is 6d
            // hr * 60m = total degrees
        double hrHand = (hr * 60) * .5;
        hrHand += min * .5;
        double minHand = min * 6;
        double total = hrHand - minHand;
        return total;

        // optimization
            // false logic in determining total. you have to find absolute value
                // Math.abs(hrHand - minHand);
    }

    public static void reverseStr(String str){
        StringBuffer rStr = new StringBuffer(str);
        System.out.println(rStr.reverse().toString());
    }

    public static boolean palindrome(String str){
        // convert entire string to lower case and get rid of all whitespace for accurate condition
        str = str.toLowerCase().replaceAll(" ", "");
        // StringBuffer for reverse method
        StringBuffer rStr = new StringBuffer(str);
        if (rStr.reverse().toString().equals(str)){
            System.out.println("TRUE!!!!");
            return true;
        } else {
            System.out.println("FALSE!!!");
            return false;
        }
    }

    public static void intersect(int[] arr1, int [] arr2){
        List<Integer> intersectArray = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    intersectArray.add(arr1[i]);
                }
            }
        }
        System.out.println(intersectArray);
    }
}
