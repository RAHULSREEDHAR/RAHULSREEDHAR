package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("ApplicaionContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(rs);
		
		First ts=(First)factory.getBean("obj");

		ts.display();
		
				
	}
	
	
         

}
