import java.util.*;

public class Testhash{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        System.out.println("Map.keySet:");
        for(String key : map.keySet()){
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
     
        System.out.println("Map.entrySet iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
            }
     
        System.out.println("Map.entrySet:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
   
        System.out.println("Map.values():");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}