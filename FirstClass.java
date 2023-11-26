import java.io.*;
import java.util.*;

class FirstClass {


    public String output (String line) {
        int a=0, e=0, o=0, u=0 ,i=0;
        int len = line.length();
        for (int j=0; j<len;j++) {
            if (line.charAt(j)=='a' || line.charAt(j)=='A') a+=1;
            else if (line.charAt(j)=='e' || line.charAt(j)=='E') e+=1;
            else if (line.charAt(j)=='i' || line.charAt(j)=='I') i+=1;
            else if (line.charAt(j)=='o' || line.charAt(j)=='O') o+=1;
            else if (line.charAt(j)=='u' || line.charAt(j)=='U') u+=1;
        }
        return ("A: "+a+"\nE: "+e+"\nI: "+i+"\nO: "+o+"\nU: "+u);
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String line = new String();

        line = input.nextLine();

        FirstClass counter = new FirstClass();

        System.out.println(counter.output(line));
    }
}
