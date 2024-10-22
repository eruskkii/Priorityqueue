package classActivity3A.model;

import classActivity3A.enums.MealType;

public class Cafeteria {
    private MealType mealType;

    public Cafeteria(MealType mealType){
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
