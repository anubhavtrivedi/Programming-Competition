/*
Edogawa Conan got tired of solving cases, and invited his friend, Professor Agasa, over. They decided to play a game of cards. Conan has
n cards, and the i-th card has a number ai written on it.

They take turns playing, starting with Conan. In each turn, the player chooses a card and removes it. Also, he removes all cards having a 
number strictly lesser than the number on the chosen card. Formally, if the player chooses the i-th card, he removes that card and removes
the j-th card for all j such that aj < ai.

A player loses if he cannot make a move on his turn, that is, he loses if there are no cards left. Predict the outcome of the game, 
assuming both players play optimally.
*/
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	int a;
	a=in.nextInt();
	if(a==1){
	System.out.println("Conan");
	return;}
	int l;
	int[] b=new int[100009];
	for(int i=0;i<a;i++){
	    
	    b[in.nextInt()]++;
	}


 for(int x:b){
     if(x%2!=0){
         System.out.println("Conan");
         return;
     }
 }

System.out.println("Agasa");

