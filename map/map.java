package map;
import java.util.TreeMap;
// import java.util.Iterator;
import java.util.Map;

public class map {
    public static void main(String[] args) {
    Map<String,String> corpFound = new TreeMap<String,String>();
    corpFound.put("Microsoft","Bill Gates");
    corpFound.put("Apple","Steven Paul Job");
    corpFound.put("Linux"," Linux Benedict Torvalds");
    corpFound.put("Facebook","Mark Zuckerberg");
    corpFound.put("Twitter","Jack Dorsey");
    corpFound.put("Instagram","Kevin Systrom");
    
        for(String i: corpFound.keySet()){
            System.out.println("\n" + i.toUpperCase() + " dikembangkan oleh " + corpFound.get(i));
        }    
    }
}
