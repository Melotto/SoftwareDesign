package SoftDesign;
import java.util.*;

public class Week02 {

	Random rand = new Random();
	
	public int roll () {
		int randValue = rand.nextInt(16) +1 ;
		return randValue;
	}
	//Teste number 3
	public static void main(String[] args) {
		Week02 self = new Week02();
		int randNo = 0;
		double sum = 0.0;
		
		for(int i=0; i<20; i++){
			randNo = self.roll();
			sum += randNo;
			System.out.println(randNo);
		}
		System.out.println("Average rolls is: " + sum/20);
		
	}


}
