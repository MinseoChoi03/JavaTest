import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Two_out_and_Plus2 {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		Set<Integer> tmp = new TreeSet<>();
		//Set = 객체(데이터) 중복 저장 불가
		//TreeSet = 자동 오름차순 저장
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i + 1; j <numbers.length; j++) {
				tmp.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] Array = new int[tmp.size()];
		Iterator<Integer> data = tmp.iterator();
		//Iterator = 인터페이스. hasNext(), next(), remove() 메소드 보유
		//hasNext() = 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드. 있으면 true, 없으면 false 를 반환. 
		//next() = 다음 요소를 가져온다. 
		//remove() = next()로 읽어온 요소를 삭제한다.
		// 호출 순서 = hasNext() -> next() -> remove()
		
		for(int i = 0; i < tmp.size(); i++) {
			Array[i] = data.next();
		}
		
		answer = Array.clone();
		
		return answer;
	}
}
