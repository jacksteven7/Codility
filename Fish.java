    public static int solution(int[] A, int[] B) {
        Stack<Integer> StackOnes = new Stack<Integer>();
    	int alives = 0;
        for (int i = 0; i < B.length; i++) {
			if(B[i]==0){
				if(StackOnes.size()==0){
					alives++;
				}else{
					while(!StackOnes.isEmpty() && A[i]>A[StackOnes.peek()]){
						StackOnes.pop();
					}
					if(StackOnes.isEmpty()) alives++;
				}
			}else{
				StackOnes.push(i);
			}
		}
        return alives + StackOnes.size();
    }
