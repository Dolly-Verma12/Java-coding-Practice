package Session4;

class HollowPyramid {

    private int n;

    // Constructor
    HollowPyramid(int n) {
        this.n = n;
    }

    // Method to print pyramid
    void printPyramid() {

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                // First, last or bottom position
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {

        HollowPyramid pyramid = new HollowPyramid(9);

        pyramid.printPyramid();
    }
}
