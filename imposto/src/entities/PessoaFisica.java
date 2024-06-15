package entities;

public class PessoaFisica extends Pessoa{

    private Double healthSpending;

    public PessoaFisica(){
    }
    public PessoaFisica(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }


    public Double tax() {
        Double tax;
        if (annualIncome < 20000.0) {
            tax = annualIncome * 0.15 - healthSpendingDiscount(healthSpending);
        }
        else {
            tax = annualIncome * 0.25 - healthSpendingDiscount(healthSpending);
        }
        return tax;
    }

    public Double healthSpendingDiscount(Double healthSpending) {
        return healthSpending / 2;
    }

    @Override
    public String toString() {
        String txt = String.format("%s: $%.2f", name, tax());
        return txt;
    }
}
