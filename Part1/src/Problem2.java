import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public void combineLists(List list1, List list2){
        List combinedList= new ArrayList();
        for(int i=0;i<list1.size();i++){
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));

        }

        System.out.println(combinedList);
    }
}
