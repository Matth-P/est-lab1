public class ListaLigada implements EstruturaDeDados{
    private No inicio;

    public void removeInicio (){
        if (inicio != null)
            inicio = inicio.getProximo();
    }

    public void removeFim (){
        if (inicio == null){
            return;
        }
        if (inicio.getProximo() == null){
            inicio = null;
        }
        removeFim(inicio);
    }

    public void removeFim (No n){
        No proximo = n.getProximo();
        if (proximo.getProximo() == null){
            n.setProximo(null);
            return;
        } else{
            removeFim(proximo);
        }
    }

    public void insereInicio (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        No n = new No(valor);
        n.setProximo(inicio);
        inicio = n;

    }

    public void insereFim (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        insere(inicio, valor);
    }

    public boolean procura (int valor){
        if (inicio == null){
            return false;
        } else {
            return procura(inicio, valor);
        }
    }

    public boolean procura (No n, int valor){
        if (n.getValor() == valor){
            return true;
        } else if (n.getProximo() == null){
            return false;
        } else {
            return procura(n.getProximo(), valor);
        }
    }
    public void insere (No n, int valor){
        if (n.getProximo() == null){
            No novo = new No(valor);
            n.setProximo(novo);
        } else {
            insere(n.getProximo(), valor);
        }
    }

    public void remover(int valor){
        if (inicio == null){
            return;
        }
        if (inicio.getValor() == valor){
            inicio = inicio.getProximo();
            return;
        }
        remover(inicio, valor);
    }

    public void remover(No n, int valor){
        No proximo = n.getProximo();
        if (proximo == null){
            return;
        }
        if (proximo.getValor() == valor){
            n.setProximo(proximo.getProximo());
        } else{
            remover(proximo, valor);
        }
    }


    public int suc(No n, int valor){
        int suc = valor;
        if (n.getProximo() == null){
            suc = valor;
            return suc;
        } else if (n.getValor() == valor) {
            suc = n.getProximo().getValor();
            return suc;
        } else {
            return suc(n.getProximo(), valor);
        }
    }

    public int ant(No n, int valor){
        int ant = valor;
        if (n.getValor() == valor) {
            ant = 0;
            return ant;
        } else if(n.getProximo().getValor() == valor){
            ant = n.getValor();
            return ant;
        } else {
           return ant(n.getProximo(), valor);
        }
    }

    public int min(No n){
        int min = n.getValor();
        if (n.getProximo() == null){
            min = n.getValor();
            return min;
        }
        else if (n.getProximo().getValor() >= n.getValor()){
            min = n.getValor();
            return min;
        }
        else {
           return min(n.getProximo());
        }
    }

    public int max(No n){
        int max = n.getValor();
        if (n.getProximo() == null){
            max = n.getValor();
            return max;
        }
        else if (n.getProximo().getValor() <= n.getValor()){
            max = n.getValor();
            return max;
        }
        else {
            return max(n.getProximo());
        }
        
    }






    public static void main(String[] args) {
        ListaLigada r = new ListaLigada();
        r.insert(10);
        r.insert(20);
        r.insert(30);
        r.delete(40);
        r.insert(50);
        r.insert(60);
        System.out.println(r.search(40));
        System.out.println(r.minimum());
        System.out.println(r.maximum());
        System.out.println(r.sucessor(30));
        System.out.println(r.prodessor(60));
        
    }

    @Override
    public boolean insert(int chave) {
        if (inicio == null){
            inicio = new No(chave);
        }
        else{
            insere(inicio, chave);
        }
        return true;
    }

    @Override
    public boolean delete(int chave) {
        if (inicio == null){
            return false;
        }
        remover(chave);
        return true;
    }

    @Override
    public boolean search(int chave) {
        if (procura(chave) == true){
            return true;
        }    
        else {
            return false;   
        }
    }

    @Override
    public int minimum() {
        if (inicio == null){
            return 0;
        }
        else{
            return min(inicio);
        }
 
    }

    @Override
    public int maximum() {
        if (inicio == null){
            return 0;
        }
        else{
            return max(inicio);
        }
 
    }

    @Override
    public int sucessor(int chave) {
        int suc = 0;
        if (inicio == null){
            return suc;
        }
        else {
           return suc(inicio, chave);
        }
    }

    @Override
    public int prodessor(int chave) {
        int ant = 0;
        if (inicio == null){
            return ant;
        }
        else {
           return ant(inicio, chave);
        }
    }
}