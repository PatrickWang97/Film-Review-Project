package com.jobanalysis.demo.entity;

public class Manager {
    private String managerName;

    private Integer id;

    private String password;

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerName='" + managerName + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}