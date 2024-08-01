
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  int mat,fiz,turk,kim,muz;
  double avarage;
  Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if( !(mat <= 100 && mat >= 0)){
            mat = 0;
        }
        System.out.print("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        if( !(fiz <= 100 && fiz >= 0)){
            fiz = 0;
        }
        System.out.print("Türkçe notunuzu giriniz:");
        turk = inp.nextInt();
        if( !(turk <= 100 && turk >= 0)){
            turk = 0;
        }
        System.out.print("Kimya notunuzu giriniz:");
        kim = inp.nextInt();
        if( !(kim <= 100 && kim >= 0)){
            kim = 0;
        }
        System.out.print("Müzik notunuzu giriniz:");
        muz = inp.nextInt();
        if( !(muz <= 100 && muz >= 0)){
            muz = 0;
        }


            avarage = (mat + fiz + turk + kim + muz) / 5.0;

        System.out.println("Ortalamanız:" +avarage);

        if(avarage >= 55){
            System.out.println("Sınıfı geçtiniz...");
        }else {
            System.out.println("Sınıfta kaldınız");
        }

    }
}