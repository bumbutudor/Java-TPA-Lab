package sarcinacurs;

import static java.lang.System.out;

class Dreptunghi
{
    double lungime;
    double latime;

    public Dreptunghi(double x){
        this.lungime = x;

        this.latime = x;
    }

    public Dreptunghi(double lung, double lat) {
        this.lungime = lung;

        this.latime = lat;

        out.println ("A fost creat un sarcinacurs.Dreptunghi cu lungimea " + lung +
                " si latimea " + lat);
    }
}

class Paralalepipid extends Dreptunghi
{
    double inaltimea;
    public Paralalepipid(double lat, double lung, double inal) {
        super(lung, lat);
        inaltimea=inal;
        out.println ("A fost creat un sarcinacurs.Paralalepipid cu inaltimea " + inaltimea +
                " si latimea "+latime+" si lungime "+lungime+" de la sarcinacurs.Dreptunghi");

    }
    public Paralalepipid (double x){
        super(x);
        inaltimea=x;
    }
    public double Volum () {
        return lungime * latime * inaltimea;
    }
}