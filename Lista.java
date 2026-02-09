public class Nodo <T>{
    T dato;
    Nodo<T>  next;
    public Nodo<T>(int dato){
        this.dato=dato;
        this.next=null;
    }
    public class Lista<T>{
    Lista<T> head;
    }
    public Lista<T>(){
        this.head=null;
    }
   public  boolean isEmpty(){

     return head==null;
   }
   
public void aggiungiInTest(T dato){
    Nodo<T> n= new Nodo<>(dato);
    n.next=head;
    head=n;

}
public void aggiungiinCod(T dato){
    Nodo<T> no = new Nodo<> (dato);
    if ( head == null){
        
        head=no;
        return ;
    }
     Nodo<T> corrente = head;
    while (corrente.next != null) {
        corrente = corrente.next;
    }
    corrente.next = no;

}
public void aggiungiiPosiz(T dato,int posizione){
    if (posizione<0){
        throw new IndexOutOfBoundsException("Posizione negativa");
    }
    if (posizione==0){
        aggiungiInTest(dato);
        return ;
        Nodo<T>  nod = new Nodo<> ( dato, posizione)
    }

}
   

}
