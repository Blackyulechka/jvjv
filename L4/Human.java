package L4;

abstract class Human {
    public String Name;
    public String Passport;
    public Human(String Name, String Passport) {
        this.Name = Name;
        this.Passport = Passport;
    }
    public abstract double GetSum(double Sum, Human type_Human);
    public abstract boolean isTaxable();
    @Override
    public String toString() {
        return Name + " (" + Passport + ")";
    }
}