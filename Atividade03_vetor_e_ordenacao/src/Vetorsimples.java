public class Vetorsimples {
    int[] vetor;
    int contador;

    public Vetorsimples(int capacidade) {
        vetor = new int[capacidade];
        this.contador = 0;
    }

    public Boolean checkarDuplicata(int elemento) {
        int low = 0;
        int high = vetor.length -1;

        while (low <= high){
            int mid = low + ((high - low) / 2);
            if(vetor[mid] < elemento){
                low = mid + 1;
            } else if (vetor[mid] > elemento){
                high = mid -1;
            } else {
                return true;
            }
        }

        return false;
    }

    public int[] getVetor() {
        return vetor;
    }

    //OK
    public void ordenar(){
        int temp = 0;
        for(int i =0; i<vetor.length;i++){
            for(int j = i+1; j<vetor.length;j++){
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
        for (int num : vetor){
            System.out.println(""+num);
        }
    }


}
