package swat018.springinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunnner implements ApplicationRunner {

    @Value("${jinwoo.fullname}")
    private String name;

    @Value("${jinwoo.age}")
    private String age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=======================");
    }
}
