public class retoForIf20 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                i==j-3 || i==j-7 || i==j-11 || i==j-15 || i==j-19 ||
                j==i-1 ||j==i-5 ||j==i-9 ||j==i-13 ||j==i-17 ||j==i-21
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
}