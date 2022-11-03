/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

        Artık Yıl Nedir?

        Artık yıl,Miladî takvimde 365yerine 366günü olan yıl.Bu fazladan gün(artık gün),normalde 28gün olan şubat ayına 29Şubat’ın eklenmesi ile elde edilir.

        Artık Yıl Nasıl Hesaplanır?

        Genel bir kural olarak,artık yıllar 4rakamının katı olan yıllardır:

        1988,1992,1996,2000,2004,2008,2012,2016,2020,2024gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

        Örneğin 1200,1600,2000yılları artık yıldır ancak 1700,1800ve 1900artık yıl değildir.
        Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

*/



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int year;
        byte isLeapYear;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Yılı giriniz.");
        year=scanner.nextInt();

        if(year>0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear=1;
                }
                else{
                    isLeapYear=0;
                }
            }
            else{
                if (year%4==0){
                    isLeapYear=1;
                }
                else{
                    isLeapYear=0;
                }
            }
            if(isLeapYear==1) {
                System.out.println(year + " yılı bir artık yıldır");
            }else {
                System.out.println(year + " yılı bir artık yıl değildir.");
            }
        }
        else{
            System.out.println("Hatalı tuşlama");
        }



    }
}
