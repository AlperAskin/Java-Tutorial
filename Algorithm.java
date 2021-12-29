package algorithm;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

public class Algorithm {    
    public static String compress(String text,int n){
        char string[] = text.toCharArray();
        for(int i=0;i<string.length;i++) {
            int count=1;
            for(int j=i+1;j<string.length;j++){
                if(string[i] == string[j] && string[i] != ' ')
                    count++;
            }
            if(count>=n)
                text=text.replace(String.valueOf(string[i]),"");
        }
        return text;
    }
public static void main(String[] args) {
       /* String test="qwertyyaacvxczasdfh";
        test=compress(test,2);
        System.out.println(test);*/      
       String test= "assdddffffgggghhhhh";
       System.out.println("Ornek string: " +test);
       Scanner in = new Scanner(System.in);
       System.out.println("Kac tekrar fazlası silinsin?");
       int n  = in.nextInt();
       test=compress(test, n);
       System.out.print("Son Durum" +test);
       }
}
