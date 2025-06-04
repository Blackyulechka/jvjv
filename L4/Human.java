package L4;

abstract class Human {
    public String name;
    public String passport;

    public Human(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public abstract double GetSum(double Sum, Human typeHuman);

    public abstract boolean isTaxable();

    @Override
    public String toString() {
        return name + " (" + passport + ")";
    }
}