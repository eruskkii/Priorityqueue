package classActivity1A;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("BENIN");
        cityNames.add("BENIN");
        cityNames.add("BENIN");
        cityNames.add("LAGOS");
        cityNames.add("JOS");
        cityNames.add("OWERRI");
        cityNames.add("KANO");

        Iterator<String> iterator = cityNames.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }
}
