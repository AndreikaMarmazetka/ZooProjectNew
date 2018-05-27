package Model;

import Model.Connect.ConnectionBD;
import Model.Connect.load.FirstLoad;
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


    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);
        /*ConnectionBD connection = ConnectionBD.getInstance();
        connection.Connect();*/
        FirstLoad fl = new FirstLoad();
        fl.loadObjects();
        MainWindow mw = new MainWindow();
        mw.loadWindow();
    }


}
