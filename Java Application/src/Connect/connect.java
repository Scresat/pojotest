
package Connect;

import POJO.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class connect {
    static Session session = null;
    
    public static void insert(Student s) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        tx.commit();
        session.close();
    }
}
