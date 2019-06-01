package com.manan.myspring.spring3.xmlconfig;

import java.util.Date;

public class MyCustomPropertyEntity {
    Date date;
    MyEditorEntity myEditorEntity;

    public MyCustomPropertyEntity(Date date) {
        this.date = date;
    }

    public MyCustomPropertyEntity(Date date, MyEditorEntity myEditorEntity) {
        this.date = date;
        this.myEditorEntity = myEditorEntity;
    }

    @Override
    public String toString() {
        return "MyCustomPropertyEntity{" +
                "date=" + date +
                ", myEditorEntity=" + myEditorEntity +
                '}';
    }
}
