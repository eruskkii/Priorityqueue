package classActivity3A.Utils;

import classActivity3A.model.Decadevs;

import java.util.Comparator;

public class DecadevComparator implements Comparator<Decadevs> {


    @Override
    public int compare(Decadevs d1, Decadevs d2) {
        if(d1.isFemale() && !d2.isFemale()) {
            return -1; //d1 is a female, prioritize over d2
        }else if (!d1.isFemale() && d2.isFemale()) {
            return 1; // d2 is a female, prioritize over d1

        }else if (d1.isMale() && !d2.isMale()){
            return -1; //d1 is a male, prioritizes over d2
        }else if(!d1.isMale() && d2.isMale()){
            return 1; // d2 is a male, prioritizes over d1
        }else{
            return 0;
        }
    }
}

