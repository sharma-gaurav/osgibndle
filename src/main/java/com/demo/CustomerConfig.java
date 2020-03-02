package com.demo;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name = "Customer Configuration")
public @interface CustomerConfig {
    @AttributeDefinition(name = "Custmer Name")
    String CUST_NAME() default "Customer Default Name";

    @AttributeDefinition(name = "Custmer address")
    String CUST_ADDR() default "Customer Default Value";
}