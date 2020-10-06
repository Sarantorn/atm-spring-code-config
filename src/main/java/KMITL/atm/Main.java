package KMITL.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);



        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();

        /*String name = atm.validateCustomer(1,1234);
        System.out.println(name + "has" +atm.getBalance());*/


    }
}
