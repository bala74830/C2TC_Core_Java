package bob;


	class animal
	{
		int legs;
		String name;
		String color;
		public animal()
		{
			System.out.println("this is defaulr constructor");
		}
		public animal(int legs) {
	
			this.legs = legs;
		}
		public animal(int legs, String name) {
			
			this(legs);
			this.name = name;
		}
		public animal(int legs, String name, String color) {
		
			this(legs,name);
			this.color = color;
		}
		
		public animal(String name, String color) {
		
			this.name = name;
			this.color = color;
		}
		void display()
		{
			System.out.println("Animal descriptin:");
			System.out.println(color+" "+"color"+" "+name+"with"+" "+" "+"legs"+" "+legs);
		}
	}
	public class booka{
	public static void main(String[] args) {
		
		animal obj1=new animal(4,"cat","white");
		obj1.display();
        animal obj2=new animal("dog","black");
        obj2.display();
	}
}


