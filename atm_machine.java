package com.company;
import java.util.Scanner;

// ATM DEMOSU. SWITCH CASE IN KULLANIMI. VE WHİLE DÖNGÜSÜ


public class atm_machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner tara = new Scanner(System.in);
        String id = "ebrar";
        String pass = "2001";
        String id2 = "ozkan";
        String pass2 = "1995";
        String id3 = "meral";
        String pass3 = "1968";
        int bakiye = 1000;
        int bakiye2 = 1000;
        int bakiye3 = 1000;
        int islem;
        while (true){
            System.out.println("Kullanıcı Adınızı Giriniz -->");
            String kul = tara.nextLine();
            System.out.println("Parolanizi Giriniz -->");
            String sif = tara.nextLine();
            if ((id.equals(kul)) && (pass.equals(sif))) {
                System.out.println("Hoşgeldiniz Ebrar Hanım...");
                while (true){

                    System.out.println("****************************** " +
                            "\nLütfen Bir işlem Tuşlayınız--> " +
                            "\n1) Para Çekme. " +
                            "\n2) Para Yatırma " +
                            "\n3) Bakiye Öğrenme. " +
                            "\n4) Baska Hesaba Para Gönderme." +
                            "\n5) Parola Değiştir" +
                            "\n6) Çıkış Yap." +
                            "\n****************************** ");
                    islem = scan.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("Çekmek istediginiz miktari giriniz -->");
                            bakiye = bakiye - scan.nextInt();
                            System.out.println("Para Çekme İşleminiz Başarılı. Kalan Bakiyeniz = " +bakiye);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz -->");
                            bakiye = bakiye + scan.nextInt();
                            System.out.println("Para Yatırma İşleminiz Başarılı. Güncel Bakiyeniz = " +bakiye);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz = " +bakiye);
                            break;
                        case 4:
                            System.out.println("Hesabına Para Göndermek İstediğiniz Kişiyi Tuşlayın." +
                                    "\n1) Özkan YILMAZ." +
                                    "\n2) Meral YILMAZ.");
                            int kisi = scan.nextInt();
                            System.out.println("Göndermek İstediğiniz Tutarı Giriniz.");
                            int tutar = scan.nextInt();


                            if (kisi == 1){
                                bakiye2 += tutar;
                            }
                            else if (kisi == 2){
                                bakiye3 += tutar;
                            }
                            else {
                                System.out.println("Geçersiz Tuşlama Yaptınız..!");
                            }
                            bakiye -=tutar;
                            System.out.println("Gönderme İşleminiz Başarılı. Güncel Bakiyeniz = " + bakiye);
                            break;
                        case 5:
                            System.out.println("Yeni Parolanızı Giriniz.");
                            scan.nextInt();
                            System.out.println("Yeni Parolanızı Tekrar Giriniz.");
                            pass = tara.nextLine();
                            System.out.println("Parola Değiştirme İşleminiz Başarılı. Yeni Parolanız = " +pass);
                            break;

                    }
                    if (islem == 6 | islem == 5)
                        break;
                }
            }
            else if ((id2.equals(kul)) && (pass2.equals(sif))){
                System.out.println("Hoşgeldiniz Ozkan Bey...");
                while (true){

                    System.out.println("****************************** " +
                            "\nLütfen Bir işlem Tuşlayınız--> " +
                            "\n1) Para Çekme. " +
                            "\n2) Para Yatırma " +
                            "\n3) Bakiye Öğrenme. " +
                            "\n4) Baska Hesaba Para Gönderme." +
                            "\n5) Parola Değiştir" +
                            "\n6) Çıkış Yap." +
                            "\n****************************** ");
                    islem = scan.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("Çekmek istediginiz miktari giriniz -->");
                            bakiye2 = bakiye2 - scan.nextInt();
                            System.out.println("Para Çekme İşleminiz Başarılı. Kalan Bakiyeniz = " +bakiye2);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz -->");
                            bakiye2 = bakiye2 + scan.nextInt();
                            System.out.println("Para Yatırma İşleminiz Başarılı. Güncel Bakiyeniz = " +bakiye2);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz = " +bakiye2);
                            break;
                        case 4:
                            System.out.println("Hesabına Para Göndermek İstediğiniz Kişiyi Tuşlayın." +
                                    "\n1) Ebrar YILMAZ." +
                                    "\n2) Meral YILMAZ.");
                            int kisi = scan.nextInt();
                            System.out.println("Göndermek İstediğiniz Tutarı Giriniz.");
                            int tutar = scan.nextInt();


                            if (kisi == 1){
                                bakiye += tutar;
                            }
                            else if (kisi == 2){
                                bakiye3 += tutar;
                            }
                            else {
                                System.out.println("Geçersiz Tuşlama Yaptınız..!");
                            }
                            bakiye2 -=tutar;
                            System.out.println("Gönderme İşleminiz Başarılı. Güncel Bakiyeniz = " + bakiye2);
                            break;
                        case 5:
                            System.out.println("Yeni Parolanızı Giriniz.");
                            scan.nextInt();
                            System.out.println("Yeni Parolanızı Tekrar Giriniz.");
                            pass2 = tara.nextLine();
                            System.out.println("Parola Değiştirme İşleminiz Başarılı. Yeni Parolanız = " +pass2);
                            break;

                    }
                    if (islem == 6 | islem == 5)
                        break;
                }
            }
            else if ((id3.equals(kul)) && (pass3.equals(sif))){
                System.out.println("Hoşgeldiniz Meral Hanım...");
                while (true){

                    System.out.println("****************************** " +
                            "\nLütfen Bir işlem Tuşlayınız--> " +
                            "\n1) Para Çekme. " +
                            "\n2) Para Yatırma " +
                            "\n3) Bakiye Öğrenme. " +
                            "\n4) Baska Hesaba Para Gönderme." +
                            "\n5) Parola Değiştir" +
                            "\n6) Çıkış Yap." +
                            "\n****************************** ");
                    islem = scan.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("Çekmek istediginiz miktari giriniz -->");
                            bakiye3 = bakiye3 - scan.nextInt();
                            System.out.println("Para Çekme İşleminiz Başarılı. Kalan Bakiyeniz = " +bakiye3);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz -->");
                            bakiye3 = bakiye3 + scan.nextInt();
                            System.out.println("Para Yatırma İşleminiz Başarılı. Güncel Bakiyeniz = " +bakiye3);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz = " +bakiye3);
                            break;
                        case 4:
                            System.out.println("Hesabına Para Göndermek İstediğiniz Kişiyi Tuşlayın." +
                                    "\n1) Ebrar YILMAZ." +
                                    "\n2) Özkan YILMAZ.");
                            int kisi = scan.nextInt();
                            System.out.println("Göndermek İstediğiniz Tutarı Giriniz.");
                            int tutar = scan.nextInt();


                            if (kisi == 1){
                                bakiye += tutar;
                            }
                            else if (kisi == 2){
                                bakiye2 += tutar;
                            }
                            else {
                                System.out.println("Geçersiz Tuşlama Yaptınız..!");
                            }
                            bakiye3 -=tutar;
                            System.out.println("Gönderme İşleminiz Başarılı. Güncel Bakiyeniz = " + bakiye3);
                            break;
                        case 5:
                            System.out.println("Yeni Parolanızı Giriniz.");
                            scan.nextInt();
                            System.out.println("Yeni Parolanızı Tekrar Giriniz.");
                            pass3 = tara.nextLine();
                            System.out.println("Parola Değiştirme İşleminiz Başarılı. Yeni Parolanız = " +pass3);
                            break;

                    }
                    if (islem == 6 | islem == 5)
                        break;
                }
            }
            else {
                System.out.println("Yanlış Kullanıcı adı veya Şifre Girdiniz..!");
            }
        }
    }
}
