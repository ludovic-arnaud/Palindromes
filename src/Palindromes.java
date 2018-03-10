import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {

		//Déclaration des variables
		String chaine; //Chaine initiale
		char choix = ' ';
		String chaine2; //Chaine sans ponctuation ni espace
		
		//Initialisation de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Démarrage du programme
		System.out.println("DETECTEUR DE PALINDROMES");
		System.out.println("------------------------");
		
		do {//Boucle principale tant que le choix est O
			System.out.println("Entrez un mot ou une phrase :");
			String str = sc.nextLine();
			//Met tous les caractères en minuscule
			chaine = str.toLowerCase();
			//Supprime espaces et ponctuation
			chaine2 = chaine.replaceAll("\\W","");
			//Inverse la chaine2 en inverse
			String inverse = new StringBuffer(chaine2).reverse().toString();	
			
			//On compare les 2 chaines avec equals()
			if (chaine2.equals(inverse)) {
				System.out.println("Ceci est un palindrome");
			}
			else {
				System.out.println("Ceci n'est pas un palindrome");
			}
	
		      do{//On repose la question si choix différent de O et N       
		          System.out.println("Souhaitez-vous essayrer une autre mot ?(O/N)");
		          choix = sc.nextLine().charAt(0);
		         
		        }while(choix != 'O' && choix != 'N');
		      
		}while (choix == 'O');
		
		//On quitte le programme si choix est N
		System.out.println("Au revoir !");
	}

}
