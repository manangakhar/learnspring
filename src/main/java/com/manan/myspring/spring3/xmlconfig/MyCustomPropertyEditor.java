package com.manan.myspring.spring3.xmlconfig;

import java.beans.PropertyEditorSupport;

public class MyCustomPropertyEditor extends PropertyEditorSupport {
    /**
     * Sets the property value by parsing a given String.  May raise
     * java.lang.IllegalArgumentException if either the String is
     * badly formatted or if this kind of property can't be expressed
     * as text.
     *
     * @param text The string to be parsed.
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        final String[] split = text.split("#");
        this.setValue(new MyEditorEntity(split[0], Integer.parseInt(split[1])));
    }
}
