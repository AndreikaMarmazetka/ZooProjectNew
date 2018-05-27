package VeiwModel;

import Model.objects.Animal;

import java.sql.Time;

public class CaseGetAnimal {
        public String getAnimalInfo(int number, Animal animal) {
            switch (number) {
                case 0:
                    return animal.getType();
                case 1:
                    return String.valueOf(animal.getCost());
                case 2:
                    return animal.getEnviromentType();
                case 3:
                    return animal.getPaddookType();
                case 4:
                    return animal.getTimingForCare().getFirst().toString();
                case 5:
                    return animal.getTimingForCare().getSecond().toString();
                case 6:
                {
                    if( animal.getTimingForCare().getThird() instanceof Time)
                        return animal.getTimingForCare().getThird().toString();
                    else
                        return "null";
                }
                case 7:
                {
                    if( animal.getTimingForCare().getFource() instanceof Time)
                        return animal.getTimingForCare().getFource().toString();
                    else
                        return "null";
                }
                case 8:
                {
                    if( animal.getTimingForCare().getFifth() instanceof Time)
                        return animal.getTimingForCare().getFifth().toString();
                else
                    return "null";
                }

                case 9:
                    return animal.getStatus();
                case 10:
                    return animal.getStatusWay();
                case 11:
                    return animal.getFoodType();
            }
            return null;
        }
    }
