package IntToEng;

import java.util.Scanner;

public class IntToEng {
	
static String zero2nineteen[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
		         "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
static String twenty2ninety[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
static String hundered = "hundred";
static String thousand = "thousand";

	   // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
        sc.close();
    }
    static String translateEng(int n) {
    	   return "";
    }
}
