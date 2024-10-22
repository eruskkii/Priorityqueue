package classActivity3A.service.Impl;

import classActivity3A.enums.MealType;
import classActivity3A.model.Cafeteria;
import classActivity3A.model.Decadevs;

public class Main {
    public static void main(String[] args) {

        // Create some sample devs (Male and Female)

        Decadevs male1 = new Decadevs("Simon Awaogu", false, true);
        Decadevs female1 = new Decadevs("Muminat Ade", true, false);

        //Create a sample meal
        Cafeteria cafeteria = new Cafeteria(MealType.SPAGHETTI);

        //Create a cafeteria impl instance

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        // Add Male and Female devs to cafeteria queue

        cafeteriaService.addDEvsToQueue(male1);
        cafeteriaService.addDEvsToQueue(female1);

        // Give out meal
        System.out.println(cafeteriaService.collectMeal(cafeteria));
    }
}
