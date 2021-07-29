package swat018.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunnner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SpringRunnner.class);

    @Autowired
    private String hello;

    @Autowired
    private JinwooProperties jinwooProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("=======================");
        logger.info(hello);
        logger.info(jinwooProperties.getName());
        logger.info(jinwooProperties.getFullName());
        logger.info("=======================");
    }
}