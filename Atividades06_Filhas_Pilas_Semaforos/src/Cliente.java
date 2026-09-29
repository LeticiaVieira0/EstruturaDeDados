//implementar comparador para poder fazer a fila

public class Cliente implements Comparable<Cliente> {
    private int tempoAtendimento;
    private int id;

    public Cliente(int tempoAtendimento, int id) {
        this.tempoAtendimento = tempoAtendimento;
        this.id = id;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    public int getId() {
        return id;
    }

    public void setTempoAtendimento(int tempoAtendimento) {
        this.tempoAtendimento = tempoAtendimento;
    }

    @Override
    public int compareTo(Cliente o) {
        return 0;
    }
}
