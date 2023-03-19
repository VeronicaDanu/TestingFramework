package com.saucedemo.project.utils;

import com.saucedemo.project.driver.DriverType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class DriverTypeConvert implements Converter<DriverType> {
    public DriverType convert(Method method, String s) {
        return DriverType.valueOf(s);
    }
}
