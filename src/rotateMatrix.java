
public class rotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j <n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp=matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix.length;j++){
//                System.out.println(i+ " "+j+"-->"+j+" "+n);
//                int temp=matrix[i][j];
//                matrix[i][j]=matrix[j][n];
//                matrix[j][n]=temp;
//            }
//               n=n-1;
//        }
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

