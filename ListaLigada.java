public class ListaLigada{
    private No start;

    public void insertStart(int value){
        if (start == null){
            start = new No(value);
            return;
        }
        No n = new No9(value);
        n.setNext(start);
        start = n;
    }

    public void insetEnd(int value){
        if (start == null){
            start = new No(value);
            return;
        }
        insert(start, value);
    }

    public void insert (No n, int value){
        if (n.getNext() == null){
            No nw = new No(value);
            n.setNext(nw);
        }
        else {
            insert(n.getNext(), value);
        }
    }

    public void removeStart(){
        if (start != null)
            start = start.getNext();
    }

    public void removeEnd(No n){
        No next = n.getNext();
        if (next.getNext == null){
            n.setNext(null);
            return;
        }
        else{
            removeEnd(next);
        }
    }
    public void removeEnd(){
        if (start == null){
            return;
        }
        if (start.getNext() == null){
            start = null;
        }
        removeEnd(start);
    }
    public boolean search(int value){
        if (start == null){
            return false;
        } else {
            return search(start, value);
        }
    }

    public boolean search(No n, int value){
        if (n.getNext() == value){
            return true;
        }else if (n.getNext() == null){
            return false;
        }else {
            return search(n.getNext(), value);
        }
    }
    public void remove(No n, int value){
        No next = n.getNext();
        if (next == null){
            return;
        }
        if (next.getValue() == value){
            n.setNext(next.setNext());
        }else{
            remove(next, value);
        }
    }

    public void remove(int value){
        if (star == null){
            return;
        }
        if (inicio.getValue == value){
            start = start.getNext();
            return;
        }
        remove(start, value);
    }
}

