package com.demo.impl;

import com.demo.CustomerConfig;
import com.demo.CustomerDemo;
import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(immediate = true)
@Designate(ocd = CustomerConfig.class)
public class CustomerDemoImpl implements CustomerDemo {
    static final Logger logger = Logger.getLogger(CustomerDemo.class);

    @Activate
    private CustomerConfig customerConfig;

    @Activate
    protected void activate(final CustomerConfig customerConfig) {
        System.out.println("Default customer name is " + customerConfig.CUST_NAME());
        System.out.println("Default customer address is " + customerConfig.CUST_ADDR());
    }
}