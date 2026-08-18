import java.util.Stack;
import java.util.Random;
void main() {
    Random random = new Random();
    Stack<Integer> pilha = new Stack<>();

    //Entrar com o numero de elementos a se criar
    int n = 10;
    //Contador (deixar em 0)
    int i = 0;

    while (i <= n){
        pilha.push(random.nextInt(100));
        i++;
        //Esta funcionando como o devido
        //System.out.println(pilha.pop());
    }

    Vetorsimples lista = new Vetorsimples(10);
    Vetorsimples.checkarDuplicata(lista.getVetor(), 67);
//    Vetorsimples.ordenar();
//    Vetorsimples.inserir();

}