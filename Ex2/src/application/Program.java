package application;

public class Program {
    public static void main(String[] args) {
        int[]vect1 = {0,1,2,3,4,5,6,7,8,9};
        int[]vect2 = {0,2,4,6,8,10,12,14,16,18};
        int[]vect3 = new int[10];
        int j=0;
        for(int i=0;i<10;i++){
            if(vect1[i]!=vect2[i]){
                vect3[j]=vect1[i];
                j++;
                vect3[j]=vect2[i];
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(vect3[i]+" ");
        }
    }
}
