package DSAPROJECT;

import java.util.*;
class MAIN { 
  static List<person_info> a=new ArrayList<person_info>(); 
  //static Map<String,String> m= new HashMap<String,String>();
  static Scanner sc=new Scanner(System.in);
  static boolean currentstate=false;
  static person_info a1;
  static packagess a12=new packagess(); 
  public static void main(String[] args)
  {
   System.out.println("\t\t--------------TOUR MANAGEMENT--------------");
   System.out.println();
   while(true){
	   if(currentstate==false){
	   System.out.println("\t\t\tAdd User - 1\n\t\t\tLogin User - 2\n\t\t\tBrochure - 3\n\t\t\tExit - 4\n\n\t\t\tEnter:");
       int ch=sc.nextInt();
       switch(ch) {
          case 1:
        	  System.out.println("Ener username");
        	  String username=sc.next();
        	  System.out.println("Eneter password");
        	  String pass=sc.next();
        	  add_user(username,pass);
        	 break; 
          case 2:
        	  System.out.println("Ener username");
         	  String username1=sc.next();
         	  System.out.println("Eneter password");
         	  String pass1=sc.next();
         	  login_user(username1,pass1);
         	 break; 
         case 3:
        	 break;
          case 4:
        	  //exit ();
        	  break;
       }
       }
	   else if(currentstate==true) {
		   System.out.println("\t\t\tBook package - 1\n\t\t\tCheck Ticket- 2\n\t\t\tBrochure - 3\n\t\t\tLogout- 4\n\n\t\t\tEnter Your choice:");
	       int ch=sc.nextInt();
	   switch(ch) {
	   case 1:
           bookpakage(a1);
           break;
       case 2:
    	    checkticket(a1);
           break;
       case 3:
    	    cancelticket(a1);
               break;
       case 4:
           logout();
           break;
       case 5:
        
           break;
       case 6:

           break;
       case 7:
           
           break;
       case 8:
          
           break;
       default:
          System.out.println("Not a valid input at this stage");
	   }
	   }
   }
  }
  public static void add_user(String username,String pass) { 
      int flag=0;  
	  person_info s=new person_info();
        for(person_info info:a)  
  	    {  
  		 if(info.getUsername().equals(username)){  
  		    	flag=1;
  		 }
        }
        if(flag==1) {
        	System.out.println("User name already exists......");
            return;
        }
        s.setUsername(username);
        s.setPass(pass);
        a.add(s); 
        
  }
  public static void login_user(String username,String pass) {
	  for(person_info info:a)  
	  {  
		if(info.getUsername().equals(username)){ 
		  if(info.getPass().equals(pass)) {
			  currentstate=true;
			  System.out.println("Enter noofpersons");
			  info.noofperson=sc.nextInt();
			  a1=info;
			  break;
		  }
		}
   	  }
	  if(currentstate==false) {
		  a1=null;
		  System.out.println("User Doesn't Exist......");
	  }
  }
  public static void logout() {
	  currentstate=false;
  }
  public static void bookpakage(person_info a) {
	  System.out.println("Select places\n1)kerala\n2)Bangalore\n3)Tamilnadu");
	  int c=sc.nextInt();
	  switch(c) {
	  case 1:
		  a12.kerala(a);
	      break;
	  case 2:
		  a12.bangalore(a);
		  break;
	  case 3:
		  a12.tamilnadu(a);
	  }
	  
  }
  public static void checkticket(person_info a) {
	  System.out.println("No of Tickects "+a.nooftickets+"\nBudget per person"+a.budgetpp+"\nTotal backeges "+a.budgetpp*a.noofperson+"\nNo of days"+a.days);
  }
  public static void cancelticket(person_info a) {
	 a.budgetpp=0;
	 a.days=0;
	 a.nooftickets=0;
	 System.out.println("Ticket canceled successfully...");
  }
}
