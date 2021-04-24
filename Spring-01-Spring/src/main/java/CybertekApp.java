import com.interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        //LOAD THE SPRING CONF FILE
        ApplicationContext container  = new ClassPathXmlApplicationContext("config.xml");

        //RETRIEVE BEAN FRROM SPRING CONTAINER
       Mentor mentor = container.getBean("fullTimeMentor",Mentor.class);

       //or
        Mentor mentor2 = (Mentor) container.getBean("fullTimeMentor");




    }
}
