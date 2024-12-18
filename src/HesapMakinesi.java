
import java.util.Scanner;


public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***************************");
        String islemler = "1. Toplama islemi\n"
                           +"2. Cikarma islem\n"
                           +"3. Carpma islemi\n"
                           +"4. Bolme islemi";
        System.out.print(islemler);
        System.out.println("***************************");
        System.out.print("islemi Seciniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        
        switch (islem) {
            case "1":
                System.out.print("Birinci sayi:");
                a = scanner.nextInt();
                System.out.print("ikinci sayi:");
                b = scanner.nextInt();
                System.out.print("İisleminizin sonucu =>" + (a+b));
                break;
                case "2":
                System.out.print("Birinci sayi:");
                a = scanner.nextInt();
                System.out.print("ikinci sayi:");
                b = scanner.nextInt();
                System.out.print("isleminizin sonucu =>" + (a-b));
                break;
                case "3":
                System.out.print("Birinci sayi:");
                a = scanner.nextInt();
                System.out.print("İkinci sayi:");
                b = scanner.nextInt();
                System.out.print("İsleminizin sonucu =>" + (a*b));
                break;
                case "4":
                System.out.print("Birinci sayi:");
                a = scanner.nextInt();
                System.out.print("ikinci sayi:");
                b = scanner.nextInt();
                System.out.print("isleminizin sonucu =>1 " + (a /b));
                break;
        }
    }
}
