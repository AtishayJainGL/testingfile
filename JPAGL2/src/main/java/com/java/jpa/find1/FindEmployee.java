package com.java.jpa.find1;
import javax.persistence.*;
import com.java.jpa.employeee.*;
import java.util.List;
public class FindEmployee {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

		    EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();

		    EmployeeEntry e1=new EmployeeEntry();

		   e1.setE_id(101);
		   e1.setE_name("Gaurav");
		   e1.setE_desig("Developer");
		   e1.setE_sal(100000);
		   EmployeeEntry e2=new EmployeeEntry();
		   e2.setE_id(102);
		   e2.setE_name("vaibhav");
		   e2.setE_desig("Desiner");
		   e2.setE_sal(90000);
		   EmployeeEntry e3=new EmployeeEntry();
		   e3.setE_id(103);
		   e3.setE_name("Kumar");
		   e3.setE_desig("Developer");
		   e3.setE_sal(900000);
		   em.persist(e1);

		    em.persist(e2);

		    em.persist(e3);

		    em.getTransaction().commit();
		    
		   
		    Query q= em.createQuery("from EmployeeEntry");

		    List <EmployeeEntry> list= q.getResultList();

		    for(EmployeeEntry se:list)

		    {

		     System.out.println(se.getE_id()+" "+se.getE_name()+" "+" "+se.getE_desig()+" " +se.getE_sal());

		    }

	}

}
