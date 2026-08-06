import java.lang.reflect.Array;

public class Contato {
    private String nome;
    private String telefone;
    //private String email; // opcional a inclusão dessa informação pelo usuário

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // public int buscaBinaria(String telefone, Array[] lista){
    //     //Receber um nome e retornar uma posição
    //     //target = nome.charAt(0)
    //     //middle = tamanho (da array ja povoada)

    //     //NOTA: depois mudar o tamanho fixo (10) para o tamanho dinamico variavel.

    //     //char target = nome.charAt(0);
    //     //int middle = (lista.length)/2;

    //     //LO e HI

    //     int lo = 0;
    //     int hi = lista.length;

        // while (lo<hi){
        //     int middle = (lo + hi)/2;

        //     if (lista[middle] == Integer.parseInt(telefone)){
        //         return middle + 1;
        //     } else if (Integer.parseInt(telefone) < lista[middle]){

        //     }


        // }
        // //Trow Exception que nao achou o nome
        // return;
    }