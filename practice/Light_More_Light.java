import java.util.Scanner;

class Light_More_Light{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int input, sw = -1;
		
		while(true) {
			System.out.print("input data: ");
			input = sc.nextInt();
			
			if(input == 0)
				break;
		
			for(int i = 1; i <= input; ++i) {
				if(input % i == 0)
					sw *= -1;
			}
			if(sw == 1)
				System.out.println("yes");
			else
				System.out.println("no");
			sw = -1;
		}
	}
}