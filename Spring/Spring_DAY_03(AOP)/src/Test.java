import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.A;

public class Test {
	
public static void main(String[] args) { 
	
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    A a = (A)factory.getBean("proxy",A.class);  
    a.m(); 
    
	}  
}  
