import java.util.*;

public class StringManipulations {

    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = "welcome";
        String s3 = "Great";

        char[] cArr = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            cArr[i] = s1.charAt(i);
            if(cArr[i]!='a' && cArr[i]!='e' && cArr[i]!='i' && cArr[i]!='o' && cArr[i]!='u' ){
                cArr[i] ='#';
            }
        }
        for (char a : cArr) {
            System.out.print(a);
        }
        System.out.println();

        char[] cArr2 = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            cArr2[i] = s2.charAt(i);
            if(cArr2[i]=='a' || cArr2[i]=='e' || cArr2[i]=='i' || cArr2[i]=='o' || cArr2[i]=='u' ){
                cArr2[i] ='$';
            }
        }
        for (char b : cArr2) {
            System.out.print(b);
        }
        System.out.println();

        
        char[] cArr3 = new char[s3.length()];
        for(int i = 0; i < s3.length(); i++) {
            int val = (int)s3.charAt(i);
            if(val >=97 && val <=122 )
               { 
		        val-=32;
                cArr3[i] = (char)val;
                }
                else
                cArr3[i] = s3.charAt(i);        

        }
        
        for(char c : cArr3) {
            System.out.print(c);
        }    

    }
}