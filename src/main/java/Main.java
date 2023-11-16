
import java.time.LocalDate;
import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(
                        "$objectdb/db/p3.odb");
        EntityManager em = emf.createEntityManager();

        // Store 1000 Point objects in the database:
        em.getTransaction().begin();
        Auto auto = new Auto("Toyota", "333-333", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11))
        em.persist(auto);
        Auto auto1 = new Auto("Toyota", "333-AAA", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11))
        em.persist(auto);
        Auto auto2 = new Auto("Toyota", "233322-AAA", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11))
        em.persist(auto);
        Auto auto3 = new Auto("Toyota", "3333-AAA", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11))
        em.persist(auto);
        Auto auto4 = new Auto("Toyota", "23322-AAA", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11))
        em.persist(auto);


        em.getTransaction().commit();

        //Query q1 = em.createQuery("SELECT COUNT(p) FROM Persona p");
        //System.out.println("Total Points: " + q1.getSingleResult());

        // Query q1 = em.createQuery("SELECT p FROM Persona p Where p,nombres= 'Liseth' ");
        //System.out.println("Datos: " + q1.getSingleResult());

        TypedQuery<Auto> query =
                em.createQuery("SELECT p FROM Auto p", Persona.class);
        List<Auto> results = query.getResultList();
        for (Auto p : results) {
            //debería calcular la edad
            //verificar el de mayor edad
            System.out.println(p);
        }

    }

}

