package streamOnCollection;
import java.util.ArrayList;
import java.util.List;
//example without stream
public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1,"SamsungMobile",15000f));
		productList.add(new Product(2,"NokiaMobile",10000f));
		productList.add(new Product(3,"AppleMobile",100000f));
		productList.add(new Product(4,"OnePlusMobile",35000f));
		productList.add(new Product(5,"MotrollaMobile",12000f));
		productList.add(new Product(5,"VivoMobile",15000f));
		productList.add(new Product(5,"PixelMobile",35000f));
		
		List<Float> priceList = new ArrayList<Float>();
		for (Product p : productList) {
			if(p.price<30000)
				priceList.add(p.price);
		}
		
		priceList.forEach(System.out::println);
	}

}