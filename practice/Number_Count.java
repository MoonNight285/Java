
class Number_Count{
	public static void main(String[] arg) {
		int arr[] = new int[] {3,2,1,1,1,1,1,1,1,1};//0~9 index, (1~9,1000) is in advance apply
		
		for(int i = 10; i < 1001; ++i) {
			if(i < 100) {
				arr[i / 10]++;
				arr[i % 10]++;
			}
			else if(i < 1000) {
				arr[i / 100]++;
				arr[(i % 100)/10]++;
				arr[(i % 100)%10]++;
			}
		}
		
		for(int i = 0 ; i < 10; ++i)
			System.out.println(i + "count :" + arr[i]);
	}
}