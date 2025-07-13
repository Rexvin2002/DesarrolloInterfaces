package crudof;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Socio {

    private String name;
    private int age;
    private double monthlyFee;
    private String membershipType;

    public Socio(String name, int age, double monthlyFee, String membershipType) {
        this.name = name;
        this.age = age;
        this.monthlyFee = monthlyFee;
        this.membershipType = membershipType;
    }

    // Getters y Setters para cada campo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
