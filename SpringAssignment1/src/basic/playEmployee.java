package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.EmployeeDao;
import basic.model.Employee;

public class playEmployee {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Employee myemployee=new Employee(3,"vasu",40000,"Engineer");
		Employee anotheremployee=new Employee(4,"Akshay",50000,"SoftwareEngineer");
		EmployeeDao employeedao1=(EmployeeDao) context.getBean("employeedao1");
		employeedao1.insert(myemployee);
		
	}

}
