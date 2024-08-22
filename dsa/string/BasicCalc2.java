//https://leetcode.com/problems/basic-calculator-ii/
class Solution {
    public int calculate(String s) {
        Stack<Integer> n=new Stack<>();
        int num=0;
        char op='+';

        for(int i=0;i<s.length();i++)
        {
            char val=s.charAt(i);
            if(Character.isDigit(val))
            num=(num*10)+(val-'0');
              if (i == s.length() - 1 || val == '+' || val == '-' 
                                      || val == '*' || val == '/') {
              
                switch (op) {
                    case '+':
                        n.push(num); // Add the value to the stack
                        break;
                    case '-':
                        n.push(-num); // Push the negated value for subtraction
                        break;
                    case '*':
                        n.push(n.pop() * num); // Multiply with the top value on the stack
                        break;
                    case '/':
                        n.push(n.pop() / num); // Divide the top value with current value
                        break;
                }
                num=0;
                op=val;
            }
        }
        int sum=0;
        while(!n.isEmpty())
        sum=sum+n.pop();
        return sum;
    }
}
