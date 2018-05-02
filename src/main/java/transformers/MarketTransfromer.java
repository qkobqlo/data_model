package transformers;

import arguments.MarketArgument;
import domain.MarketBean;

public class MarketTransfromer implements Transformerable<MarketArgument, MarketBean> {

    public void transform(MarketArgument argType, MarketBean beanType)
    {
        beanType.setId(argType.getId());
        beanType.setName(argType.getName());
    }
}
