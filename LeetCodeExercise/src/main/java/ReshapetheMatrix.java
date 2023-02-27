import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                queue.add(mat[i][j]);
            }
        }

        int total = mat.length * mat[0].length;

        if (r * c != total){
            return mat;
        }


        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < result[i].length;j++){

                result[i][j] = queue.remove();

            }
        }

        return result;
    }
}
