package de.cms.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"de.cms.demo"})
public class JobOne {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JobOne.class);
        JobOne app = ctx.getBean(JobOne.class);
        app.run();
    }

    Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    private void run() {
        service.print();
        service.print();
        service.print();
        service.print();
    }
}
