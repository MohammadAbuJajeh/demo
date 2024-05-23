package com.example.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://example.com/demo/helloworld", name = "HelloWorldResponse")
public class HelloWorldResponse {
    private String message;

    @XmlElement(namespace = "http://example.com/demo/helloworld")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
