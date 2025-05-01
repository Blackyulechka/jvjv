package L4;

abstract class Human {
    String name;
    String Passport;
    public Human(String name, String Passport) {
        this.name = name;
        this.Passport = Passport;
    }
    public abstract double GetSum(double Sum, Human type_Human);
    public abstract boolean isTaxable();
    @Override
    public String toString() {
        return name + " (" + Passport + ")";
    }
}