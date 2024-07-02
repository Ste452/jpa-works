
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 2);
		
		em.getTransaction().begin();
		
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println(p);
		
		System.out.println("Now is ready");
		
		em.close();
		emf.close();
	}
}
