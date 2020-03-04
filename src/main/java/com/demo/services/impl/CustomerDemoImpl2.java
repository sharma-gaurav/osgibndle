package com.demo.services.impl;

import com.demo.services.CustomerDemo;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.osgi.service.component.propertytypes.ServiceVendor;


@Component(immediate = true, service = CustomerDemo.class, property = {"version=2.0"})
@ServiceDescription("Customer Demo Service Impl 2.0")
@ServiceVendor("Not TTN")
//@ServiceRanking(Integer.MAX_VALUE)
public class CustomerDemoImpl2 implements CustomerDemo {

    @Activate
    protected void activate() {
        System.out.println("Default customer name is " + null);
        System.out.println("Default customer address is " + null);
    }

    public String getClassName() {
        return "com.demo.services.impl.CustomerDemoImpl2";
    }

    @Deactivate
    public void deactivate() {
        System.out.println("com.demo.services.impl.CustomerDemoImpl2 Deactivated");
    }
}

