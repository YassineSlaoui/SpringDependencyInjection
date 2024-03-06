package com.ys.MainApp;

import com.ys.MainApp.impl.Vehicle;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext rootContext = new ClassPathXmlApplicationContext("springContext.xml");

        // Instantiating the obj1 via Constructor DI
        Vehicle obj1 = (Vehicle) rootContext.getBean("injectWithConstructor");

        // Instantiating the obj1 via Setter DI
        Vehicle obj2 = (Vehicle) rootContext.getBean("injectWithSetter");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }
}
