public class retoForIf12{
    public static void main(String[] args) {

        int dimension;
        dimension = 21;

        for ( int i = 1; i <= dimension; i = i +1) {
            for ( int j = 1; j <= dimension; j = j + 1) {

                if ( i!=11 && j!=11

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
