package Model;

public class Query {
    // ----------------------------------OnStartProgram--------------------
    final static public String loadAnimal = "SELECT Select a.id, aty.type, a.cost, e.enviroment, pt.paddook, s.status, st.status_way " +
            "ON a.type=aty.id " +
            "left join Enviroment e on a.enviroment = e.id " +
            "left join Paddook p on a.paddook = p.id " +
            "left join  StetusWay";
    final static public String loadPaddook = "SELECT p.type from Paddook p left JOIN PaddookType pt on p.type = pt.id";
    final static public String loadAnimalType = "select id, type from AnimalType;";
    final static public String loadEnviroment = "select id, enviroment from Enviroment";
    final static public String loadStatusWay = "select * from StatusWay";

    //--------------------------------OnSearch---------------------------

    final static public String StartQueryAnimalString = "Select a.id, aty.type, a.cost, e.enviroment, pt.paddook, st.status_way from Animal";
}
