import java.io.*;
import java.util.*;
/*
Your friend has n cards.
You know that each card has a lowercase English letter on one side and a digit on the other.
Currently, your friend has laid out the cards on a table so only one side of each card is visible.
You would like to know if the following statement is true for cards that your friend owns: "If a card has a vowel on one side, then it
has an even digit on the other side." More specifically, a vowel is one of 'a', 'e', 'i', 'o' or 'u', and even digit is one of '0', '2',
'4', '6' or '8'.
For example, if a card has 'a' on one side, and '6' on the other side, then this statement is true for it. Also, the statement is true,
for example, for a card with 'b' and '4', and for a card with 'b' and '3' (since the letter is not a vowel). The statement is false, 
for example, for card with 'e' and '5'. You are interested if the statement is true for all cards. In particular, if no card has a 
vowel, the statement is true.
To determine this, you can flip over some cards to reveal the other side. You would like to know what is the minimum number of cards
you need to flip in the worst case in order to verify that the statement is true.
Input
The first and only line of input will contain a string s (1 ≤ |s| ≤ 50), denoting the sides of the cards that you can see on the table
currently. Each character of s is either a lowercase English letter or a digit.
Output
Print a single integer, the minimum number of cards you must turn over to verify your claim.
*/
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        String input;
        char v;
        int count=0,flag;
        input=in.nextLine();
        String[] x=input.split("");
        String[] check1=new String[5];
        String[] check2=new String[5];
        check1[0]="a";
        check1[1]="e";
        check1[2]="i";
        check1[3]="o";
        check1[4]="u";
        check2[0]="0";
        check2[1]="2";
        check2[2]="4";
        check2[3]="6";
        check2[4]="8";
        for(String a:x){
            flag=0;
            v=a.charAt(0);
            if(Character.isLetter(v)){
            for(String c:check1){
                if(a.equals(c)){
                    count++;
                    flag=1;
                    break;
                }
            }
            }
            else{
            if(flag==0){
                 for(String c:check2){
                if(a.equals(c)){
                  
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
            }
            }
            
        }
        System.out.println(count);
        
}
}













