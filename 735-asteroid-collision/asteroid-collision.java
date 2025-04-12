// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer>stack=new Stack<>();
//         for(int num:asteroids){
//             if(stack.isEmpty()){ stack.push(num); continue;}
//             if((num>0 && stack.peek()>0)|| (num<0 && stack.peek()<0)){stack.push(num); continue;}
//             if((num<0 && stack.peek()>0)){
//                 if(Math.abs(num)<stack.peek()) continue;
//                 else {
//                     while(stack.peek()<Math.abs(num)){
//                         stack.pop();
//                     }
//                 }
//             }
//             if(num>0 && stack.peek()<0){
//                 if(num<Math.abs(stack.peek())) continue;
//                 else {
//                     while(stack.peek()<Math.abs(num)){
//                         stack.pop();
//                     }
//                 }
//             }

//         }
//         int result[]=new int[stack.size()];
//         for(int i=0;i<stack.size();i++){
//             result[i]=stack.pop();
//         }
//         return result;
//     }
// }


class Solution {  
    public int[] asteroidCollision(int[] asteroids) {  
        Stack<Integer> stack = new Stack<>();  
        
        for (int ast : asteroids) {  
            // If the asteroid is positive or the stack is empty, push it onto the stack.  
            if (ast > 0 || stack.isEmpty()) {  
                stack.push(ast);  
            } else {  
                // Handle collision when current asteroid is negative  
                boolean destroyed = false;  // To track if the current asteroid is destroyed  
                
                while (!stack.isEmpty() && stack.peek() > 0) {  
                    // If the current asteroid is smaller, it will be destroyed  
                    if (Math.abs(ast) < Math.abs(stack.peek())) {  
                        destroyed = true;  // Current asteroid is destroyed  
                        break;  
                    }  
                    // If both asteroids are equal, both are destroyed  
                    if (Math.abs(ast) == Math.abs(stack.peek())) {  
                        stack.pop();  // Destroy both  
                        destroyed = true;  
                        break;  
                    }  
                    // Current asteroid is larger, pop the one from the stack  
                    stack.pop();  // Pop the right-moving asteroid  
                }  
                
                // If the current asteroid is not destroyed and next in line is negative or stack is empty, push it  
                if (!destroyed && (stack.isEmpty() || stack.peek() < 0)) {  
                    stack.push(ast);  
                }  
            }  
        }  
        
        // Convert stack to result array  
        int[] result = new int[stack.size()];  
        for (int i = 0; i < stack.size(); i++) {  
            result[i] = stack.get(i);  
        }  
        return result;  
    }  
}  