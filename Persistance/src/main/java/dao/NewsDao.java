package dao;

import model.News;
import org.hibernate.SessionFactory;

public class NewsDao extends AbstractDao<News> {

    public NewsDao(SessionFactory sessionFactory) {
        super(sessionFactory, News.class, "News");
    }
}
