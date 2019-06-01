package com.manan.myspring.spring3.xmlconfig;

import java.util.Date;

public class MyCustomPropertyEntity {
    Date date;

    public MyCustomPropertyEntity(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyCustomPropertyEntity{" +
                "date=" + date +
                '}';
    }
}
