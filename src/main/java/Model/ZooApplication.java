package Model;

import Model.Connect.ConnectionBD;
import Model.Connect.load.FirstLoad;
import Model.create.objects.AnimalBox;
import View.MainWindow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.util.Scanner;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ZooApplication {


    public static void LoadModel() {
        SpringApplication.run(ZooApplication.class);
        FirstLoad fl = new FirstLoad();
        fl.loadObjects();
        System.out.println(AnimalBox.getInstance().getListAnimal(0).getType());
    }
}
