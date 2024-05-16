public class lcm {
    static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static int min(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    static int findlcm(int a,int b){
        int maximum = max(a,b);
        int minimum = max(a,b);
    int temp =0;
        for (int i = 1; i <=maximum/2 ; i++) {
            if(minimum*i == maximum){
                 temp = maximum;
            }else{
                temp=0;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int a=4;
        int b=6;
       int result = findlcm(a,b);
        if (result == 0) {
            System.out.println(a*b);
        }else{
            System.out.println(result);
        }
    }
}
