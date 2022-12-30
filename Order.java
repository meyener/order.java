import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
       int first,sec,third,big1=0,big2=0,big3=0,var1=0,a=1;
       System.out.println("Lütfen birinci sayiyi giriniz : ");
        Scanner scn=new Scanner(System.in);
        first=scn.nextInt();
        System.out.println("Lütfen ikiinci sayiyi giriniz : ");
        sec=scn.nextInt();
        System.out.println("Lütfen ucuncu sayiyi giriniz : ");
        third=scn.nextInt();

        
        if (first>sec) {
            if (first>third) {
                if(sec>third){
                    big1=first;
                    big2=sec;
                    big3=third;
                }
                else{
                    big1=first;
                    big2=third;
                    big3=sec;
                }
            }
            
        }
        if (sec>first) {
            if (sec>third) {
                if(first>third){
                    big1=sec;
                    big2=first;
                    big3=third;
                }
                else{
                    big1=sec;
                    big2=third;
                    big3=first;
                }
            }
            
        }
     

        System.out.println(big1+" "+big2+" "+big3);

        
        
        

    }
}
