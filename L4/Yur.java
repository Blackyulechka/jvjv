package L4;

class Yur extends Human {
    private double NDS;

    public Yur(String name, String passport, double NDS) {
        super(name, passport);
        this.NDS = NDS;
    }

    @Override
    public double GetSum(double Sum, Human typeHuman) {
        return typeHuman.isTaxable() ? Sum * NDS : Sum * 0.13;
    }

    @Override
    public boolean isTaxable() {
        return true;
    }
}