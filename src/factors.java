class factors
{

        void markCol (int[][]matrix, int j) {
            for (int k = 0; k < matrix.length; k++) {
                if(matrix[k][j] !=0 ){
                matrix[k][j] = -1;
                }
            }
        }
        void markRow (int[][]matrix, int i)
        {
            for (int k = 0; k < matrix[0].length; k++) {
                if(matrix[i][k] !=0){
                matrix[i][k] = -1;
                }
            }
        }
    public void setZeroes (int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("Message"+row+" "+col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
            {
                if (matrix[i][j] == 0)
                {
                    markRow (matrix, i);
                    markCol (matrix, j);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
            {
                if (matrix[i][j] == -1)
                {
                    matrix[i][j] =0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        factors obj = new factors();
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        obj.setZeroes(arr);
    }


}
