package ClassActivity2B;

import classActivity3A.model.Decadevs;
import classActivity3A.service.DecadevsService;
import classActivity3A.service.Impl.DecadevServiceImpl;

import java.util.ArrayList;
import java.util.List;


import static classActivity3A.enums.Gender.FEMALE;
import static classActivity3A.enums.Gender.MALE;

public class Main {
    public static void main(String[] args) {

//        List<Person> people = new ArrayList<>();
//
//        Person user1 = new Person("John", 30);
//        Person user2 = new Person("Jane", 25);
//        Person user3 = new Person("Freedom", 35);
//        Person user4 = new Person ("Ben", 28);
//
//        people.add(user1);
//        people.add(user2);
//        people.add(user3);
//        people.add(user4);
//
//
//        Collections.sort(people, new AgeComparator());
//
//        for (Person persons : people) {
//            System.out.println(persons.getName() + " - " + persons.getAge());


        DecadevsService decadevsService = new DecadevServiceImpl();
            List<Decadevs> decadevs = new ArrayList<>();


        Decadevs decadevs1 = new Decadevs("Chibueze", MALE);
        Decadevs decadevs2 = new Decadevs("Muminate", FEMALE);
        Decadevs decadevs3 = new Decadevs("Simon", MALE);

        decadevs.add(decadevs1);
        decadevs.add(decadevs2);
        decadevs.add(decadevs3);






        }
    }

