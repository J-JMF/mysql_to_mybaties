package com.example.mysql_to_mybaties.entity;

public class Web {
    private int id;
    private String name;
    private String url;
    private  int alexa;
    private String  country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAlexa() {
        return alexa;
    }

    public void setAlexa(int alexa) {
        this.alexa = alexa;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUrl() {
        return url;
    }
    @Override
    public String toString() {
        return "websites{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
