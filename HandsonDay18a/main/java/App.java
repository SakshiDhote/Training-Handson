import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

    	  Customer ob=ctx.getBean(Customer.class);

    	ob.getAccount().deposit(5000);
    	ob.getAccount().withdraw(1000);
    	 
    }
}
