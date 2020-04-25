package com.belajar.crudwithjwt.model;

import javax.persistence.*;

@Entity
@Table(name = "untukbelajar")
public class UntukBelajar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private int age;

    public UntukBelajar() {
    }

    public UntukBelajar(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "untukbelajar{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", email="+ email + '\'' +
                ", age="+ age + '\'' +
                "}";
    }
}
