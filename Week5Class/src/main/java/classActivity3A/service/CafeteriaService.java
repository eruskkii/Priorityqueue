package classActivity3A.service;

import classActivity3A.model.Cafeteria;
import classActivity3A.model.Decadevs;

public interface CafeteriaService {

    void addDEvsToQueue(Decadevs devs);
    String collectMeal(Cafeteria meal);

}
