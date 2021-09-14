package org.example.model.entity;

public class Seniour extends Manager {
    private String name;
    private String surname;
    private String patronymic;
    private String birthday;
    private String empployeeStartedDay;
    private int payroll;
    private String description;

    public Seniour(String name, String surname, String patronymic, String birthday,
                   String empployeeStartedDay, int payroll, String description) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.empployeeStartedDay = empployeeStartedDay;
        this.payroll = payroll;
        this.description = description;
    }

    public Seniour() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String getBirthday() {
        return birthday;
    }

    @Override
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getEmpployeeStartedDay() {
        return empployeeStartedDay;
    }

    @Override
    public void setEmpployeeStartedDay(String empployeeStartedDay) {
        this.empployeeStartedDay = empployeeStartedDay;
    }

    @Override
    public int getPayroll() {
        return payroll;
    }

    @Override
    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Seniour{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", empployeeStartedDay='" + empployeeStartedDay + '\'' +
                ", payroll=" + payroll +
                ", description='" + description + '\'' +
                '}';
    }
}
