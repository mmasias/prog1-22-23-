public class reto13 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                    i==1 && j==2 || i==2 && j==1 || i==2 && j==3 || i==3 && j==2 || i==3 && j==4 || i==4 && j==3|| i==4 && j==5|| i==5 && j==4 || i==5 && j==6|| i==6 && j==5 || i==6 && j==7 || i==7 && j==6 || i==7 && j==8 || i==8 && j==7 || i==8 && j==9 || i==9 && j==8 || i==9 && j==10 || i==10 && j==9 || i==10 && j==11 || i==11 && j==10 || i==11 && j==12 || i==12 && j==11 || i==12 && j==13 || i==13 && j==12 || i==13 && j==14 || i==14 && j==13 || i==14 && j==15 || i==15 && j==14 || i==15 && j==16 || i==16 && j==15 || i==16 && j==17 ||i==17 & j==16 || i==17 && j==18 || i==18 && j==17 || i==18 && j==19 || i==19 && j==18 || i==19 && j==20 || i==20 && j==19 || i==20 && j==21 || i==21 && j==20
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
