class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new  Stack<>();
        
         for(int i=0;i<tokens.length;i++)
         {
            if(!tokens[i].equals("+") &&!tokens[i] .equals("-")&&!tokens[i].equals("/") &&!tokens[i].equals("*") )
            {
                int num=Integer.parseInt(tokens[i]);
                stack.push(num);
            }
              else
              {
                 int  num1=stack.pop();
                  int num2=stack.pop();
                if(tokens[i].equals("+"))
                {
                    stack.push(num1+num2);
                }
                else if(tokens[i].equals("*"))
                {
                    stack.push(num1*num2);
                }
                else if(tokens[i].equals("-"))
                {
                    stack.push(num2-num1);
                }
                else
                {
                    stack.push(num2/num1);
                }
              }
         }
         return stack.pop();
         }
    
}
