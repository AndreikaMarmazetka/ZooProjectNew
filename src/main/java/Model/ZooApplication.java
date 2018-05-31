package Model;

import DAO.load.FirstLoad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ZooApplication {


    public static void LoadModel() {
        SpringApplication.run(ZooApplication.class);
        FirstLoad fl = new FirstLoad();
         fl.loadObjects();
        //  System.out.println(AnimalBox.getInstance().getListAnimal(0).getType());
    }
}
