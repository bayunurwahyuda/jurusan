import java.util.Scanner;

public class perulanganfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi,i,j;
        System.out.print("masukan tinggi segitiga : ");
        tinggi = sc.nextInt();
        
        for (i = 1; i <= tinggi; i ++) {
            for (j = 1; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }}
    }