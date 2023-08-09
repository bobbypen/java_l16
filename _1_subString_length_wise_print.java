package lecture16;
import java.util.*;
public class _1_subString_length_wise_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		printSubString(s);
		
		}
	
	public static void printSubString(String s) {
		
		for (int len = 1; len < s.length(); len++) {
			for (int j = len; j < s.length(); j++) {
				int i = j - len;
				System.out.print(s.substring(i,j) + " ");
			}
			System.out.println();
		}
		
		
	}

}
