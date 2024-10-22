package classActivity3A.service.Impl;

import classActivity3A.model.Decadevs;
import classActivity3A.service.DecadevsService;

public class DecadevServiceImpl implements DecadevsService {


    @Override
    public String askForMeal(Decadevs decadevs) {
        return "Decadev Name: " + decadevs.getName() + "is asking for meal";
    }


}
