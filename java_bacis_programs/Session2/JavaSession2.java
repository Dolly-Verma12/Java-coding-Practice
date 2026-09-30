package Session2;
class FloydTriangle {
    void printTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", number);
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydTriangle obj = new FloydTriangle();
        obj.printTriangle(10);
    }
}