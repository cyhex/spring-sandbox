package de.cms.demo;

import java.util.List;

public class Service {
    private String xxx;

    List list;

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void print() {
        System.out.println(xxx + " " + "xxx");
    }
}
