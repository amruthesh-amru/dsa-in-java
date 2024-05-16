class Main {
    public void isPalindrome(int x) {
        int rev=0;
        while(x>0){
            int lastDig = x%10;
            rev= (rev*10)+lastDig;
            x=x/10;
        }

        if(rev==x){
            System.out.println("yes");
        }
    }
    public int max(int m,int n) {
        if(m>n){
            return m;
        }else{
            return n;
        }
    }
    public void gcd(int n,int m){
        while(n>0 && m>0){
            if(m>n){
                m=m%n;
            }else{
                n=n%m;
            }
            if(m==0){
                System.out.println("GCD="+n);
            }else{
                System.out.println("GCD="+m);
            }
        }
    }
    public void armstrong(int n){
        int temOriginal =n;
        int armStrong = 0;
        int temp=0;
        int noOfDigits = (int) (Math.log10(n)+1);
        while(n>0){
            int lastDig = n%10;
            n= n/10;
             temp =(int)Math.pow( lastDig,noOfDigits);
            armStrong += temp;
        }
        System.out.println(armStrong);
        if(armStrong==temOriginal){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    public  int sumOfAllDivisors(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    sum = sum +j;
                }
            }
        }
        return sum;
    }
    public  boolean isPrime(int num) {
        int count = 0;
        int i=1;
        while(i<=num){
            if(num%i== 0){
                count++;
            }
            i++;
        }
        if(count==2){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Main obj = new Main();
//       obj.isPalindrome(121);
//        obj.gcd(52,2);
//        obj.armstrong(371);
//        System.out.println(obj.sumOfAllDivisors(5));
        System.out.println(obj.isPrime(5));
    }
}