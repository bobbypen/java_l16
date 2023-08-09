package lecture16;
import java.util.*;
public class _2_Finding_CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		link _ : https://codeskiller.codingblocks.com/problems/165
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		printSubString(s);
		

	}
	
	public static boolean CB(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int [] arr = {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (num%arr[i] == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
public static void printSubString(String s) {
		int count = 0;
		boolean [] visited = new boolean[s.length()];
		for (int len = 1; len <=s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i,j);
				if (CB(Long.parseLong(str)) == true && isvisited(visited,i , j-1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
				
			}
		}
		System.out.println(count);
		
	}
	public static boolean isvisited(boolean [] visited,int si,int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}




}

