package TNS;
import java.lang.annotation.*;

@SmartPhone
 class annotationdemo {
	String series;
	int camera;
	public annotationdemo(String series,int camera)
	{
		this.camera=camera;
		this.series=series;
	}

}
 class Samsung_series
{
	public static void main(String args[])
	{
		annotationdemo obj=new annotationdemo("Note10", 3);
		System.out.println(obj.camera);
		System.out.println(obj.series);
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.Android_version());
		System.out.println(s.snapdragon());
		
	}
}