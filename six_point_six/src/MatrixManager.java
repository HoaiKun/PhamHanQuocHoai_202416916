import java.util.Scanner;

public class MatrixManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Chế độ (1: Nhập tay / 2: Mặc định): ");
        String choice = scanner.nextLine().trim();

        int[][] m1, m2;

        if (choice.equals("1")) {
            m1 = inputMatrix("Ma trận A");
            m2 = inputMatrix("Ma trận B");
        } else {
            m1 = new int[][]{{18, 36, 63}, {16, 38, 63}, {36, 18, 15}};
            m2 = new int[][]{{36, 18, 15}, {16, 38, 63}, {38, 36, 63}};
            System.out.println("--- Sử dụng dữ liệu mặc định ---");
        }

        if (canAdd(m1, m2)) {
            int[][] result = addMatrices(m1, m2);
            System.out.println("\nKết quả tổng hai ma trận:");
            display(result);
        } else {
            System.out.println("Lỗi: Hai ma trận không cùng kích thước!");
        }
    }

    // Hàm nhập ma trận từ bàn phím
    private static int[][] inputMatrix(String name) {
        System.out.print("Nhập số hàng cho " + name + ": ");
        int r = scanner.nextInt();
        System.out.print("Nhập số cột cho " + name + ": ");
        int c = scanner.nextInt();
        
        int[][] matrix = new int[r][c];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Kiểm tra điều kiện cộng ma trận
    private static boolean canAdd(int[][] a, int[][] b) {
        return a.length == b.length && a[0].length == b[0].length;
    }

    // Logic cộng ma trận
    private static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    // Hàm in ma trận đẹp mắt
    private static void display(int[][] m) {
        for (int[] row : m) {
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println();
        }
    }
}