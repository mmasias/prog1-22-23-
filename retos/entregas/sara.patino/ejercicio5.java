public class ejercicio5{
    public static void main(String[] args){

        for(int i=1; i<=21; i=i+1){
            for(int j=1;j<=21;j=j+1){
                if(i==11 && j==11){
                System.out.print("[*]");
                }else {
                    System.out.print("[ ]");
                
                }
            }
            System.out.println();
        }


    }

}