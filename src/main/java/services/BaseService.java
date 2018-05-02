package services;

import org.hibernate.Session;
import util.HibernateUtil;

class BaseService {

    Session session;

    private Session getSession()
    {
        if(session == null)
        {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }

        return session;
    }

    void beginTransaction()
    {
        getSession().beginTransaction();
    }

    void endTransaction()
    {
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
    }
}
