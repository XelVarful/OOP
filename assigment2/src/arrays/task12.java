package arrays;

import java.util.Arrays;

public class task12 {
    public static int[][] array = new int[][]{
            {1, 2, 3},
            {4, 5, 6}
    };

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(array)
                .replace(", ", "\n")
                .replace("[", "")
                .replace("]", "")
        );
    }
}
