package news;

import dao.NewsDao;
import model.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.IOException;

public class NewsDownloader {
    public static void main(String[] args) throws IOException {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()){
            NewsDao newsDao = new NewsDao(sessionFactory);
            try(Session session= sessionFactory.getCurrentSession() ){
                Transaction tx = session.beginTransaction();

                News news = newsDao.save(new News("C","B","A"));
                tx.commit();
            }

            try (Session session = sessionFactory.getCurrentSession()){
                session.beginTransaction();
                System.out.println("News");
                newsDao.list().forEach(news -> System.out.println(news.getTitle()));
            }
        }
    }
}
