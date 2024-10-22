package classActivity3A.service.Impl;

import classActivity3A.Utils.DecadevComparator;
import classActivity3A.model.Cafeteria;
import classActivity3A.model.Decadevs;
import classActivity3A.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

    PriorityQueue<Decadevs> devsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        devsOnQueue = new PriorityQueue<>(new DecadevComparator());
    }


    @Override
    public void addDEvsToQueue(Decadevs devs) {
        devsOnQueue.add(devs);
    }

    @Override
    public String collectMeal(Cafeteria meal) {

        if (devsOnQueue.isEmpty()) {
            return "No devs is on queue yet";
        }
        Decadevs decadevs = devsOnQueue.poll();
        return decadevs.getName() + "has taken" + meal.getMealType() + ".";
    }
}



