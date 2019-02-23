import java.util.ArrayList;

public class Jeu {

	
	private ArrayList<Carte> paquet;
	
	
	

	public Jeu() {

		paquet = new ArrayList<Carte>();
		for (Couleur c:Couleur.values()) {
			
			for(int i =2;i<=10;i++)
			{
				paquet.add(new Carte(Integer.toString(i),c));
				
			}
			
			paquet.add(new Carte("Valet",c));
			paquet.add(new Carte("Dame",c));
			paquet.add(new Carte("Roi",c));
			paquet.add(new Carte("As",c));
			
		}
		
		
	}
	
	public void afficher() {
		
		for (Carte c: paquet) { 
			System.out.println( c.getValeur()+" de "+c.getCouleur().toString() );
					
			
		}
		
	}

	public ArrayList<Carte> getPaquet() {
		return paquet;
	}

	public void setPaquet(ArrayList<Carte> paquet) {
		this.paquet = paquet;
	} 
	
	
	
	public static void main(String[] args)
	{
		Jeu jeu = new Jeu();
		
	    jeu.afficher();
		
		
		
	}
	
}
