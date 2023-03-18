package com.day14;

public class Employee implements Comparable {
    private String id;
    private String name;
    private String sal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
