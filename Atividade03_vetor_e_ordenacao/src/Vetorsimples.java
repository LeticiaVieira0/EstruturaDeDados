public class Vetorsimples {
    int[] vetor;
    int contador;

    public Vetorsimples(int capacidade) {
        vetor = new int[capacidade];
        this.contador = 0;
    }

    public static Boolean checkarDuplicata(int[] lista, int elemento) {
        Boolean duplicata = false;
        int low = 0;
        int high = lista.length;

        while (low <= high){
            int mid = low + ((high - low) / 2);

            if(lista[mid] < elemento){
                low = mid + 1;
            } else if (lista[mid] > elemento){
                high = mid -1;
            } else if (lista[mid] == elemento){
                duplicata = true;
            }
        }

        return duplicata;
    }

    public int[] getVetor() {
        return vetor;
    }

    public static int[] ordenar(int[] lista){
        int temp = 0;
        for(int i =0; i<lista.length;i++){
            for(int j = i+1; j<lista.length;j++){
                if (lista[i] > lista[j]){
                    temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }




}
