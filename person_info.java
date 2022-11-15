package DSAPROJECT;

public class person_info {
	String username;
      String pass;
      int noofperson;//number of person 
      int budgetpp;//budget per person
      int nooftickets;
      int days;//number of days
      public person_info() {
    	  
      }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getNoofperson() {
		return noofperson;
	}
	public void setNoofperson(int noofperson) {
		this.noofperson = noofperson;
	}
	public int getBudgetpp() {
		return budgetpp;
	}
	public void setBudgetpp(int budgetpp) {
		this.budgetpp = budgetpp;
	}
	public int getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "person_info [username=" + username + ", pass=" + pass + ", noofperson=" + noofperson + ", budgetpp="
				+ budgetpp + ", nooftickets=" + nooftickets + ", days=" + days + "]";
	}
	public person_info(String username, String pass, int noofperson, int budgetpp, int nooftickets, int days) {
		super();
		this.username = username;
		this.pass = pass;
		this.noofperson = noofperson;
		this.budgetpp = budgetpp;
		this.nooftickets = nooftickets;
		this.days = days;
	}
	
}
