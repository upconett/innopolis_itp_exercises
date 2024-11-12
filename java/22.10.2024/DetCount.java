import java.util.Scanner;


class DetCount {
    static int dimensions;
    static float[][] matrix;

    public static float det2(float[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
    }

    public static float det3(float[][] matrix) {
        float result = 0;
        for (int i = 0; i < 3; i++) {
            float[][] tmp_matrix = new float[2][2];
            result += matrix[0][i] * det2(tmp_matrix);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Matrix dimensions: ");
        dimensions = sc.nextInt();
        System.out.println("\nInput Matrix "+dimensions+"x"+dimensions+":");

        matrix = new float[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++)
            for (int j = 0; j < dimensions; j++)
                matrix[i][j] = sc.nextFloat();

        System.out.println("\nYour matrix:");
        for (int i = 0; i < dimensions; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimensions; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println("|");
        }
        if (dimensions == 2)
            System.out.println("\nDeterminant of 2d: " + det2(matrix));
    }
}