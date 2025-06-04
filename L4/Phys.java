package L4;

class Phys extends Human {
    public Phys(String name, String passport) {
        super(name, passport);
    }

    @Override
    public double GetSum(double Sum, Human typeHuman) {
        return typeHuman.isTaxable() ? Sum * 0.15 : 0;
    }

    @Override
    public boolean isTaxable() {
        return false;
    }
}