package org.example.model.entity;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String birthday;
    private String empployeeStartedDay;
    private int payroll;


    public Employee(String name, String surname, String patronymic,
                    String birthday, String empployeeStartedDay, int payroll) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.empployeeStartedDay = empployeeStartedDay;
        this.payroll = payroll;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmpployeeStartedDay() {
        return empployeeStartedDay;
    }

    public void setEmpployeeStartedDay(String empployeeStartedDay) {
        this.empployeeStartedDay = empployeeStartedDay;
    }

    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", empployeeStartedDay='" + empployeeStartedDay + '\'' +
                ", payroll=" + payroll +
                '}';
    }
}
