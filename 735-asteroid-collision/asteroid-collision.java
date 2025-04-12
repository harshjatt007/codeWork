// class Solution {  
//     public int[] asteroidCollision(int[] asteroids) {  
//         Stack<Integer> stack = new Stack<>();  
        
//         for (int ast : asteroids) {  
//             // If the asteroid is positive or the stack is empty, push it onto the stack.  
//             if (ast > 0 || stack.isEmpty()) {  
//                 stack.push(ast);  
//             } else {  
//                 // Handle collision when current asteroid is negative  
//                 boolean destroyed = false;  // To track if the current asteroid is destroyed  
                
//                 while (!stack.isEmpty() && stack.peek() > 0) {  
//                     // If the current asteroid is smaller, it will be destroyed  
//                     if (Math.abs(ast) < Math.abs(stack.peek())) {  
//                         destroyed = true;  // Current asteroid is destroyed  
//                         break;  
//                     }  
//                     // If both asteroids are equal, both are destroyed  
//                     if (Math.abs(ast) == Math.abs(stack.peek())) {  
//                         stack.pop();  // Destroy both  
//                         destroyed = true;  
//                         break;  
//                     }  
//                     // Current asteroid is larger, pop the one from the stack  
//                     stack.pop();  // Pop the right-moving asteroid  
//                 }  
                
//                 // If the current asteroid is not destroyed and next in line is negative or stack is empty, push it  
//                 if (!destroyed && (stack.isEmpty() || stack.peek() < 0)) {  
//                     stack.push(ast);  
//                 }  
//             }  
//         }  
        
//         // Convert stack to result array  
//         int[] result = new int[stack.size()];  
//         for (int i = 0; i < stack.size(); i++) {  
//             result[i] = stack.get(i);  
//         }  
//         return result;  
//     }  
// }  
// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//     Stack<Integer> stack = new Stack<>();
//     // array ko traverse krenge
//     for(int i = 0; i < asteroids.length; i++) {
//         // agr stack khali hai ya fir koi positive value hai to
//         // asteroid ko push kro
//         if(stack.isEmpty() || asteroids[i] > 0) {
//             stack.push(asteroids[i]);
//         }
//         else {  // else matlab jo bhi asteriods hai wo negetive hai
//             while(!stack.isEmpty()) { // to jabtak array khali na ho jata
//                 int top = stack.peek(); // top element ko nikalo
//                 if(top < 0) { // agr top wala element negetive hai to
//                     stack.push(asteroids[i]); // asteroid push krdena hai
//                     break;
//                 } // fir uska mod value nikalna hai
//                 int modValue = Math.abs(asteroids[i]);
//                 if(top == modValue) { // barabar aya to dono asteroid destroy ho jayega
//                     stack.pop(); // asteroid ko pushna krke top wala bhi pop kr diya isiliye
//                     break;
//                 }
//                 else if(modValue < top) { // agr asteroid ka value kam hua to wo khud destroy ho jayegi aur stack unchanged rhega
//                     break;
//                 }
//                 else { // aur incoming bada hua to top element ko destroy kr degi
//                     stack.pop(); // fir stack khali hua to asteroid bharegi firse
//                     if(stack.isEmpty()) {
//                         stack.push(asteroids[i]);
//                         break;
//                     }
//                 }
//             }
//         }
//     }
//     int n = stack.size();
//     int[] result = new int[n];
//     // last in first out ki vajase ulta print hoga isiliye peechee se stack ko chalu kiya
//     for(int i = n - 1; i >= 0; i--) {
//         result[i] = stack.pop();
//     }
//     return result;
//     }
// }

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;

        while(!stack.isEmpty()) {
            res[i--] = stack.pop();
        }

        return res;   
    }
}