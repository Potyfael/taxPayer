package entities;

public class PessoaJuridica extends Pessoa{

    private Integer employeesQuantity;

    public PessoaJuridica(String name, Double annualIncome, Integer employeesQuantity) {
        super(name, annualIncome);
        this.employeesQuantity = employeesQuantity;
    }

    public PessoaJuridica(Integer employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }

    public Integer getEmployeesQuantity() {
        return employeesQuantity;
    }

    public void setEmployeesQuantity(Integer employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }
    public Double tax() {
        if (employeesQuantity > 10) {
            return annualIncome * 0.14;
        }
        else {
            return annualIncome * 0.16;
        }
    }
    @Override
    public final String toString() {
        return super.toString();
    }
}
