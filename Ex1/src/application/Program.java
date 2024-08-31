package application;

import util.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Table>tables = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores (0 para finalizar)");
        int num;
        do {
            num = sc.nextInt();
            if(num!=0) {
                Table table = new Table(num);
                tables.add(table);
            }
        } while (num != 0);

        for (Table table : tables) {
            System.out.println(table);
        }
        sc.close();
    }
}
