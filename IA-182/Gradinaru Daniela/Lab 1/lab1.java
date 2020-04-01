//varianta 8

import java.util.*;
import java.util.Scanner;

public class Generic<E>
{
    public static void main(String[] args) 
    {        
        Scanner myObj = new Scanner(System.in);
        System.out.println("The string is: ");
        String text = myObj.nextLine();
        System.out.println("The string is: " + text);
        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : text.split("\\W+")) {
            if(unique.get(string) == null)
                unique.put(string, 1);
            else
                unique.put(string, unique.get(string) + 1);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}
