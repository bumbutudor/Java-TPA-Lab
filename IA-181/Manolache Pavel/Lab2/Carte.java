public class Carte extends  Biblioteca {
    String nume;
    String author;
    int pag;

    Carte(){
        nume=null;
        author=null;
        pag=0;
    }
    Carte(String nume,String author,int pag){
        this.nume=nume;
        this.author=author;
        this.pag=pag;
    }
    public void print(){
        System.out.println ("Denumirea cartii:"+ nume +". Autorul cartii:" + author +". Numarul de pagini:"+ pag);
    }
}