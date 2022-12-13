public class No {
    private int value;
    private No next;

    public No(int valor){
        this.valor = valor;
        next = null;
    }

    public No getNext(){
        return next;
    }

    public int getValue(){
        return value;
    }
}

