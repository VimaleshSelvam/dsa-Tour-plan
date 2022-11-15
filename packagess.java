package DSAPROJECT;

import java.util.Scanner;

public class packagess {
	 static Scanner sc=new Scanner(System.in);
	   public static void kerala(person_info a) {
	          Kerala();
	          System.out.println("Select packages");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				a.budgetpp=5000;
				a.days=3;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
			case 2:
	            a.days=4;
				a.budgetpp=10000;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
			case 3:
				a.days=5;
				a.budgetpp=12000;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
    	 case 4:
				return;
			default:	
				System.out.println("Enter correct choice");
			}
	   }
	   public static void bangalore(person_info a) {
	          Bangalore();
	          System.out.println("Select packages");
				int c=sc.nextInt();
				switch(c) {
		         case 1:
		        	a.days=3;
					a.budgetpp=5000;
					a.nooftickets=a.noofperson;
					System.out.println("Ticket booked successfully...");
					break;
				case 2:
					a.days=4;
					a.budgetpp=10000;
					a.nooftickets=a.noofperson;
					System.out.println("Ticket booked successfully...");
					break;
				case 3:
					a.days=5;
					a.budgetpp=12000;
					a.nooftickets=a.noofperson;
					System.out.println("Ticket booked successfully...");
					break;
			case 4:
					return;
				default:	
					System.out.println("Enter correct choice");
				}
	   }
	   public static void tamilnadu(person_info a) {
	          Tamilnadu();
	          System.out.println("Select packages");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				a.budgetpp=5000;
				a.days=3;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
			case 2:
	            a.days=4;
				a.budgetpp=10000;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
			case 3:
				a.days=5;
				a.budgetpp=12000;
				a.nooftickets=a.noofperson;
				System.out.println("Ticket booked successfully...");
				break;
 	 case 4:
				return;
			default:	
				System.out.println("Enter correct choice");
			}
	   }
       public static void Kerala() {     
    	   System.out.println("----------KERALA PACKAGES-----------");
     	   System.out.println("1)3 days plan");
     	   System.out.println("Package price person per person 5000");
     	   System.out.println("Day1\n\tVisiting places are\n\t\ttekkady(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tperiyar national park(13.30pm-15.00pm)\n\t\tfort kochi(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tWayanadu wild life sanctuary(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tEdakkal Caves(13.30pm-15.00pm)\n\t\tDevikkulam(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tWonderla(9.00am-4.00pm)");
    	   System.out.println("2)4 days plan");
    	   System.out.println("Package price person:10000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\ttekkady(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tperiyar national park(13.30pm-15.00pm)\n\t\tfort kochi(15.00pm-17.00pm)"); 
    	   System.out.println("Day2\n\tVisiting places are\n\t\tWayanadu wild life sanctuary(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tEdakkal Caves(13.30pm-15.00pm)\n\t\tDevikkulam(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\\n\\t\\tVagamon jeep ride(9.00Am-4.00pm)");
    	   System.out.println("Day4\n\tVisiting places are\n\t\tWonderla(9.00am-4.00pm)");
    	   System.out.println("2)5 days plan");
    	   System.out.println("Package price person:12000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\ttekkady(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tperiyar national park(13.30pm-15.00pm)\n\t\tfort kochi(15.00pm-17.00pm)"); 
    	   System.out.println("Day2\n\tVisiting places are\n\t\tWayanadu wild life sanctuary(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tEdakkal Caves(13.30pm-15.00pm)\n\t\tDevikkulam(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tAlappuzha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tCochin(13.30pm-15.00pm)\n\t\tBekal(15.00pm-17.00pm)");
     	  System.out.println("Day4\n\tVagamon jeep ride(9.00Am-4.00pm)");
    	   System.out.println("Day5\n\tVisiting places are\n\t\tWonderla(9.00am-4.00pm)");
    	   System.out.println("4)exit");
       }
       public static void Bangalore() {
    	   System.out.println("----------BANGALORE PACKAGES-----------");
     	   System.out.println("1)3 days plan");
     	   System.out.println("Package price person per person 5000");
     	   System.out.println("Day1\n\tVisiting places are\n\t\tBangalore Palace(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tNandi Hills(13.30pm-15.00pm)\n\t\tDevanahalli Fort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tVidhana Soudha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tShiva Temple(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tWonder La Water Park(9.00am-4.00pm)");
    	   System.out.println("2)4 days plan");
    	   System.out.println("Package price person:10000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\tBangalore Palace(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tNandi Hills(13.30pm-15.00pm)\n\t\tDevanahalli Fort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tVidhana Soudha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tShiva Temple(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\\n\\t\\tNandi Hills jeep ride(9.00Am-4.00pm)");
    	   System.out.println("Day4\n\tVisiting places are\n\t\tWonder La Water Park(9.00am-4.00pm)");
    	   System.out.println("2)5 days plan");
    	   System.out.println("Package price person:12000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\tBangalore Palace(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tNandi Hills(13.30pm-15.00pm)\n\t\tDevanahalli Fort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tVidhana Soudha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tShiva Temple(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tUB City Mall(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tLumbini Gardens(13.30pm-15.00pm)\n\t\tBekal(15.00pm-17.00pm)");
     	  System.out.println("Day4\n\tNandi Hills ride(9.00Am-4.00pm)");
    	   System.out.println("Day5\n\tVisiting places are\n\t\tWonder La Water Park(9.00am-4.00pm)");
    	   System.out.println("4)exit");
       }
       public static void Tamilnadu() {
    	   System.out.println("----------TAMILNADU PACKAGES-----------");
     	   System.out.println("1)3 days plan");
     	   System.out.println("Package price person per person 5000");
     	   System.out.println("Day1\n\tVisiting places are\n\t\tOoty(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tflower show garden(13.30pm-15.00pm)\n\t\tFort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tkadaikanal(9.00am-12.00 pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\t(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tBlackthunder(9.00am-4.00pm)");
    	   System.out.println("2)4 days plan");
    	   System.out.println("Package price person:10000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\tIsha temple(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tVelliangiri Hills(13.30pm-15.00pm)\n\t\tBlackthunder Fort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tVidhana Soudha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tShiva Temple(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\\n\\t\\tNandi Hills jeep ride(9.00Am-4.00pm)");
    	   System.out.println("Day4\n\tVisiting places are\n\t\tBlackthunder(9.00am-4.00pm)");
    	   System.out.println("2)5 days plan");
    	   System.out.println("Package price person:12000");
    	   System.out.println("Day1\n\tVisiting places are\n\t\tBangalore Palace(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
     	   System.out.println("\t\tNandi Hills(13.30pm-15.00pm)\n\t\tDevanahalli Fort(15.00pm-17.00pm)"); 
     	  System.out.println("Day2\n\tVisiting places are\n\t\tVidhana Soudha(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tShiva Temple(13.30pm-15.00pm)\n\t\t HAL Aerospace Museum(15.00pm-17.00pm)");
    	   System.out.println("Day3\n\tVisiting places are\n\t\tUB City Mall(9.00am-12.00pm)\n\t\tlunch(12.00pm-13.00pm)");
    	   System.out.println("\t\tLumbini Gardens(13.30pm-15.00pm)\n\t\tBekal(15.00pm-17.00pm)");
     	  System.out.println("Day4\n\tNandi Hills ride(9.00Am-4.00pm)");
    	   System.out.println("Day5\n\tVisiting places are\n\t\tBlackthunder(9.00am-4.00pm)");
    	   System.out.println("4)exit");
       }
       
}
