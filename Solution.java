import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {

        Stack<Integer> st = new Stack<>();
        int output[] = new int[price.length];
        output[0] = 1;
        st.push(0);
        for(int i=1; i<price.length; i++){
            while(price[i] > price[st.peek()]){
                st.pop();
                if(st.isEmpty()){
                    break;
                }
            }
            if(st.isEmpty()){
                output[i] = i+1;
            }else{
                output[i] = i-st.peek();
            }
            st.push(i);
        }
        return output;
	}

}