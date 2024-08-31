package application;

public class Program {
    public static void main(String[] args) {
        int[] vect1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vect2 = {10, 15, 20, 25, 30, 1, 1, 1, 1, 1};
        int[] vectR1 = new int[10];
        int[] vectR2 = new int[10];
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i < 10; i++) {
            if (vect1[i] % 2 == 0) {
                somaPar += vect1[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            vectR1[i] = somaPar + vect2[i];
        }
        System.out.println("Vetor resultante 1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vectR1[i]);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(vect1[i]%vect2[j]==0){
                    somaImpar++;
                }
            }
            vectR2[i]=somaImpar;
            somaImpar = 0;
        }
        System.out.println("Vetor resultante 2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vectR2[i]);
        }
    }
}
