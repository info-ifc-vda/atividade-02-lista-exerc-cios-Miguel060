package util;

public class Table {
    public int num;
    public double raiz;
    public double cubo;

    public Table(int num){
        this.num = num;
    }

    public double calcCubo(int num){
        num = this.num;
        return Math.pow(num, 3);
    }
    public double raizQuadrada(int num){
        num = this.num;
        return Math.sqrt(num);
    }

    @Override
    public String toString() {
        return "Numero: "+num+String.format(" - Raiz quadrada: %.2f", raizQuadrada(num))+String.format(" - Cubo: %.2f", calcCubo(num));
    }
}
