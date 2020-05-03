package lab2;

public class Cuvint {
    private String cuv;

    //Costructurii clasei Cuvint
    public  Cuvint() {
        cuv = null;
    }
    public  Cuvint(String cuv) {
        this.cuv =  cuv;
    }
    public  Cuvint(String cuv, int n) {
        this.cuv=  cuv.substring(0,n);
    }

    //Metodele set pentru modificarea atributului clasei Cuvint
    public void setCuvint() {
        cuv = null;
    }
    public void setCuvint(String cuv) {
        this.cuv=  cuv;
    }
    public void setCuvint(String cuv, int n) {
        this.cuv =  cuv.substring(0,n);
    }

    //Metoda get
    public String getCuvint() {
        return cuv;
    }

    //Metoda de afisare a atributului cuv
    public String toString() {
        String output = super.toString();
        output += "(cuv=\""+cuv+"\")";
        return output;
    }
}

