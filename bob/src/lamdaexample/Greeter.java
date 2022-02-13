package lamdaexample;

public class Greeter {

	
	
	  public void show(Greeting greet) 
	  { 
		  greet.perfornm();
	  }
	  public void show(Second show2) 
	  { 
		  show2.show2();
		  }
	 
	 
	public static void main(String[] args) {
		System.out.println("Hello noto lodi");
		  Greeter obj=new Greeter(); 
		  Greeting myLambda =() ->System.out.println("Hello lodu "); 
		  obj.show(myLambda); 
		  Second myLambda2 =()->System.out.println("Hello notes ");
		  obj.show(myLambda2);
		 
	}

}

  interface Second { 
	  void show2();
  
  }
 