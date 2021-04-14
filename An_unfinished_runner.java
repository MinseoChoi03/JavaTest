import java.util.Arrays;

public class An_unfinished_runner {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); //정렬
        Arrays.sort(completion); //정렬
        
       int i = 0;
        
        for(i = 0; i < completion.length; i++){
            if(! participant[i].equals(completion[i])){
                return participant[i]; 
                //비교 후 맞지 않는 경우에만 return
            }
        }
        return participant[i]; //비교 후 남은 값 return 
    }
}
