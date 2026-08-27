import java.util.Stack;
import java.util.Random;
void main() {
    Random random = new Random();
    Stack<Integer> pilha = new Stack<>();

    //Entrar com o numero de elementos a se criar
    int n = 10;
    Vetorsimples lista = new Vetorsimples(n);

    //Contador (deixar em 0)
    int i = 0;

    while (i < n){
        pilha.push(random.nextInt(10));
//        System.out.println("lista.getContador(): "+lista.getContador());
//        System.out.println("pilha.peek(): "+pilha.peek());

        if (lista.checkarDuplicata(pilha.peek()) == false){
            lista.inserir(pilha.pop());
            lista.ordenar();
        }else if (lista.checkarDuplicata(pilha.peek()) == true){
            pilha.pop();
        }
        i++;

    }
    lista.printar();
}
