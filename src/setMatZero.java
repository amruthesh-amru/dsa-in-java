import java.util.Scanner;
public class setMatZero {
    static void abc(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[] temp1=new int[row];
        int[] temp2=new int[col];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == 0){
                    temp1[i]=1;
                    temp2[j]=1;
                }
            }
        }for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(temp1[i]==1 || temp2[j] == 1){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        setMatZero obj = new setMatZero();
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        obj.abc(arr);
    }
}

