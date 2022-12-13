public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int contador;

    public ListaArray(){
        elementos = new int[100];
        contador = 0;
    }

    public int getElementos (int chave){
        return elementos[chave];
    }


    @Override
    public boolean insert(int chave) {
        if (contador > elementos.length){
            return false;
        }
        else{
            elementos[contador] = chave;
            contador = contador + 1;
            return true;
        }
    }

    @Override
    public boolean delete(int chave) {
        if (elementos == null || chave < 0){
            return false;
        }
        ListaArray r2 = new ListaArray();
        for (int i = 0, k =0; i < elementos.length; i++){
            if (i == chave){
                continue;
            }
            r2.elementos[k++] = elementos[i];
        }
        return true;
  
    }    
    
    @Override
    public boolean search(int chave) {
        int index = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                index = this.search(chave)
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int valMin = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] < elementos[0]){
                valMin = elementos[i];
            }    
        }
        return valMin;
    }

    @Override
    public int maximum() {
        int valMax = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] > elementos[0]){
                valMax = elementos[i];
            }
        }
        return valMax;
    }

    @Override
    public int sucessor(int chave) {
        if (search(chave) == true){
            for (i = 0; i < elementos.length; i++){

            }
            return elementos[i+1];
        }
    }

    @Override
    public int prodessor(int chave) {
        chave = elementos[i];
        if (search(chave) == true){
            return elementos[i-1];
        }
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(80);
        r.insert(90);
        r.insert(10);
        r.insert(20);
        r.insert(30);
        System.out.println(r.search(20));
        System.out.println(r.search(0));
        System.out.println(r.minimum());
        System.out.println(r.maximum());
        System.out.println(r.delete(20));
        System.out.println(r.sucessor(90));
        System.out.println(r.prodessor(20));

    }
}