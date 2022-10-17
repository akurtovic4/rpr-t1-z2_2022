import java.util.Scanner;

public class Main {


    public static int sumaCifara(int x){

        int sum = 0;
        while(x > 0) {

            int cifra = x % 10;


            sum = sum + cifra;

            x = x / 10;
        }

        return sum;
    }

    public static void main(String[] args) {


        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int broj = ulaz.nextInt();


        for(int i = 1; i < broj; i++){

            if(i % sumaCifara(i) == 0)
                System.out.println(i);
        }

    }
}