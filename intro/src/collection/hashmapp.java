package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapp {

    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"tree");
        map.put(4,"foor");

        Set st = map.keySet();
        Iterator it = st.iterator();

        while (it.hasNext()){
            int key = (int) it.next();
            System.out.println(" key :"+key+" val : "+map.get(key));
            it.remove();
        }
    }
}
