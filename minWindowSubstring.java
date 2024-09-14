import java.util.Scanner;

public class Main{
    public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
         String str = sc.nextLine();
         String str1 = sc.nextLine();
         int count = str1.length();
         for(int size=count;size<=str.length();size++){
             for(int i=0;i<=str.length()-size;i++){
                 String t = "";
                 int count1 = 0;
                 for(int j=i;j<i+size;j++){
                     t = t + str.charAt(j);
                 }
                 for(int h=0;h<t.length();h++){
                     for(int q=0;q<str1.length();q++){
                         if(t.charAt(h)==str1.charAt(q)){
                             count1++;
                         }
                     }
                 }
                 if(count==count1){
                     System.out.print(t);
                     tag=true;
                     return;
                 }
             }
         }
         

    }
}
