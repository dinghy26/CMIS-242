
//import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class discW8 {
    
    public static void main(String[] args) {
        
        ArrayList <String> arrayL = new ArrayList<>();
        LinkedList <String> linkL = new LinkedList<>();

        arrayL.add("A");
        arrayL.add("B");
        arrayL.add("C");
        arrayL.add("A");

        System.out.println(arrayL);

        // it only remove the first Occurrence of the string
        arrayL.remove("A");
        arrayL.add(arrayL.size() , "I just add this message to the end!");

        System.out.println(arrayL);

        System.out.println("_____________________");

        linkL.add("A");
        linkL.add("B");
        linkL.add("C");
        linkL.add("A");

        System.out.println(linkL);

        linkL.addFirst("Add to the start point");
        //remove last without indexing
        linkL.removeLast();
        // add to last without indexing
        linkL.addLast("I remove the last letter and add this message!!");
        

        System.out.println(linkL);
    }
}