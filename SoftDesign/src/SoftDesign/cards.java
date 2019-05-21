package SoftDesign;
import java.util.Scanner;
public class cards {
	//Code by Rodrigo Melotto de Lima
	//Student ID 991547491
	public static void main(String[] args) {
		System.out.println("Choose a card: ");
		Scanner input = new Scanner(System.in);
		int card = input.nextInt();
		int rank, suit;
		String rankValue, suitValue;
		int luckyCard;
		 
		 rank = (int)(Math.random() * 13) + 1;
		 suit = (int)(Math.random() * 4) + 1;
		luckyCard = (int)(Math.random() * 13) + 1;
		  
		 rankValue = "";
		 suitValue = "";
		  
		 switch(rank) {
		  case 1:
		   rankValue = "Ace";
		   break;
		  case 2:
		   rankValue = "2";
		   break;
		  case 3:
		   rankValue = "3";
		   break;
		  case 4:
		   rankValue = "4";
		   break;
		  case 5:
		   rankValue = "5";
		   break;
		  case 6:
		   rankValue = "6";
		   break;
		  case 7:
		   rankValue = "7";
		   break;
		  case 8:
		   rankValue = "8";
		   break;
		  case 9:
		   rankValue = "9";
		   break;
		  case 10:
		   rankValue = "10";
		   break;
		  case 11:
		   rankValue = "Jack";
		   break;
		  case 12:
		   rankValue = "Queen";
		   break;
		  case 13:
		   rankValue = "King";
		    break;
		 }
		  
		 switch(suit) {
		  case 1:
		   suitValue = "Clubs";
		   break;
		  case 2:
		   suitValue = "Diamonds";
		   break;
		  case 3:
		   suitValue = "Hearts";
		   break;
		  case 4:
		   suitValue = "Spades";
		   break;
		 }
		 if(card != rank) {
			 
			 System.out.print("You picked: " + card + "\n And the magic card is: " + rankValue + " of " + suitValue + ".");
		 	System.out.print("\n The lucky card is: " + luckyCard);
		 }
		 else {
			 System.out.println("Congrats! The magic card is: " + rankValue + " of " + suitValue + ".");
		 	System.out.print("\n The lucky card is: " + luckyCard);
		 }
		 }
		} 
