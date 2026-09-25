public class Cliente {
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
}
