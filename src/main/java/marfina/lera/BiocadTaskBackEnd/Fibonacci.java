package marfina.lera.BiocadTaskBackEnd;

public class Fibonacci {
    //task 1
    public static String fibonacci(int n) {
        int helper0 = 1;
        int helper1 = 1;
        int total;
        String totalStr = helper0 + " " + helper1 + " ";
        System.out.print(helper0 + " " + helper1 + " ");
        for (int i = 3; i <= 11; i++) {
            total = helper0 + helper1;
            totalStr = totalStr + total + " ";
            System.out.print(total + " ");
            helper0 = helper1;
            helper1 = total;
        }
        return totalStr;
    }
}
