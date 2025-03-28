public class Problem3 {
    public static void printFibonacci() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
