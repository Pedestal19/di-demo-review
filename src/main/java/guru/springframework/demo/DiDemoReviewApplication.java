package guru.springframework.demo;

import guru.springframework.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoReviewApplication {

    public static void main(String[] args) {
     ApplicationContext ctx = SpringApplication.run(DiDemoReviewApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
/*

        System.out.println(controller.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
*/

    }

}
