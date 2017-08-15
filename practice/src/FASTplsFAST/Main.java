package FASTplsFAST;

public class Main {

    public static void main(String[] args) {
        clock(3, 15);

        isPrime (100);
        //isPrimeBl(100);
        //strReverse("mikey");
        //palindrome("RACECAR");
//        for (int i = 2; i < 100; i++){
//            if(isPrimeTest(i)){
//                System.out.println(i + " is a prime.");
//            }
//        }
//        for (int i = 2; i < 100; i++){
//            if(isPrimeAlternative(i)){
//                System.out.println(i + " is a Altprime.");
//            }
//        }
    }

    public static void clock(double hr, double min){
        double hrHand = (hr * 60) * .5;
        hrHand += min * .5;
        double minHand = min * 6;
        double total = Math.abs(minHand - hrHand);
        System.out.println(total);
    }

    public static void isPrime(int num){
        for (int i = 2; i < num; i++){
            int primeTest = 1; // reset holding variable
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    primeTest = 0; // change holding variable to 0 when not prime
                    break;
                }
            }
            if (primeTest == 1){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeTest(int num){
        // this code is fine with num = 1000, but it's technically bad if you try worst case like 1000000.
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false; //because primes are divisible of 1 and itself therefore any other divisible is false
            }
        }
        return true;
    }

    public static boolean isPrimeAlternative(int num){
        if(num == 1){
            return false; // to avoid processing immediately as we won't even utilize it
        }
        for (int i=2; i <= Math.sqrt(num) ; i++){ // this will speed up the processing as it doesn't go into as much loops
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

//    public static boolean isPrimeBl(int num){
//        for (int i = 2; i <= num; i++){
//            System.out.println("Looping: " + i);
//            if (num % i == 0){
//                System.out.println(num + " is not a prime.");
//                return false;
//            }
//        }
//        System.out.println(num + " is a prime number.");
//        return true;
//    }

//    public static void strReverse(String str){
//        StringBuffer rString = new StringBuffer(str);
//        rString.reverse();
//        System.out.println(rString);
//    }
//
//    public static boolean palindrome(String str){
//        String rString = new StringBuffer(str).reverse().toString();
//        if (str.equals(rString)){
//            System.out.println(str + " does equal to " + rString);
//            return true;
//        } else {
//            System.out.println(str + " does NOT equal to " + rString);
//            return false;
//        }
//    }
}
