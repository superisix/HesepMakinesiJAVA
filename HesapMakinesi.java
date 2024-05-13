import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1 , sayi2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        sayi1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        sayi2=input.nextInt();


        System.out.println("1-Toplam\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Bir seçim yapınız: ");
        select = input.nextInt();
        switch (select){
            case 1 :
                
                System.out.println("Toplam" + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma" + (sayi1-sayi2));
                break;
            case 3 :
                if (sayi2 !=0 ){
                    System.out.println("Bölme" + (sayi1/sayi2));
                    
                }
                break;
            case 4 :
                System.out.println("Çarpma" + (sayi1*sayi2));
                break;
            default:
                System.out.println("Seçim hatalı!");

    }   
}}
