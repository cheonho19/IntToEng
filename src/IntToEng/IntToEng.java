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
    	String s = "";
    	if(n < 100) {
    		s = underHundred(n);
    	} else if(n < 1000) {
    		s = underThousand(n);
    	} else if(n < 10000){
    		s = underTenThousand(n);
    	} else if(n == 10000) {
    		s = "ten thousand";
    	} else {
    		s = "10000未満の整数を入力してください";
    	}
    	return s;
    }
    static String underHundred(int n) {
    	String s = "";
    	if(n < 20) {
    		s = zero2nineteen[n];
    	} else if(n < 100) {
    		int i = n/10 - 2;
			int j = n%10;
			if(j == 0) {
    			s = twenty2ninety[i];
    		} else {
    			s = twenty2ninety[i] + " " + zero2nineteen[j];
    		}
    	}
    	return s;
    }
    static String underThousand(int n) {
    }
    static String underTenThousand(int n) {
    }
}
