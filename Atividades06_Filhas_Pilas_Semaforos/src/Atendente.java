public class Atendente {
    private int id;
    private boolean flag;

    public Atendente(int id) {
        this.id = id;
        this.flag = true;
    }

    public int getId() {
        return id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean state){
        this.flag = state;
    }

}
