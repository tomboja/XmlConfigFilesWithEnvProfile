package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.service.DbService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @ProjectName: XmlConfigFilesWithEnvProfile
 * @Author: Temesgen D.
 * @Date: 3/4/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");

        //====================== SINGLE XML CONFIG FILES WITH DIFFERENT PROFILES

        /**
         * If config.xml is passed as parameter to GenericXmlApplicationContext(),
         * context load and context refresh are not needed
         */
//        GenericXmlApplicationContext springContext = new GenericXmlApplicationContext();
//        springContext.load("config.xml");
//        springContext.refresh();
//
//        DbService dbService = (DbService) springContext.getBean("dbService");
//        dbService.connect();


        //====================== MULTIPLE XML CONFIG FILES WITH DIFFERENT PROFILES

//        GenericXmlApplicationContext springConfig = new GenericXmlApplicationContext();
        GenericXmlApplicationContext springConfig = new GenericXmlApplicationContext("separateConfig*.xml");
//        springConfig.load("separateConfig*.xml");
//        springConfig.refresh();

//        DbService dbService = (DbService) springConfig.getBean("dbService");
        DbService dbService = springConfig.getBean(DbService.class);
        dbService.connect();

        System.out.println("Ending...");
    }
}
