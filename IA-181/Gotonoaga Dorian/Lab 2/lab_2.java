import java.util.Arrays;

class Litera {
	public
		char l;
	public Litera() {this.l = '\u0000'; }
	
	public Litera(char l) {
		this.l = l;
	}
	
	public void setLitera(char l) {
		this.l = l;
	}
	
	public char getLitera() {
		return this.l;
	}
}

class Cuvant extends Litera {
	public
		Litera[] litere;
	
	public Cuvant() {
		System.out.println("Cuvant()");
	}
	
	public Cuvant(char...cuv) {
		litere = new Litera[cuv.length];
		int i=0;
		for (char c : cuv) {
			litere[i++] = new Litera(c);
		}
	}
	
	public void setLitera(int i, char l) {
		litere[i].setLitera(l);
	}
	
	public char getLitera(int i) {
		return litere[i].getLitera();
	}
	
	public void addLitera(char c) {
		Litera[] newArray = Arrays.copyOf(litere, litere.length+1);
	    newArray[litere.length] = new Litera(c);
	    litere = newArray;
	}
	
	public void setCuvant(char c) {
		litere[0].setLitera(c);
	}
	
	public void setCuvant(char...cuv) {
		int i=0;
		for (char c : cuv) {
			litere[i++].setLitera(c);
		}
	}
	
	public void showCuvant() {
		System.out.println("\nAfisarea cuvantului: ");
		for (int i=0; i<litere.length; i++) {
			System.out.print(litere[i].getLitera());
		}
	}
	
}

public class lab_2 {
	public static void main(String[] args) {
		Cuvant cuv = new Cuvant('w', 'o', 'r', 'd');
//		cuv.setCuvant('w', 'o');
		cuv.showCuvant();
		cuv.setLitera(3, 'l');
		cuv.addLitera('d');
		cuv.showCuvant();
	}
}

/*
 * Concluzii: 
 * 
 * Efectuând lucrarea de laborator nr. 2 m-am familiarizat cu noțiunile 
 * de supraîncărcare și suprascriere a metodelor în limbajul Java.
 * 
 * Am creat clasa Litera si clasa Cuvant ce implementeaza clasa Litera 
 * in care au fost supradefinite metodele setLitera si getLitera,
 * metode ce sunt definite si in clasa Litera.
 * 
 */
