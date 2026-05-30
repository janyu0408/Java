import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args)
    {
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("one", 1) ;
        maps.put("two", 2) ;
        maps.put("three", 3) ;
        maps.put("four", 4) ;
        maps.put("one", 5) ;

        System.out.println(maps.get("one"));
        System.out.println(maps.entrySet());
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        System.out.println(maps.containsKey("one"));
        System.out.println(maps.containsValue(2));
        System.out.println(maps.replace("one", 1));
        System.out.println(maps.values());

        // for(Map.Entry<String,Integer> entry:maps.entrySet())
        // {
        //      System.out.println(entry.getKey() + ": " + entry.getValue());

        // }
        // for(String key: maps.keySet())
        // {
        //     System.out.println(maps.get(key));
        // }
        maps.forEach((key, value)->{System.out.println(key +"=>"+ value);});


    }
}
