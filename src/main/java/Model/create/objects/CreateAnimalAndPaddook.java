package Model.create.objects;

import Model.objects.Animal;
import Model.objects.Paddook;
import Model.objects.Timing;

import java.sql.Time;


public class CreateAnimalAndPaddook {

    public void createAnimal(String type, int cost, String enviroment, String paddookType, Time one, Time two, Time three, Time four, Time five,
                             String status, String statusWay, String foodType) {
        Animal animal = new Animal();
        animal.setType(type);
        animal.setCost(cost);
        animal.setEnviromentType(enviroment);
        animal.setPaddookType(paddookType);
        Timing timing = new Timing();
        timing.setFirst(one);
        timing.setSecond(two);
        timing.setThird(three);
        timing.setFource(four);
        timing.setFifth(five);
        TimingBox.getInstance().addListTiming(timing);
        animal.setTimingForCare(timing);
        animal.setStatus(status);
        animal.setStatusWay(statusWay);
        animal.setFoodType(foodType);

        AnimalBox animals = AnimalBox.getInstance();
        animals.AddListAnimal(animal);
       /* for (int i = 4; i >= 0; i--) {
            timing.remove(i);
        }*/
    }

    public void createPaddook(String type, String food, boolean dengerous) {
        Paddook paddook = new Paddook();
        paddook.setType(type);
        paddook.setFood(food);
        paddook.setDengerous(dengerous);
        PaddookBox paddooks = PaddookBox.getInstance();
        paddooks.AddListPaddook(paddook);
    }
}
