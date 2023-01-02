import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        Stack<String> stack=new Stack<String>();
		
		while (sc.hasNext()) {
			String input=sc.next();
            
            for(int i=0;i<input.length();i++){
                 String item = input.charAt(i) + "";
                 if(stack.isEmpty()){
                     stack.push(item);
                 }else if(  stack.lastElement().equals("(") && item.equals(")") ||
                    stack.lastElement().equals("{") && item.equals("}") ||
                    stack.lastElement().equals("[") && item.equals("]"))
                    {
                        stack.pop();
                        
                    }else{
                        stack.push(item);
                    }
            }
            if (stack.empty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            } 
            stack.clear();
    
		}
   
		
	}
}
