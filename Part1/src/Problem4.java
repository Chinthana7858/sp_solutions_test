import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public void largestpossible(List<Integer> list){
        List<Integer> numberlist= new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int element=list.get(i);
            while (i>9){
                numberlist.add(element%10);
                element=element/10;
            }
        }


    }
}
