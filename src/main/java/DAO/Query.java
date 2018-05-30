package DAO;

import java.sql.Time;

public class Query {
    // ----------------------------------OnStartProgram--------------------
    final static public String loadAnimal = "Select a.id, at.type, a.cost, e.environment, pt.type,"+
    "t.first, t.second, t.third, t.fourth, t.fifth,"+
    "a.status, sw.status_way, f.food from  public.\"Animal\" a "+
    "left join public.\"AnimalType\" at on a.type= at.id "+
    "left join public.\"Environment\" e on a.environment = e.id "+
    "left join public.\"Paddook\" p on a.paddook = p.id "+
    "left join public.\"PaddookType\" pt on p.type = pt.id "+
    "left join public.\"timing\" t on a.timing = t.id "+
    "left join public.\"StatusWay\" sw on a.status_way=sw.id "+
    "left join public.\"Food\" f on a.food=f.id";

    final static public String loadPaddook = "SELECT p.id, pt.type, f.food, p.dengirous from public.\"Paddook\" p " +
            "left join public.\"PaddookType\" pt on p.type = pt.id " +
            "left join public.\"Food\" f on p.food=f.id";

    final static public String loadAnimalType = "select id, type from public.\"AnimalType\"";
    final static public String loadTiming = "select id, first, second, third, fourth, fifth from public.\"timing\"";
    final static public String loadStatusWay = "select * from public.\"StatusWay\"";
    final static public String loadFood = "select id, food from public.\"Food\"";
    final static public String loadEnviroment = "select id, environment from public.\"Environment\"";
    final static public String loadPaddookType = "select id, type from public.\"PaddookType\"";


    //--------------------------------OnCreate---------------------------

    public static String addAnimal;
    public static String addPaddook;
    public static String addAnimalType;
    public static String addTiming;
    public static String addPaddookType;

    public void createAddAnimalQuery(int id, int type, int cost, int environment, int paddook, int timing, String status, int status_way, int food) {
        addAnimal = "insert into Animals (" + id + ", " + type + ", " + cost + ", " + environment + ", " + paddook + ", " + timing + ", " + status + ", " + status_way + ", " + food + ") values";
    }

    public void createAddPaddookQuery(int id, int paddook_type, int food, boolean dangerous) {
        addPaddook = "insert into public.\"Paddook\" (id, type, food , dengirous )" +
                " values(" + id + ", " + paddook_type + ", " + food + ", " + dangerous + ")";
    }

    public void createAddAnimalTypeQuery(int id, String type) {
        addAnimalType = "insert into AnimalTypes (" + id + ", " + type + ") values ";
    }

    public void createAddTiming(int id, Time o, Time t, Time tr, Time fo, Time fi) {
        addTiming = "insert into Timing (" + id + ", " + o + ", " + t + ", " + tr + ", " + fo + ", " + fi + ") values ";
    }

    public void createAddPaddookTypeQuery(int id, String type) {
        addPaddookType = "insert into public.\"PaddookType\" (id ,type ) values ("+id+",'"+type+"')";
    }

    //------------------------------Update---------------------------

    final static public String updateStatusWay = "update Animal set status_way=";
    //final static public String updateAnimal
    //final static public String updatePaddook


}
