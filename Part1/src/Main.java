import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Problem1 p1= new Problem1();
        Problem2 p2= new Problem2();

        List<Integer> myList = new ArrayList<Integer>();

        // Adding elements to the List
        // Custom inputs
        myList.add(1);
        myList.add(2);
        myList.add(3);
        p1.recursion(myList,0,0);
        p2.combineLists(myList,myList);
    }
}