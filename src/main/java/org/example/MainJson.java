package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.io.IOException;

public class MainJson {
    private static final String JSON = "{\n" +
            "  \"company\": \"Tech Solutions\",\n" +
            "  \"employees\": [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Alice Smith\",\n" +
            "      \"age\": 30,\n" +
            "      \"position\": \"Software Engineer\",\n" +
            "      \"skills\": [\"Java\", \"Spring\", \"SQL\"]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"name\": \"Bob Johnson\",\n" +
            "      \"age\": 25,\n" +
            "      \"position\": \"Data Analyst\",\n" +
            "      \"skills\": [\"Python\", \"Pandas\", \"Excel\"]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"name\": \"Charlie Brown\",\n" +
            "      \"age\": 35,\n" +
            "      \"position\": \"Project Manager\",\n" +
            "      \"skills\": [\"Agile\", \"Scrum\", \"Leadership\"]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"name\": \"David Miller\",\n" +
            "      \"age\": 28,\n" +
            "      \"position\": \"Backend Developer\",\n" +
            "      \"skills\": [\"Java\", \"Kotlin\", \"Microservices\"]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"location\": {\n" +
            "    \"address\": \"456 Technology Dr\",\n" +
            "    \"city\": \"Innovate City\",\n" +
            "    \"state\": \"CA\",\n" +
            "    \"zip\": \"90210\"\n" +
            "  },\n" +
            "  \"established\": 2010\n" +
            "}";

    public static void main(String[] args) {
        try {
            Company company = JsonParser.parseCompanyJson(JSON);

            // 1. Сотрудники старше 25 лет
            List<Employee> employeesOver25 = company.getEmployees().stream()
                    .filter(employee -> employee.getAge() > 25)
                    .collect(Collectors.toList());

            System.out.println("Сотрудники старше 25 лет:");
            employeesOver25.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getAge()));
            System.out.println("-----");

            // 2. Сотрудник с ID = 3
            Optional<Employee> employeeWithId3 = company.getEmployees().stream()
                    .filter(employee -> employee.getId() == 3)
                    .findFirst();

            if (employeeWithId3.isPresent()) {
                Employee employee = employeeWithId3.get();
                System.out.println("Сотрудник с ID = 3: " + employee.getName());
                System.out.println("-----");
            } else {
                System.out.println("Сотрудник с ID = 3 не найден.");
                System.out.println("-----");
            }

            // 3. Сотрудники со знанием Java
            List<Employee> javaEmployees = company.getEmployees().stream()
                    .filter(employee -> employee.getSkills().contains("Java"))
                    .collect(Collectors.toList());

            System.out.println("Сотрудники со знанием Java:");
            javaEmployees.forEach(employee -> {
                System.out.println("Имя: " + employee.getName());
                System.out.println("Возраст: " + employee.getAge());
                System.out.println("Должность: " + employee.getPosition());
                System.out.println("Навыки: " + employee.getSkills());
                System.out.println("-----");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}