package de.cms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "de.cms.demo")
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
        DemoApplication app = ctx.getBean(DemoApplication.class);

        app.run();
    }

    Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    private void run() {
        service.print();
    }
}
