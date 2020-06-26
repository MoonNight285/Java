import java.util.Collections;
import java.util.Vector;
import java.lang.Integer;


class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int command_key[] = new int[] {0,0,0}; //first last key
		int result[] = new int[commands.length];
		Vector<Integer> temp = new Vector<>();
		
		for(int a = 0; a < commands.length; ++a) {
			for(int b = 0; b < commands[a].length; ++b)
				command_key[b] = commands[a][b];
			
			if(command_key[0] == command_key[1])
				temp.add(array[command_key[0] - 1]);
			else {
				for(int first = command_key[0] - 1; first < command_key[1]; ++first)
					temp.add(array[first]);
			}
			
			Collections.sort(temp);
			result[a] = temp.get(command_key[2] - 1);
			temp.clear();
		}
		
		return result;
    }
}

class Knumber{
	public static void main(String[] arg) {
		int arr[] = new int[] {1, 5, 2, 6, 3, 7, 4};
		int command[][] = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int result[] = new int[3];
		Solution s = new Solution();
		
		result = s.solution(arr, command);
		for(int i : result)
			System.out.println(i);
		
	}
}