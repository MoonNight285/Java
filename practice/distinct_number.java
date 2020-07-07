import java.util.Vector;
import java.lang.Integer;

class Solution {
	 public int[] solution(int []arr) {
		 Vector<Integer> temp = new Vector<>();
		 
		 temp.add(arr[0]);
		 for(int i = 1; i < arr.length; ++i) {
			 if(temp.get(temp.size() - 1) != arr[i])
				 temp.add(arr[i]);
		 }
		 int result[] = new int[temp.size()];
		 for(int i = 0; i < temp.size(); ++i)
			 result[i] = temp.get(i);
		 
		 return result;
	    }
}

class distinct_number{
	public static void main(String[] arg) {
		int arr[] = new int[] {4,4,4,3,3};
		Solution s = new Solution();
		for(int i : s.solution(arr))
			System.out.println(i);
	}
}