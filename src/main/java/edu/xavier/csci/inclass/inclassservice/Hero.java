package edu.xavier.csci.inclass.inclassservice;

public class Hero {
    private String name;
    private Integer id;

    public Hero() {}
    public Hero(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
