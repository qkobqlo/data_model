package services;

import arguments.MarketArgument;
import domain.MarketBean;
import transformers.MarketTransfromer;
import transformers.Transformerable;

public class MarketService extends BaseService
{
    public void createMarket(MarketArgument marketArgument)
    {
        beginTransaction();

        MarketBean marketBean = new MarketBean();
        Transformerable<MarketArgument, MarketBean> marketTransformer = new MarketTransfromer();
        marketTransformer.transform(marketArgument, marketBean);

        session.save(marketBean);

        endTransaction();
    }
}
