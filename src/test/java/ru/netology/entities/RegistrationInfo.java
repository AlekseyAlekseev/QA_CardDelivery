package ru.netology.entities;


public class RegistrationInfo {

    private final String city;
    private final String name;
    private final String phone;


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public RegistrationInfo(String city, String name, String phone) {
        this.city = city;
        this.name = name;
        this.phone = phone;

    }
}
