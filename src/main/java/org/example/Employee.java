package org.example;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty("id")
    private int employeeId;

    private int id;
    private String name;
    private int age;
    private String position;
    private List<String> skills;

    // Геттеры
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public List<String> getSkills() { return skills; }

    // Сеттеры
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPosition(String position) { this.position = position; }
    public void setSkills(List<String> skills) { this.skills = skills; }
}