public class Funcionario {
    //Equipe de funcionarios
    private int quantidadeFuncionarios;
    private double salario;
    private double custoTotal;

    public Funcionario(int quantidadeFuncionarios, double salario, double custoTotal) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salario = salario;
        this.custoTotal = custoTotal;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
