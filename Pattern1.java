class Pattern1 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j <= i)
                    System.out.print(j + " ");
                else
                    System.out.print((2 * i - j) + " ");
            }

            System.out.println();
        }
    }
}