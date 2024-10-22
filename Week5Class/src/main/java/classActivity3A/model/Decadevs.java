package classActivity3A.model;

import classActivity3A.enums.Gender;

public class Decadevs {
    private String name;

    private boolean isFemale;

    private boolean isMale;

    public Decadevs(String name, boolean isFemale, boolean isMale){
        this.name = name;
        this.isFemale= isFemale;
        this.isMale= isMale;
    }

    public Decadevs(String name, Gender gender) {
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMale() {
        return isMale;
    }
}
