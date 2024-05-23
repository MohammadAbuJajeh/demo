package com.example.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://example.com/demo/helloworld", name = "HelloWorldRequest")
public class HelloWorldRequest {
    private String name;

    @XmlElement(namespace = "http://example.com/demo/helloworld")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}