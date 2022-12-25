package questions;

public class matrixElementsSum {
    public static void main(String[] args) {

    }
    static int solution(int[][] matrix) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==0){
                    sum2+=matrix[i][j];
                }
                if(matrix[i][j]>0){
                    sum+=matrix[i+1][j];
                }
            }
        }
        return sum+sum2;
    }
}
