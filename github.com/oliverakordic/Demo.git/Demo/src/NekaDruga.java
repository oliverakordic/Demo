import java.util.LinkedList;

public class NekaDruga {
	
	public void prikaziPrvog(LinkedList lista){
		if(lista==null){
			System.out.println("Greska!");
		}
		System.out.println(lista.get(0));
	}
}
