import java.util.Scanner;

class Perfect_number{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,target;
		System.out.println("Number Input");
		target = sc.nextInt();
		for(int i = 2; i < target; ++i) {
			for(int x = 1; x < i; ++x) {
				if(i % x == 0)
					sum += x;
			}
			if(sum == i)
				System.out.print(i + " ");
			sum = 0;
		}
	}
}