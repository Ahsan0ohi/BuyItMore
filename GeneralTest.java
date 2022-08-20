package ECommerce.BuyItMore;

import static org.junit.Assert.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class GeneralTest {


	public static void main(String[]args) 
	{
	
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
	context.scan("ECommerce");
	context.refresh();
	
	}

}
