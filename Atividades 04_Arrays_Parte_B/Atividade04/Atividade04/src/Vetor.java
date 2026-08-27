public class Vetor {
    int[] vetor;
    int contador;

    public Vetor(int capacidade) {
        vetor = new int[capacidade];
        this.contador = 0;
    }

    public Boolean checkarDuplicata(int elemento) {
        int low = 0;
        int high = contador -1;
        int passos = 0;

//        if(contador <= vetor.length/2){
//            return false;
//        }

        while (low <= high){
            int mid = low + ((high - low) / 2);

            if(vetor[mid] == elemento){
                return true;
            } else if (vetor[mid] > elemento){
                high = mid -1;
            } else {
                low = mid + 1;
            }
            passos++;
        }

        return false;
    }

    public int buscaBinaria(int elemento) {
        int low = 0;
        int high = contador -1;
        int passos = 0;

        while (low <= high){
            int mid = low + ((high - low) / 2);

            if(vetor[mid] == elemento){
                return passos+1;
            } else if (vetor[mid] > elemento){
                high = mid -1;
            } else {
                low = mid + 1;
            }
            passos++;
        }

        return -1;
    }

    public int buscaLinear(int elemento){
        for (int i = 0; i < contador; i++) {
            if (vetor[i] == elemento){
                return i+1;
            }
        }

        return -1;
    }

    public int[] getVetor() {
        return vetor;
    }

    //OK
    public void ordenar(){
        int temp = 0;
        for(int i =0; i<contador;i++){
            for(int j = i+1; j<contador;j++){
                if (vetor[i] > vetor[j]){
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }

    public void inserir(int elemento){
        vetor[contador] = elemento;

        contador++;
    }

    //OK
    public void printar(){
        for (int i = 0; i < contador; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int getContador() {
        return contador;
    }
}
