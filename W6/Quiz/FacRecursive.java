

public class FacRecursive {


    public static String computeRecursiveResult(int n) {
        if (n == 1) {
            return String.valueOf(n);
        }
            
        else {
            return "Recursive triangular number sequence of "+ n + " = \n" + computeRecursiveResult(n - 1)  + n;
        }
            
    }


    public static String computeIterativelyResult(int stop) {
        int n1 = 0;

        for (int i = 1; i <= stop; i++) {

            n1 += i;

        }
        return "Iterative = " + String.valueOf(n1);
    }


    public static void main(String[] args) {
    
        System.out.println(computeIterativelyResult(4));
        System.out.println("------------------------");
        System.out.println(computeRecursiveResult(4));

        

        

    }
}