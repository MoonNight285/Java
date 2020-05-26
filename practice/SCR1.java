import java.util.Scanner;

class SCR1{
	public static void main(String[] arg) {
		int m,n,result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("total data number input: ");
		m = sc.nextInt();
		System.out.println("How much do you write on one page?: ");
		n = sc.nextInt();
		
		if(m % n == 0)
			result = m / n;
		else
			result = m / n + 1;
		
		System.out.println("total page: " + result);
	}
}
