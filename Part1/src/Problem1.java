import java.util.List;

public class Problem1 {
    public void forloop(List<Integer> list){
        int sum=0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        System.out.println("Sum is "+sum);
    }

    public void whileloop(List<Integer> list){
        int sum=0;
        int i=0;
        while (i<list.size()){
            sum=sum+list.get(i);
            i++;
        }
        System.out.println("Sum is "+sum);
    }

    public void recursion(List<Integer> list, int index, int sum) { //Need to pass 0 for index and sum initially
        sum = sum + list.get(index);

        if (index < list.size() - 1) {
            index++;
            recursion(list, index , sum);
        } else {
            System.out.println("Sum is "+sum);
        }
    }

}
