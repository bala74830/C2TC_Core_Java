package lamdaexample;

import java.util.function.BiConsumer;

public class Lambdaexceptionhandling {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5,6};
		int key=2;
		operation(numbers,key,(v,k)->System.out.println(v+k));

	}
public static void operation(int []numbers,int key,BiConsumer<Integer,Integer>consumer)
{
	for(int i : numbers)
	{
		consumer.accept(i,key);
	}
}
}
