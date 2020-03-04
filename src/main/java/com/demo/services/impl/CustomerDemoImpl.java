package com.demo.services.impl;

import com.demo.CustomerConfig;
import com.demo.services.CustomerDemo;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.osgi.service.component.propertytypes.ServiceVendor;
import org.osgi.service.metatype.annotations.Designate;

@Component(immediate = true, service = CustomerDemo.class, property = {"version=1.0"})
//@ServiceRanking(10)
@ServiceDescription("Customer Demo Service Impl 1.0")
@ServiceVendor("TTN")
@Designate(ocd = CustomerConfig.class)
public class CustomerDemoImpl implements CustomerDemo {

    @Activate
    private CustomerConfig customerConfig;

    @Activate
    protected void activate(final CustomerConfig customerConfig) {
        System.out.println("Default customer name is " + customerConfig.CUST_NAME());
        System.out.println("Default customer address is " + customerConfig.CUST_ADDR());
    }

    @Modified
    protected void modified(final CustomerConfig customerConfig) {
        System.out.println("New customer name is " + customerConfig.CUST_NAME());
        System.out.println("New customer address is " + customerConfig.CUST_ADDR());
    }

    public String getClassName() {
        return "com.demo.services.impl.CustomerDemoImpl";
    }

    @Deactivate
    public void deactivate() {
        System.out.println("com.demo.services.impl.CustomerDemoImpl Deactivated");
    }
}