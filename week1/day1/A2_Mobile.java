package week1.day1;

public class A2_Mobile {

	/*
	 * Assignment 2:
	 * 
	 * - Create package name as week1.day1 under src/main/java - Create a new class
	 * as "Mobile" under week1.day1 - Create 2 methods (makeCall() , sendMsg()) with
	 * simple print statement - In first method create variable mobileModel(String),mobileWeight (float) - In second method create variable
	 * isFullCharged (boolean),mobileCost (int) - Create main method Create object
	 * for class and call from main method and print them - print a
	 * statement---->"This is my mobile"; -run and confirm the output printed in
	 * console
	 */
	  	String mobileModel;
	    float mobileWeight;

	    boolean isFullCharged;
	    int mobileCost;

	    public void makeCall() {
	        mobileModel = "Some Model";
	        mobileWeight = 150.5f;

	        System.out.println("Making a call...");
	    }
	    
	    public void sendMsg() {
	        isFullCharged = true;
	        mobileCost = 500;

	        System.out.println("Sending a message...");
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2_Mobile myMobile = new A2_Mobile();

        myMobile.makeCall();
        myMobile.sendMsg();

        System.out.println("This is my mobile");
	}

}
