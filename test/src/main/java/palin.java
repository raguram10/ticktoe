import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.LinkedHashMap;
import java.util.Map;

public class palin {
    String method(String gh)
    {
        LinkedHashMap<Character,Integer> temp=new LinkedHashMap<>();
        char[] arr=gh.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            temp.put(arr[i],temp.containsKey(arr[i])?temp.get(arr[i])+1:1);
        }
        String buff="";
        char f='\0';
        for(Map.Entry<Character,Integer> fg:temp.entrySet())
        {
            System.out.println(fg.getKey()+" "+fg.getValue());
            if(fg.getValue()==2) {
                buff += fg.getKey();
            }
            else if(fg.getValue()==1)
                f=fg.getKey();

        }
        int co=0;
        if(f!='\0') {
            buff += f;
            co=1;
        }
        for(int i=buff.length()-1-co;i>=0;i--)
        {
            buff+=buff.charAt(i);
        }
        return buff;
    }
    public static String main(String args)
    {
       return  new palin().method(args);

    }
}
