
public class Glavna {

	public static void main(String[] args) {
		Lista l = new Lista();
		Izvrsavanje i = new Izvrsavanje();
		
		Student s1 = new Student("Pera", "Peric", "1/14", 2014);
		Student s2 = new Student("Mira", "Miric", "2/14", 2014);
		Student s3 = new Student("Laza", "Lazic", "3/14", 2014);
		Student s4 = new Student("Dara", "Daric", "4/14", 2014);
		
		l.napraviListu(s1);
		l.napraviListu(s2);
		l.napraviListu(s3);
		l.napraviListu(s4);
		
		i.prikaziStudente(l.listaStudenata);
	}

}
