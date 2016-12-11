import java.util.LinkedList;

public class Izvrsavanje {
	
	public void prikaziStudente(LinkedList lista){
		if(lista==null){
			System.out.println("Ne postoji lista studenata.");
			return;
		}
		int i=0;
		while(i<lista.size()){
			System.out.println(lista.get(i).toString());
			i++;
		}
	}
}
