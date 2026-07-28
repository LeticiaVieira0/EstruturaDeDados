public class Projeto {
    Funcionario equipe;
    Gerente gestor;
    double custoTotal;

    public Projeto(Funcionario equipe, Gerente gestor, double custoTotal) {
        this.equipe = equipe;
        this.gestor = gestor;
        this.custoTotal = custoTotal;
    }

    public Funcionario getEquipe() {
        return equipe;
    }

    public void setEquipe(Funcionario equipe) {
        this.equipe = equipe;
    }

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
