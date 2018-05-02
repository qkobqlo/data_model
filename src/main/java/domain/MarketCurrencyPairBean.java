package domain;

import javax.persistence.*;

@Entity
@Table(name = "market_currency_pair", schema = "crypto_bot")
public class MarketCurrencyPairBean {
    private int id;
    private Integer deal;
    private Integer currencyPair;
    private int marketId;
    private int currencyId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "deal")
    public Integer getDeal() {
        return deal;
    }

    public void setDeal(Integer deal) {
        this.deal = deal;
    }

    @Basic
    @Column(name = "currency_pair")
    public Integer getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(Integer currencyPair) {
        this.currencyPair = currencyPair;
    }

    @Basic
    @Column(name = "market_id", nullable = false)
    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    @Basic
    @Column(name = "currency_id", nullable = false)
    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarketCurrencyPairBean that = (MarketCurrencyPairBean) o;

        if (id != that.id) return false;
        if (marketId != that.marketId) return false;
        if (currencyId != that.currencyId) return false;
        if (deal != null ? !deal.equals(that.deal) : that.deal != null) return false;
        return currencyPair != null ? currencyPair.equals(that.currencyPair) : that.currencyPair == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (deal != null ? deal.hashCode() : 0);
        result = 31 * result + (currencyPair != null ? currencyPair.hashCode() : 0);
        result = 31 * result + marketId;
        result = 31 * result + currencyId;
        return result;
    }
}
