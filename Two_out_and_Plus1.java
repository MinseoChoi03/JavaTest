import java.util.ArrayList;
import java.util.Arrays;

public class Two_out_and_Plus1 {
	public int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i + 1; j <numbers.length; j++) {
				if(! list.contains(numbers[i] + numbers[j])) {
					//contains = 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
					list.add(numbers[i] + numbers[j]);
				}
			}
		}
		
		int [] answer = new int [list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		//오름차순 정렬
		
		return answer;
	}
}
