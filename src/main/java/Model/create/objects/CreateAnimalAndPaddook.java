package Model.create.objects;

import Model.objects.Animal;
import Model.objects.Paddook;

import java.sql.Time;
import java.util.List;


public class CreateAnimalAndPaddook {

    public void createAnimal(String type, int cost, String enviroment, Paddook paddookType, List<Time> timing, String status, String statusWay, String foodType) {
        Animal animal = new Animal();
        animal.setType(type);
        animal.setCost(cost);
        animal.setEnviromentType(enviroment);
        animal.setPaddookType(paddookType);
        animal.setTimingForCare(timing);
        animal.setStatus(status);
        animal.setStatusWay(statusWay);
        animal.setFoodType(foodType);

        AnimalBox animals = AnimalBox.getInstance();
        animals.AddListAnimal(animal);
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
