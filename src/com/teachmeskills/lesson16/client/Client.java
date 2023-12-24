package com.teachmeskills.lesson16.client;

import com.teachmeskills.lesson16.constant.PassportNumber;
import com.teachmeskills.lesson16.description.Description;

import java.util.List;

public class Client implements PassportNumber {

    private String name;
    private String dateRegistration;
    private int age;
    private List<Description> order;

    public Client(String name, String dateRegistration, int age, List<Description> order) {
        this.name = name;
        this.dateRegistration = dateRegistration;
        this.age = age;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Description> getOrder() {
        return order;
    }

    public void setOrder(List<Description> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", dateRegistration='" + dateRegistration + '\'' +
                ", age=" + age +
                ", order=" + order +
                '}';
    }

}
