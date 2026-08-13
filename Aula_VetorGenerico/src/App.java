public class App {

    static void main(){

        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Ola mundo");
        System.out.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(999);
        System.out.println(caixaNumero.abrir());
    }
}