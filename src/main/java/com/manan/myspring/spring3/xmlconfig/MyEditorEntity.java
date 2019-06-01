package com.manan.myspring.spring3.xmlconfig;

import java.util.StringJoiner;

public class MyEditorEntity {
    String a;
    int b;

    public MyEditorEntity(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyEditorEntity.class.getSimpleName() + "[", "]")
                .add("a='" + a + "'")
                .add("b=" + b)
                .toString();
    }
}
