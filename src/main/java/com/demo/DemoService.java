package com.demo;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class DemoService {

    @Activate
    public void activate() {
        System.out.println("com.demo.DemoService Activated");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("com.demo.DemoService Deactivated");
    }
}