
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(null, "Steve Vaz", "stevevaz@gmail.com");
		Person p2 = new Person(null, "Isaac Newton", "isaacnewton@gmail.com");
		Person p3 = new Person(null, "Leonhard Euler", "euler_e@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("Now is ready");
	}
}
