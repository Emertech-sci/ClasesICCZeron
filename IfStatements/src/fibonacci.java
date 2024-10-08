public class fibonacci {
    public static void main(String[] args){

        int prev1 = 0;
        int prev2 = 1;

        for(int i = 0; i <=19; i++){
            if(i <= 1){
                System.out.println("indice " + (i + 1) + ": " + i);
            }else{
                int tot = prev1 + prev2; // tot es igual a 0 + 1.
                System.out.println("indice " + (i +1) + ": " + tot); // imprime el valor de tot tras cada iteración
                prev1 = prev2; // prev1 toma el valor del numero siguiente.
                prev2 = tot; // prev2 toma el valor de tot
            }
        }
    }
}
