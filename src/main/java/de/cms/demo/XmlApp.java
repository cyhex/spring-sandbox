package de.cms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:xmlapp.xml")
public class XmlApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(XmlApp.class);
        XmlApp app = ctx.getBean(XmlApp.class);
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
