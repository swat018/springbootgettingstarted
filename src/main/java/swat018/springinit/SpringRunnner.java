package swat018.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunnner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private JinwooProperties jinwooProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(hello);
        System.out.println(jinwooProperties.getName());
        System.out.println(jinwooProperties.getFullName());
        System.out.println("=======================");
    }
}