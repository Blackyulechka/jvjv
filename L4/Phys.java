package L4;

class Phys extends Human {
    public Phys(String name, String Passport) {
        super(name, Passport);
    }
    @Override
    public double GetSum(double Sum, Human type_Human) {
        return type_Human.isTaxable() ? Sum * 0.15:0 ;
    }
    @Override
    public boolean isTaxable() {
        return false;
    }
}