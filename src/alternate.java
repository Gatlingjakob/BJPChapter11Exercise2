package Chapter11;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Jakob on 30-08-2016.
 */
public class alternate {


public static void main (String[] args) {

    ArrayList<Object> list1 = new ArrayList<Object>();
    list1.addAll(Arrays.asList(1,3,5,7,9));

    ArrayList<Object> list2 = new ArrayList<Object>();
    list2.addAll(Arrays.asList(2,4,6,8,10,11,13,15));

    System.out.println(Alternate(list1, list2));
}
    public static List<Object> Alternate(List<Object> list1, List<Object> list2) {
        int c1 = 0, c2 = 0;
        ArrayList<Object> res = new ArrayList<Object>();

        while(c1 < list1.size() || c2 < list2.size()) {
            if(c1 < list1.size())
                res.add((Object) list1.get(c1++));
            if(c2 < list2.size())
                res.add((Object) list2.get(c2++));
        }
        return res;
    }
}