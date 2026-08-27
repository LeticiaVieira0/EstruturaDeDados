import java.util.Stack;
import java.util.Random;

//A vida é desafio, racionais mc:
//O aprendizado foi duro
//E mesmo diante desse revés não parei de sonhar
//Fui persistente, porque o fraco não alcança a meta

//Talvez crashe o pc da escola, eu nao me responsabilizo por eventuais dolos
//caso nao compile

//Notas sobre esse codigo espagheti:
//A escolha da arquitetura foi tão merda que parece que eu estou
//trabalhando em cima de um código legado, não creio que eu parei
//o desenvolvimento do meu plugin de minecraft pra essa bomba
//ficar retornando -1 cara QUE ODIO MALUCO

//A arquitetura foi a seguinte:
//Checkagem de duplicata O(logn) (binary search)
//Inserção O(1) (na ultima casa)
//Ordenação O(n^2)

void main() {
    Random random = new Random();
    Stack<Integer> pilha = new Stack<>();

    //Entrar com o numero de elementos a se criar
    int mil = 100;
    Vetor listaMil = new Vetor(mil);
    int dezMil = 1000;
    Vetor listaDezMil = new Vetor(dezMil);
    int cemMil = 10000;
    Vetor listaCemMil = new Vetor(cemMil);

    //Contador (deixar em 0)
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < mil){
        pilha.push(random.nextInt(100));

        if (listaMil.checkarDuplicata(pilha.peek()) == false){
            listaMil.inserir(pilha.pop());
            listaMil.ordenar();
            //i++;
        }else if (listaMil.checkarDuplicata(pilha.peek()) == true){
            pilha.pop();
        }
        i++;
    }

    while (j < dezMil){
        pilha.push(random.nextInt(1000));

        if (listaDezMil.checkarDuplicata(pilha.peek()) == false){
            listaDezMil.inserir(pilha.pop());
            listaDezMil.ordenar();
            //j++;
        }else if (listaDezMil.checkarDuplicata(pilha.peek()) == true){
            pilha.pop();
        }
        j++;
    }

    while (k < cemMil){
        pilha.push(random.nextInt(10000));

        if (listaCemMil.checkarDuplicata(pilha.peek()) == false){
            listaCemMil.inserir(pilha.pop());
            listaCemMil.ordenar();
            //k++;
        }else if (listaCemMil.checkarDuplicata(pilha.peek()) == true){
            pilha.pop();
        }
        k++;
    }

    int milContador = listaMil.getContador();
    int dezMilContador = listaDezMil.getContador();
    int cemMilContador = listaCemMil.getContador();

    int[] milVetor = listaMil.getVetor();
    int[] dezVetor = listaDezMil.getVetor();
    int[] cemVetor = listaCemMil.getVetor();

    int milUltimo = milVetor[listaMil.getContador()-1];
    int dezUltimo = dezVetor[listaDezMil.getContador()-1];
    int cemUltimo = cemVetor[listaCemMil.getContador()-1];

//    @SuppressWarnings("Cara eu sei que pode ser 0 brigada por me avisar")
    int milPrimeiro = milVetor[listaMil.getContador() - listaMil.getContador()];
    int dezPrimeiro = dezVetor[listaDezMil.getContador() - listaDezMil.getContador()];
    int cemPrimeiro = cemVetor[listaCemMil.getContador()- listaCemMil.getContador()];

    System.out.println("Acessando os ultimos elementos em busca linear: ");

    System.out.println(listaMil.buscaLinear(milUltimo));
    System.out.println(listaDezMil.buscaLinear(dezUltimo));
    System.out.println(listaCemMil.buscaLinear(cemUltimo));
    System.out.println("");

    System.out.println("Acessando os primeiros elementos em busca linear:");
    System.out.println(listaMil.buscaLinear(milPrimeiro));
    System.out.println(listaDezMil.buscaLinear(dezPrimeiro));
    System.out.println(listaDezMil.buscaLinear(cemPrimeiro));
    System.out.println("");

    System.out.println("Acessando os ultimos elementos em busca binaria");
    System.out.println(listaMil.buscaBinaria(milUltimo));
    System.out.println(listaDezMil.buscaBinaria(dezUltimo));
    System.out.println(listaCemMil.buscaBinaria(cemUltimo));
    System.out.println("");

    System.out.println("Procurando o primeiro elemento em busca binaria");
    System.out.println(listaMil.buscaBinaria(milPrimeiro));
    System.out.println(listaDezMil.buscaBinaria(dezPrimeiro));
    System.out.println(listaCemMil.buscaBinaria(cemPrimeiro));
    System.out.println("");

    //Seguinte aqui nao tem discussão né que vou mandar o gabarito pra entregar logo
    //pra voltar pro meu dev. de plugin de minecraft

    //busca linear
    //Melhor caso: O(1)
    //Pior caso: O(n) em que n é o tamanho da array

    //Busca binaria
    //Melhor caso: O(1)
    //Pior caso: O(logn) em que n é o tamanho da array

    //Em ambos casos a complexidade da memória é O(1)

}
