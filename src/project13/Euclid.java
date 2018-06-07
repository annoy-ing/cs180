package project13;

public class Euclid {

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }



    public static double geometric(int N) {
        if (N < 1) return 0;
        else if (N == 1) return 1/Math.pow(2,0);
        else return geometric(N-1) + 1/Math.pow(2,N-1);
    }

    public static double basel(int N) {
        if (N < 1) return 0;
        else if (N == 1) return 1.0/Math.pow(1,2);
        else return basel(N-1) + 1/Math.pow(N,2);
    }

    public static String scramble(String s) {
        if (s.length() == 0) return "";
        else if (s.length() == 1) return s;
        else if (s.length() == 2) return String.valueOf(s.charAt(1) + s.charAt(0));
        else {

            String toReturn = String.valueOf(s.charAt(s.length()-1));
            toReturn += scramble(s.substring(1,s.length()/2));
            toReturn += scramble(s.substring(s.length()/2,s.length()-1));
            toReturn += String.valueOf(s.charAt(0));
            return toReturn;
        }
    }


    public static void main(String[] args) {
        System.out.println(scramble("computers"));
        String s = "computers";
        System.out.println(s.substring(1,s.length()/2));
        System.out.println(s.substring(s.length()/2, s.length()-1));
        System.out.println(String.valueOf(s.charAt(s.length()-1)));
        System.out.println(String.valueOf(s.charAt(0)));



    }

}
