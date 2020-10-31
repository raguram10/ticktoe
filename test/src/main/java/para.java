import java.util.Stack;

public class para {
    boolean parand(String s)
    {
        Stack<Character> temp=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                temp.push(s.charAt(i));
            else
            if(temp.isEmpty())
                return false;
            else if((!temp.isEmpty())&&temp.peek()=='('&&s.charAt(i)==')'||temp.peek()=='{'&&s.charAt(i)=='}'||temp.peek()=='['&&s.charAt(i)==']')
                temp.pop();
            else
                return false;


        }
        if(temp.isEmpty())
            return true;
        else
            return false;
    }
    public static boolean main(String args)
    {
        //System.out.println((int)')');
        return new para().parand(args);


    }
}
