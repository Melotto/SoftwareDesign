/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melotto
 */
import java.util.*;
public class Week02 {
    
    

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
