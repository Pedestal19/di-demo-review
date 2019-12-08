package guru.springframework.demo;

import guru.springframework.demo.controllers.MyController;
import guru.springframework.demo.examplebeans.FakeDataSource;
import guru.springframework.demo.examplebeans.FakeJmsBroker;
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
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());

    }

}
