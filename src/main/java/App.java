import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Пара HW - " + (beanHW1 == beanHW2));
        System.out.println("Пара Cat - " + (beanCat1 == beanCat2));
    }
}