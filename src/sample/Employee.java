package sample;

import java.util.Objects;

public class Employee {

    //fields
    private String email;
    private String firstName;
    private String lastName;
    private Money salary;

    //constructors
    public Employee(String email, String firstName, String lastName, Money salary){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //methods

    public String getEmail(){
        return this.email;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String setFirsName(String name){
        this.firstName = name;
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String setLastName(String name){
        this.lastName = name;
        return this.lastName;

    }

    public Money getSalary(){
        return this.salary;
    }

    public void setSalary(Money salary) {
        this.salary = salary;

    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (!(obj instanceof Employee)) return false;
        final Employee that = (Employee) obj;
        return (this.email.equals(that.getEmail())
                && this.firstName.equals(that.getFirstName()))
                && this.lastName.equals(that.getLastName())
                && this.salary.equals(that.getSalary());

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.firstName, this.lastName, this.salary);
    }

}
