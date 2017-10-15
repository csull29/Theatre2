/*
 *@author C Sullivan
 *Theatre2App.java
 */
import javax.swing.JOptionPane;
 public class Theatre2App{
	 public static void main(String args[]){
		 //declare variables
		 int age;
		 String day;
		 double cost;

		 //declare & Create objects
		 Theatre2 myTheatre2 = new Theatre2();

		 //input
		 day = JOptionPane.showInputDialog(null,"Please enter a day of the week");
		 myTheatre2.setDay(day);
		 age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the age"));
		 myTheatre2.setAge(age);

		 //process
		 myTheatre2.compute();

		 //output
		 cost = myTheatre2.getCost();
		 if(cost==-1){
			 JOptionPane.showMessageDialog(null,"Sorry, you have entered an invalid day, please try again");
		 }
		 else{
			 JOptionPane.showMessageDialog(null,"The cost of the ticket is "+cost);
		 }
	 }
 }



