package L4;

class Yur extends Human {
    private double NDS;

    public Yur(String name, String Passport, double NDS) {
        super(name, Passport);
        this.NDS = NDS;
    }

    @Override
    public double GetSum(double Sum, Human type_Human) {
        return type_Human.isTaxable() ? Sum * NDS: Sum * 0.13;
    }

    @Override
    public boolean isTaxable() {
        return true;
    }
}