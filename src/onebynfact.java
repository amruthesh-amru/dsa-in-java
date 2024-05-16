public class onebynfact {

        static int fact(int n){
            int temp =1;
            for (int i = 1; i <= n; i++) {
                temp=temp*i;
            }
            return temp;
        }

    public static void main(String[] args) {
        int num = 5;
        double result = fact(num);
        double finalResult = 1/result;
        System.out.println("result = "+finalResult);
    }
}
