package Model.Connect;

import java.sql.Time;

public class Query {
    // ----------------------------------OnStartProgram--------------------
    final static public String loadAnimal = "Select a.id, at.type, a.cost, e.environment, pt.type," +
            " t.first, t.second, t.third, t.fourth, t.fifth," +
            "a.status, sw.status_way, f.food from Animals" +
            "left join AnimalType at on a.type=at.id" +
            "left join Environment e on a.environment = e.id " +
            "left join Paddook p on a.paddook = p.id " +
            "left join PaddookType pt on p.type = pt.id " +
            "left join Timing t on a.timing = t.id" +
            "left join StatusWay sw on a.status_way=sw.id" +
            "left join Food f on a.food=f.id";

    final static public String loadPaddook = "SELECT p.id, pt.type, f.food, p.dangerous from Paddook p " +
            "left join PaddookType pt on p.type = pt.id" +
            "left join Food f on pt.food=id.food";

    final static public String loadAnimalType = "select id, type from AnimalType;";
    final static public String loadTiming = "select id, first, second, third, fourth, fifth from Timing;";
    final static public String loadStatusWay = "select * from StatusWay";
    final static public String loadFood = "select id, food from Food";
    final static public String loadEnviroment = "select id, environment from Environment";
    final static public String loadPaddookType = "select id, type from PaddookType;";


    //--------------------------------OnCreate---------------------------

    public String addAnimal;
    public String addPaddook;
    public String addAnimalType;
    public String addTiming;
    public String addPaddookType;

    public void createAddAnimalQuery(int id, int type, int cost, int environment, int paddook, int timing, String status, int status_way, int food) {
        addAnimal = "insert into Animals (" + id + ", " + type + ", " + cost + ", " + environment + ", " + paddook + ", " + timing + ", " + status + ", " + status_way + ", " + food + ") values";
    }

    public void createAddPaddookQuery(int id, int paddook_type, int food, boolean dangerous) {
        addPaddook = "insert into Paddook (" + id + ", " + paddook_type + ", " + food + ", " + dangerous + ") values";
    }

    public void createAddAnimalTypeQuery(int id, String type) {
        addAnimalType = "insert into AnimalTypes (" + id + ", " + type + ") values ";
    }

    public void createAddTiming(int id, Time o, Time t, Time tr, Time fo, Time fi) {
        addTiming = "insert into Timing (" + id + ", " + o + ", " + t + ", " + tr + ", " + fo + ", " + fi + ") values ";
    }

    public void createAddPaddookTypeQuery(int id, String type) {
        addPaddookType = "insert into PaddookTypes (" + id + "," + type + ") values ";
    }

    //------------------------------Update---------------------------

    final static public String updateStatusWay = "update Animal set status_way=";
    //final static public String updateAnimal
    //final static public String updatePaddook


}
