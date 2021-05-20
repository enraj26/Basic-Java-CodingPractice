package com.codewithraju.xml.test;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class writexml {

	public static void main(String[] args) {

		Person p = new Person();
		p.setId(1);
		p.setName("raju");
		p.setMarks(100);

		Address add = new Address();
		add.setId(1);
		add.setFlatno("11-/flat1");
		add.setArea("Haveli");
		add.setStreet("back street");

		Address add1 = new Address();
		add1.setId(1);
		add1.setFlatno("22-/flat1");
		add1.setArea("Tilak Nagar");
		add1.setStreet("back street");

		Address add2 = new Address();
		add2.setId(1);
		add2.setFlatno("33-/flat1");
		add2.setArea("Kachiguda");
		add2.setStreet("back street");

		ArrayList<Address> addList = new ArrayList<>();
		addList.add(add);
		addList.add(add1);
		addList.add(add2);

		p.setAdd(addList);
		try {
			JAXBContext con = JAXBContext.newInstance(Person.class);
			Marshaller createMarshaller = con.createMarshaller();
			createMarshaller.setProperty(createMarshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(p, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
