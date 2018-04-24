package wrongTown;

import java.util.Scanner;

public class GameMade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameMaker [] Games = new GameMaker[5];
		
		Games[0] = new GameMaker("Cotters","Tabby",5);
		Games[1] = new GameMaker("QuagWaffle","Persian",5);
		Games[2] = new GameMaker("Horus","Sphynx",5);
		Games[3] = new GameMaker("Coruh","Other",5);
		Games[4] = new GameMaker("Sanctuary","Other",5);
		
		Scanner scan = new Scanner (System.in);
		
		String userInput = scan.nextLine();
		
		int i = 0;
		
		int counter = 0;
		
		for(i=0;i < Games.length;i++){
			if(Games[i].Name.equals(userInput)){
				System.out.println(Games[i].Name + " " + Games[i].genre + " " + Games[i].rating);
				counter = (counter+1);
			}

	}if(counter!=1){
		 System.out.println("game not Found");
}
		scan.close();
}
}


