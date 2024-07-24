package com.assignment1;

import org.json.simple.JSONObject;

public class Department {
    private String departmentId, name, manager;

    public Department(String departmentId, String name, String manager) {
        this.departmentId = departmentId;
        this.name = name;
        this.manager = manager;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", name=" + name + ", manager=" + manager + "]";
    }

    public static Department toDepartment(JSONObject jsonObject) {
        String departmentId = (String) jsonObject.get("departmentId");
        String name = (String) jsonObject.get("name");
        String manager = (String) jsonObject.get("manager");

        return new Department(departmentId, name, manager);
    }
}
