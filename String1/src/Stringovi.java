
public class Stringovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ulazni parametri	
	//	niz stringova: //razdvaja se ,,, 
		String [] tekstualnaPor = {
				"Once Upon a Time in Hollywood is an upcoming mystery crime film centered on the Manson Family murders. ",
				
				"Written and directed by Quentin Tarantino, the film stars Leonardo DiCaprio, Brad Pitt and Margot Robbie. The film is a British-American venture produced by Columbia Pictures and Heyday Films, and is scheduled for release on July 26, 2019.",
				
				"Leonardo DiCaprio as Rick Dalton: An actor who starred in the Western television series Bounty Law from 1958 to 1963. His attempt to transition to movies did not work out and in 1969, he is struggling, guesting on other people's shows while contemplating going to Italy, which had become a hotbed for low-budget Westerns. He is neighbors with Sharon Tate. "
		};
		
		
//resenje
		for (int i = 0; i < tekstualnaPor.length; i++) {
			if(tekstualnaPor[i].length() > 25) { //ne moze bez [i] zato sto smo na pocetku def niz String
			

				String nesto1 = tekstualnaPor[i].substring(0, 22); // 22 + 3 tacke = 25 ne polazeci od 0
			  //nesto1 = nesto1.concat("..."); // ne mora, ali nekad je potrebno odvojeno 
				System.out.println(nesto1 + "...");
				
				
			} //nije potrebas else za to sto ne moze da bude false, mi unosimo sve 
		}
		
				
	}

}
