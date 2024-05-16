public class pascalTriangle {
    //first variation to find a particular number with row and col
//    static  long nCr(int n,int r){
//        long res=1;
//        for (int i = 0; i < n-r; i++) {
//            res = res * (n-i);
//            res = res/(i+1);
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int n=6,r=5;
//               long result = nCr(n-1,r-1);
//                System.out.print(result );
//        }
//    }
    //second variation brute solution to find the entire row by using row number
//   static  long nCr(int n,int r){
//       long res=1;
//        for (int i = 0; i < n-r; i++) {
//            res = res * (n-i);
//            res = res/(i+1);
//        }
//        return res;
//   }
//
//    public static void main(String[] args) {
//       int n=6,r=5;
//        long result=0;
//        for (int i = 1; i <= n; i++) {
//            if(i==1 || i==n){
//                System.out.print(1+" ");
//            }else{
//                 result = nCr(n-1,i-1);
//        System.out.print(result + " ");
//            }
//        }
//    }

//    public static void main(String[] args) {
//
//    }

    //optimal solution for variation 2
//    public static void main(String[] args) {
//        int n=6;
//        int res=1;
//        for(int i=0;i<n;i++){
//            if(i==0 || i==n-1){
//                System.out.print(1+" ");
//            }else{
//                res = res * (n-i);
//                res = res /i;
//                System.out.print(res+ " ");
//            }
//        }
//    }
}
