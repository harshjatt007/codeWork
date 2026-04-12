class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        Stack<Integer>stack=new Stack();
        for(int i=0;i<=n;i++){
            int currentHeight=(i==n)?0:heights[i];
            while(!stack.isEmpty() && currentHeight<heights[stack.peek()]){
                int left=heights[stack.pop()];
                int right=stack.isEmpty()?i:i-stack.peek()-1;
                maxArea=Math.max(maxArea,left*right);
            }
            stack.push(i);
        }
        return maxArea;
    }
}