package com.jobanalysis.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {



    public Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

//    protected static final Log logger = LogFactory.getLog(DemoApplicationTests.class);

    @Test
    public void contextLoads() throws InterruptedException {
        while (true) {
            // 每隔两秒log输出一下当前系统时间戳
            logger.info("xxxxxxxxxxxxx");
            //System.out.println(new Date().getTime());
            Thread.sleep(2000);
            try {
                throw new Exception("exception msg");
            } catch (Exception e) {
                logger.error("error:" + e.getMessage());
            }
        }

    }

}
