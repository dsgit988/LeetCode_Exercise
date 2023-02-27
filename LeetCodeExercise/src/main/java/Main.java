import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReshapetheMatrix r = new ReshapetheMatrix();
        int [][] mat = new int[][]{{1,2},{3,4}};

        System.out.println(Arrays.deepToString(r.matrixReshape(mat, 2,4)));
    }
}
