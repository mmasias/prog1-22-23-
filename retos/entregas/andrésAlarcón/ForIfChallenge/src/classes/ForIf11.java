package classes;

public class ForIf11 {
    public static void main(String[] args) throws Exception {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i!=11 || j!=11
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