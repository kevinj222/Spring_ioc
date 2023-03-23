package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");  
        Sim sm=context.getBean(Sim.class);
        sm.dailing();
        sm.calling();
    }
}
