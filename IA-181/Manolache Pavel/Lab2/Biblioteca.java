public class Biblioteca {
    String numebibl;
    int nrCarti;
    public Biblioteca(){
        numebibl=null;
        nrCarti=0;
    }
    public Biblioteca(String numebibl,int nrCarti){
        this.numebibl=numebibl;
        this.nrCarti=nrCarti;
    }
    public void print(){
        System.out.println("Biblioteca: " + numebibl +", are in depozit nr de carti:" + nrCarti);
    }
}
