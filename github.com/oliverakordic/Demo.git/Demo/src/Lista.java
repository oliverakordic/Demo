import java.util.LinkedList;
public class Lista {
	LinkedList <Student>listaStudenata = new LinkedList<Student>(); 
	public void napraviListu(Student s){
		if(s==null){
			System.out.println("Greska!");
			return;
		}
		listaStudenata.add(s);
	}
}
