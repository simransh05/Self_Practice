package coding11;

import java.util.Stack;

public class Largest_Histogram {
	public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int max =0;
        for(int i=0;i<heights.length;i++){
            while(!stk.isEmpty() && heights[i] < heights[stk.peek()]){
                int h=heights[stk.pop()];
                int r= i;
                if(stk.isEmpty()){
                    max=Math.max(max,h*r);
                }else {
                    int l=stk.peek();
                    max = Math.max(max,h*(r-l-1));
                }
            }stk.push(i);
        }int r=heights.length-1;
        while(!stk.isEmpty()){
            int h=heights[stk.pop()];
            if(stk.isEmpty()){
                max=Math.max(max,h*r);
            }else {
                int l=stk.peek();
                max = Math.max(max,h*(r-l-1));
            }
        }
        return max;
    }

	public static void main(String[] args) {
		int[] arr = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(arr));

	}

}
