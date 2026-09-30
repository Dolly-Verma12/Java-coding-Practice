package Session3;
class PascalTriangle {
    static int combination(int n, int r) {
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
    static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) 
         {   // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }

            // Print values
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + "   ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        printTriangle(10);
    }
}