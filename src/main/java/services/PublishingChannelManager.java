package services;

import domain.AssetPublishingChannelsBean;
import org.hibernate.Session;
import util.HibernateUtil;

public class PublishingChannelManager
{
    public static void main(String[] args)
    {
        PublishingChannelManager manager = new PublishingChannelManager();
        manager.createAndStoreEvent(500000, "test insert");

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreEvent(int id, String name) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        AssetPublishingChannelsBean assetPublishingChannelsBean = new AssetPublishingChannelsBean();
        assetPublishingChannelsBean.setPublishingChannelId(id);
        assetPublishingChannelsBean.setPublishingChannelName(name);
        session.save(assetPublishingChannelsBean);

        session.getTransaction().commit();
    }
}
