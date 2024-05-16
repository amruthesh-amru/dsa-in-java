public class recursion {

    public int[] generateArray(int x,int[] arr,int count){

        if(count>x-1){
            return null;
        }else{

            arr[count] =count+1;

            generateArray(x,arr,count+1);

        }
        return arr;
    }
    public String[] printNtimes(int n,int count,String[] arr){
        if(count>n-1){
            return null;
        }else{
            arr[count] = "coding Ninjas ";
            printNtimes(n,count+1,arr);
        }
        return arr;
    }
    public static void main(String[] args) {
        recursion obj = new recursion();
//        int x=2;
//        int[] arr = new int[x];
//       int[] result = obj.generateArray(x,arr,0);
//        for (int j : result) {
//            System.out.println(j);
        int n =2;
        String[] arr = new String[n];
          String[] result = obj.printNtimes(n,0,arr);
          for(String ele: result){
              System.out.print(ele);
          }
        }
    }

