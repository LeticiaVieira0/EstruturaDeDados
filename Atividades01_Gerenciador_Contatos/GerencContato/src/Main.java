void main() {
    Contato listContatos[] = new Contato[10];

    //Vamos considerar que já esta ordenada
    //Mas se não tivesse bastava um Arrays.sort(listContatos);

    listContatos[0] = new Contato("Arthur", "55480001");
    listContatos[1] = new Contato("Barbara","55480002");
    listContatos[2] = new Contato("Carlos", "55489999");
    listContatos[3] = new Contato("Duda", "55480000");
    listContatos[4] = new Contato("Eduardo", "55480089");
    listContatos[5] = new Contato("Fernanda","55480046");
    listContatos[6] = new Contato("Gabriel", "55480040");
    listContatos[7] = new Contato("Helena","55480007");
    listContatos[8] = new Contato("Isabela", "55480003");
    listContatos[9] = new Contato("Joao", "55480099");

    //Chamar Função de busca binaria

    //EXEMPlO: buscaBinaria("Isabela", listContatos)
    //RETURN: "Isabela esta na 8+1 posição"

    //EXEMPLO: buscaBinaria("Bubu", listContatos)
    //RETURN : "Bubu não esta na lista"
    
    //System.out.println("Nome 1: "+ listContatos[0].getNome() + "\nTelefone 1: " + listContatos[0].getTelefone());

    //Primeiro contato = contatinhos[0][0], contatinhos[0][1]
    //Segundo contato = contatinhos[1][0], contatinhos[1][1]
    //Terceiro contato = contatinhos[2][0], contatinhos[2][1]
    //Quarto contato = contatinhos[3][0], contatinhos[3][1]
    String[][] contatinhos = {{"Arthur", "55480001"}, 
    {"Barbara","55480002"}, 
    {"Carlos", "55489999"},
    {"Duda", "55480000"}};

    System.out.println(contatinhos[3][1]);

    /*
    Agora com essa array de duas dimensoes podemos mais facilmente acessar elementos, segue ex:
    para nomes for [i][0] i++
    para telefones for [i][1] i++

    Mas não da para adicionar porque as casas ja foram povoadas para definir tamanho usa-se:
    String[][] contatinhos = new String[m][n]
    Em que m = numero de contatos totais
    Em que n = numero de informações (no caso {nome, telefone})

    No exemplo Contatinhos a tabela ficou mais ou menos assim

    -------------------------------------------------------
    Nome:     Arthur   |  Barbara  |  Carlos   |  Duda
    Telefone: 55480001 |  55480002 |  55489999 |  55480000
    --------------------------------------------------------
    
    */

}