package model;

public class Person{

    private String name;
    private String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return "name: " + this.name; 
    }


}