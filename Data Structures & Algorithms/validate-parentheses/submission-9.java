class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        boolean value=true;
        if(s.length()==1||s.length()==0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                 stack.push(s.charAt(i));
            }
            else if(stack.isEmpty())
            {
                return false;
            }
           
            else if(s.charAt(i)==')')
            {
                char ch=stack.pop();
                if ( ch!='(')
                {
                 return false;  
                }
                  

            }
            else if(s.charAt(i)==']')
            {
                char ch=stack.pop();
                if (ch!='[')
                {
                  return false;
                }
               
            }
            else if(s.charAt(i)=='}')
            {
                char ch=stack.pop();
                if (ch!='{')
                {
                  return false;
                }
               
            }
            
            
    }
    if(!stack.isEmpty())
            {
                return false;
            }
            
    return true;
}
}
