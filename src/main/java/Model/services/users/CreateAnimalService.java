package Model.services.users;

import Model.Connect.create.CreateBDObject;
import Model.ZooApplication;
import Model.create.objects.CreateAnimalAndPaddook;
import Model.create.objects.PaddookBox;
import Model.create.objects.TimingBox;
import Model.objects.Lists.*;
import Model.objects.Timing;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateAnimalService {
    private static CreateAnimalService ourInstance = new CreateAnimalService();

    public static CreateAnimalService getInstance() {
        return ourInstance;
    }

    private CreateAnimalService() {
        //
    }

    public void createAnimal(int type, int cost, int enviroment, int padook, String timing1, String timing2, String timing3, String timing4,
                             String timing5, String status, int status_way, int food) {
        Timing t = new Timing();
        t.setFirst(StringtoTime(timing1));
        t.setSecond(StringtoTime(timing2));
        t.setThird(StringtoTime(timing3));
        t.setFource(StringtoTime(timing4));
        t.setFifth(StringtoTime(timing5));
        new CreateAnimalAndPaddook().createAnimal(AnimalType.getInstance().getAnimalTypeList(type), cost,
                Enviroments.getInstance().getListEnvironment(enviroment),
                PaddookBox.getInstance().getListPaddook(padook).getType(), StringtoTime(timing1), StringtoTime(timing2), StringtoTime(timing3), StringtoTime(timing4),
                StringtoTime(timing5),
                status, StatusWay.getInstance().getStatusesList(status_way), Food.getInstance().getFoodList(food)
        );
        new CreateBDObject().createAnimalBD(type, cost, enviroment, padook, TimingBox.getInstance().getSizeList() - 1, status, status_way, food);
    }

    public Time StringtoTime(String str) {
        DateFormat format = new SimpleDateFormat("HH:mm");
        Time time;
        try {
            time = (Time) format.parse(str);
            return time;
        } catch (ParseException ex) {
            Logger.getLogger(ZooApplication.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
