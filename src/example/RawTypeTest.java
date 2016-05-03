package example;

import java.util.ArrayList;

/**
 * Created by itak on 2016/05/04.
 */
public class RawTypeTest {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList l = new ArrayList();
        ArrayList<Integer> il = new ArrayList<Integer>();
        l = il;
        l.add(1);
        System.out.println(l.get(0));
    }
}
