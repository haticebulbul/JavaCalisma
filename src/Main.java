
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

     //Not ortalaması hesaplayan program-pratik1
     /*   int mat,turkce,fizk,kimya,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.print("Mat notunu giriniz:");
        mat=input.nextInt();
        System.out.print("TÜrkce notunu giriniz:");
        turkce=input.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizk=input.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya=input.nextInt();
        System.out.print("Tarih notunu giriniz:");
        tarih=input.nextInt();
        System.out.print("Müzik notunu giriniz:");
        muzik=input.nextInt();
        double ortalama=(mat+turkce+fizk+kimya+tarih+muzik)/6;
        System.out.println(ortalama>60 ?"sınıfı geçti :) ":"sınıfta kaldı :( " +"Ortalamanız: "+ortalama); */



    //KDV Tutarı Hesaplayan Program-pratik2
    /*   Scanner input=new Scanner(System.in);
        double girilenPara, kdvOrania=0.18,kdvOranib=0.08;
        System.out.print("Para giriniz:");
        girilenPara=input.nextDouble();
        double kdvOrani=0<girilenPara&&girilenPara>100?kdvOrania:kdvOranib;
        System.out.println(  "Kdv oranı:"+kdvOrani);
        double yeniPara=(girilenPara*kdvOrani)+girilenPara;
        System.out.println("kdvli fiyat="+yeniPara); */

    //Dik Üçgende Alan Bulma-pratik3
    /*    Scanner deger=new Scanner(System.in);
        int altKenar,dikKenar,hipotenus;
        System.out.print("alt kenar giriniz:");
        altKenar= deger.nextInt();
        System.out.print("dik kenar giriniz:");
        dikKenar= deger.nextInt();
        System.out.print("hipotenüs giriniz:");
        hipotenus= deger.nextInt();
        double u=(altKenar+dikKenar+hipotenus)/2;
        double alan=Math.sqrt(u*(u-altKenar)*(u-dikKenar)*(u-hipotenus));
        System.out.println("Alan="+alan); */

     //Taksimetre Programı-Pratik4
      /* double kmUcreti=2.20;
        int acilisUcreti=10;
        Scanner taksi=new Scanner(System.in);
        System.out.print("Gidilen km giriniz:");
        double gidilenYol=taksi.nextDouble();
        double ödenecekTutar=(gidilenYol*kmUcreti)+acilisUcreti;
        ödenecekTutar=ödenecekTutar>=20?ödenecekTutar:20;
        System.out.print("Ödenecek Tutar: "+ödenecekTutar+"Tl"); */

    //Daire Dilimi Alanı Hesabı-Pratik5
     /*  Scanner daire=new Scanner(System.in);
       double yariCap,pi=3.14,merkezAci;
       System.out.print("Dairenin yarıçapını giriniz:");
       yariCap=daire.nextDouble();
       System.out.print("Dairenin merkez açı ölçüsünü giriniz:");
       merkezAci=daire.nextDouble();
       double dAlan=(pi*(yariCap*yariCap)*merkezAci)/360;
       double alan=pi*yariCap*yariCap, cevre=2*pi*yariCap;
       System.out.print("Alanı: "+alan+" Çevresi: "+cevre+" Daire Diliminin Alanı:"+dAlan);  */

    //Vücut Kitle İndeksi Hesaplama-Ödev
     /*   Scanner input=new Scanner(System.in);
        double boy,kilo,kitleİndeks;
        System.out.print("Boyunuzu giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        kilo=input.nextDouble();
        kitleİndeks=kilo/(boy*boy);
        System.out.print("Kitle indeksiniz: "+kitleİndeks); */


    //Manav Kasa Programı-Ödev2
     /*   Scanner deger=new Scanner(System.in);
        double toplam,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        System.out.print("Armut kaç kg alındı");
        double kga=deger.nextDouble();
        System.out.print("Elma kaç kg alındı");
        double kge=deger.nextDouble();
        System.out.print("Domates kaç kg alındı");
        double kgd=deger.nextDouble();
        System.out.print("Muz kaç kg alındı");
        double kgm=deger.nextDouble();
        System.out.print("Patlıcan kaç kg alındı");
        double kgp=deger.nextDouble();

        toplam=((elma*kge)+(armut*kga)+(domates*kgd)+(muz*kgm)+(patlican*kgp));
        System.out.print(toplam);  */











    }
}