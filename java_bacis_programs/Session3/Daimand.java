package Session3;

abstract class Pattern {

    abstract void printPattern(int rows);
}

class Diamond extends Pattern {

    @Override
    void printPattern(int rows) {

        // Upper half
        for (int i = 1; i <= rows; i++) {

            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Diamond obj = new Diamond();

        obj.printPattern(8);
    }
}