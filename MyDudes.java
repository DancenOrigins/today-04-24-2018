package wrongTown;

import java.util.Scanner;

public class MyDudes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wensday [] cats = new Wensday[3];
		Scanner scan = new Scanner (System.in);
		
		System.out.println("3 cats and breed");
		
		for(int i =0;i<3;i++){
			Wensday ct1 =new Wensday (scan.nextLine(),scan.nextLine());
			cats[i] = ct1;
		}
		System.out.println(cats[1].name + " " + cats[1].breed);
		scan.close();
		
		

	}

}


