package com.day10;

public class ObjectChaining1 {
    private String name;
    private ObjectChaining2 obj2;
    private ObjectChaining3 obj3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectChaining2 getObj2() {
        return obj2;
    }

    public void setObj2(ObjectChaining2 obj2) {
        this.obj2 = obj2;
    }

    public ObjectChaining3 getObj3() {
        return obj3;
    }

    public void setObj3(ObjectChaining3 obj3) {
        this.obj3 = obj3;
    }
}
