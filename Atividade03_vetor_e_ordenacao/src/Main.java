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
        pilha.push(random.nextInt(100));
        lista.inserir(pilha.pop());
        i++;
        //Esta funcionando como o devido
        //System.out.println(pilha.pop());
    }

//    Vetorsimples.ordenar();
//    Vetorsimples.inserir();


    lista.printar();
    System.out.println("");

    lista.ordenar();
    System.out.println(""+lista.checkarDuplicata(1));
    lista.printar();



}
