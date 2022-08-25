import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner deger = new Scanner(System.in);
        int a, b, c;

        System.out.println("1.keranı giriniz : ");
        a=deger.nextInt();

        System.out.println("2.kenarı giriniz : ");
        b=deger.nextInt();

        System.out.println("3.kenarı giriniz : ");
        c = deger.nextInt();
        //cevre = cevre*2
        double cevre = (a+b+c)/2;

        //alan hesaplama alan*alan=cevre*(cevre-a)*(cevre-b)*(cevre-c)

        double alan =Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));

        System.out.println("üçgenin alanı = " + alan);


    }
}
