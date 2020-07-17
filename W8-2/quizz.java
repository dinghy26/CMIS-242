
/**
 * quizz
 */
import java.util.*;

public class quizz {

    public static int recurse(int n) {
        if (n <= 1)
            return 1;
        else
            return n + recurse(n - 2);
    }

    public static void recurses(int n) {
        if (n <= 0) {
            System.out.print(n % 10);
            recurse(n / 10);
        }
    }

    public static int countDown(int n, int result) {
        if (n == 0)
            return 0;
        else
            return countDown(n - 1, n + result);
    }

    public static void main(String[] args) {
        System.out.println(recurse(6));
        //recurses(1234);
        System.out.println(countDown(2, 0));

        // Initializing a list of type arraylist
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(10);
        // System.out.println(l);

        // Initializing a collection to be appended to list
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100);
        arr.add(20);
        arr.add(300);
        // System.out.println(arr);

        l.addAll(arr);

        // System.out.println(l);

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("red");
        list.add("red");

        String element = "red";
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(element))
                list.remove(element);
        }
        // System.out.println(list);
    }

}