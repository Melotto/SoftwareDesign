

/**
 *
 * @author melotto
 * This line was edited on 21/05, classroom exercise
 */
import java.util.*;
public class Week02 {
    
    
//COMMENT TO TEST CHANGE ON GIT
	Random rand = new Random();
	
	public int roll () {
		int randValue = rand.nextInt(16) +1 ;
		return randValue;
	}
	
	public static void main(String[] args) {
		week2_01 self = new week2_01();
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

}
