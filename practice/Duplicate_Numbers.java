import java.util.Scanner;

class Duplicate_Numbers{
	public static void main(String[] arg) {
		String number[] = new String[5];
		int numbercount[] = new int[] {0,0,0,0,0,0,0,0,0,0};
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; ++i) {
			System.out.print("input: ");
			number[i] = sc.next();
		}
		for(int i = 0; i < 5; ++i) {
			if(number[i].length() != 10) {
				System.out.println("number[" + i + "] is false");
				continue;
			}
			
			for(int x = 0; x < 10; ++x) {
				if(numbercount[number[i].charAt(x) - 48] > 1) {
					System.out.println("number[" + i + "] is false");
					break;
				}
				numbercount[number[i].charAt(x) - 48]++;
				flag = 1;
			}
			if(flag == 1)
				System.out.println("number[" + i + "] is true");
			flag = 0;
			for(int y = 0; y < 10; ++y)
				numbercount[y] = 0;
		}
	}
}