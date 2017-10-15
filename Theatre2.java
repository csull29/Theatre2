/*
 *Theatre2.java
 *@author C Sullivan
 */

 public class Theatre2{
	 //declare data members
	 private String day;
	 private int age;
	 private int price;

	 //constructor
	 public Theatre2(){
		 day = new String();
		 price = 0;
		 age = 0;
	 }

	 //set method
	 public void setDay(String day){
		 this.day = day;
	 }

	 public void setAge(int age){
		 this.age = age;
	 }

	 //compute
	 public void compute(){
		 if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){
			 if(age < 5 || age > 65){
				 price = 0;
			 }
			 else if(age >= 5 && age <=15){
				 price = 15;
			 }
			 else{
				 price = 20;
			 }
		 }
		 else if(day.equalsIgnoreCase("Friday")||day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
			 if(age < 5 || age > 65){
			 	price = 5;
			 }
			 else if(age >= 5 && age <=15){
			 	price = 20;
			 }
			 else{
			 	price = 30;
			 }
		 }
		 else{
			 price = -1; //set price to -1 so we know there was an error in the input
		 }
	 }


	 //get method
	 public int getCost(){
		 return price;
	 }
 }
