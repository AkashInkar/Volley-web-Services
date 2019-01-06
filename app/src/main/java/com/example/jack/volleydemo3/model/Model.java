package com.example.jack.volleydemo3.model;

public class Model {


   private String name,realname,team,createdby;

    public Model(String name, String realname, String team, String createdby) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.createdby = createdby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
}
