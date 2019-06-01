package com.manan.myspring.spring3.xmlconfig;

import java.util.List;
import java.util.Map;

public class CollectionsBean {
    List<Object> objectList;
    Map<Object, Object> objectMap;

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "objectList=" + objectList +
                ", objectMap=" + objectMap +
                '}';
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public void setObjectMap(Map<Object, Object> objectMap) {
        this.objectMap = objectMap;
    }
}
