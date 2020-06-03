
class distance_Calculation{
	public static void main(String[] arg) {
		int S[] = new int[]{1, 3, 4, 8, 13, 17, 20};
		int min, position=0;
		min = S[S.length - 1];
		
		for(int i = 0; i < S.length -1; ++i) {
			if(S[i + 1] - S[i] <= min) {
				min = S[i + 1] - S[i];
				position = i;
			}
		}
		System.out.println("result : " + "[" + S[position] + "," + S[position + 1] + "]");
	}
}