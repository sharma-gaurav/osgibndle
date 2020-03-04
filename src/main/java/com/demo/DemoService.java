package com.demo;

import com.demo.services.CustomerDemo;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component
public class DemoService {

//    @Reference(target = "(version=2.0)")
    @Reference
    private CustomerDemo customerDemo;

    @Activate
    public void activate() {
        System.out.println("com.demo.DemoService Activated " + customerDemo.getClassName());
    }

    @Deactivate
    public void deactivate() {
        System.out.println("com.demo.DemoService Deactivated");
    }
}