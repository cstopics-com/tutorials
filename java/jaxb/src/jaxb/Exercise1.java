package jaxb;

import java.io.File;  
import java.util.List;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  

public class Exercise1 {  
	public static void main(String[] args) {  

		try {  

			File file = new File("demo.xml");  
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);  

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
			Person person= (Person) jaxbUnmarshaller.unmarshal(file);  

			System.out.println(person.getName());  
			System.out.println("Adresses:");  
			List<Address> list=person.getAddress();  
			for(Address adress:list)  
				System.out.println("  "+adress.getStreet()+" "+adress.getNumber());  

		} catch (JAXBException e) {  
			e.printStackTrace();  
		}  

	}  
}  