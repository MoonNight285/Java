import java.util.Scanner;

class Compress_string{
	public static void main(String[] arg) {
		
		String str;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for(int i = 0; i < str.length(); ++i) {
			if(i + 1 != str.length() && str.charAt(i) == str.charAt(i + 1))
				count++;
			else {
				System.out.print(str.charAt(i));
				System.out.print(count);
				count = 1;
			}
		}
	}
}