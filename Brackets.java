import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public int solution(String S) {
        String [] signsA = {"{","[","(","}","]",")"};
    	Stack<String> s = new Stack<String>();
	   	List<String> signs = Arrays.asList(signsA);
	   	String l;
	   	for (int i = 0; i < S.length(); i++) {
		 l = S.substring(i, i+1);
		 if(signs.indexOf(l)<3){
			 s.push(l);
		 }else if(s.size()==0 || !s.pop().equals(signs.get(signs.indexOf(l)-3))){
			 return 0;
		 }
		}
	   	return s.size()==0 ? 1 : 0;
    }
}
