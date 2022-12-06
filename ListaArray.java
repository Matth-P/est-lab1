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
        if (contador > 100){
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
    }

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < 100; i++){
            if (elementos[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        return 0;
    }

    @Override
    public int maximum() {
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        System.out.println(r.getElementos(0));
        r.search(1);
    }
}
