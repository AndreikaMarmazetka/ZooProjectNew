package Model;

import Model.Connect.ConnectionBD;
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
        Scanner in = new Scanner(System.in);
        System.out.print("Hello");
        ConnectionBD connection = ConnectionBD.getInstance();
        connection.Connect();

    }
}
