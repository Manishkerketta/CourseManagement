package com.springrestfulapi.restApi.entity;

public class Course {
    private long id;
    private String title;
    private String description;
    public Course(long id,String title,String description){
        super();
        this.id=id;
        this.title=title;
        this.description=description;
    }
    public Course(){
        super();
    }
    public long getId(){
        return id;
    }
    public void setId(long i){
        this.id=i;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description= this.description;
    }
}
