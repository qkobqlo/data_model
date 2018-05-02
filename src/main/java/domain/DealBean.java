package domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "deal", schema = "crypto_bot")
public class DealBean {
    private int id;
    private String status;
    private int marketId;
    private int marketCurrencyPairId;
    private int quantity;
    private Integer accetPriceBuy;
    private Integer assetDesiredPriceSell;
    private Integer assetPriceSell;
    private int orderId;
    private Timestamp created;
    private Timestamp closed;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "market_currency_pair_id", nullable = false)
    public int getMarketCurrencyPairId() {
        return marketCurrencyPairId;
    }

    public void setMarketCurrencyPairId(int marketCurrencyPairId) {
        this.marketCurrencyPairId = marketCurrencyPairId;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "accet_price_buy")
    public Integer getAccetPriceBuy() {
        return accetPriceBuy;
    }

    public void setAccetPriceBuy(Integer accetPriceBuy) {
        this.accetPriceBuy = accetPriceBuy;
    }

    @Basic
    @Column(name = "asset_desired_price_sell")
    public Integer getAssetDesiredPriceSell() {
        return assetDesiredPriceSell;
    }

    public void setAssetDesiredPriceSell(Integer assetDesiredPriceSell) {
        this.assetDesiredPriceSell = assetDesiredPriceSell;
    }

    @Basic
    @Column(name = "asset_price_sell")
    public Integer getAssetPriceSell() {
        return assetPriceSell;
    }

    public void setAssetPriceSell(Integer assetPriceSell) {
        this.assetPriceSell = assetPriceSell;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "created", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "closed", nullable = false)
    public Timestamp getClosed() {
        return closed;
    }

    public void setClosed(Timestamp closed) {
        this.closed = closed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealBean dealBean = (DealBean) o;

        if (id != dealBean.id) return false;
        if (marketId != dealBean.marketId) return false;
        if (marketCurrencyPairId != dealBean.marketCurrencyPairId) return false;
        if (quantity != dealBean.quantity) return false;
        if (orderId != dealBean.orderId) return false;
        if (status != null ? !status.equals(dealBean.status) : dealBean.status != null) return false;
        if (accetPriceBuy != null ? !accetPriceBuy.equals(dealBean.accetPriceBuy) : dealBean.accetPriceBuy != null)
            return false;
        if (assetDesiredPriceSell != null ? !assetDesiredPriceSell.equals(dealBean.assetDesiredPriceSell) : dealBean.assetDesiredPriceSell != null)
            return false;
        if (assetPriceSell != null ? !assetPriceSell.equals(dealBean.assetPriceSell) : dealBean.assetPriceSell != null)
            return false;
        if (created != null ? !created.equals(dealBean.created) : dealBean.created != null) return false;
        return closed != null ? closed.equals(dealBean.closed) : dealBean.closed == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + marketId;
        result = 31 * result + marketCurrencyPairId;
        result = 31 * result + quantity;
        result = 31 * result + (accetPriceBuy != null ? accetPriceBuy.hashCode() : 0);
        result = 31 * result + (assetDesiredPriceSell != null ? assetDesiredPriceSell.hashCode() : 0);
        result = 31 * result + (assetPriceSell != null ? assetPriceSell.hashCode() : 0);
        result = 31 * result + orderId;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (closed != null ? closed.hashCode() : 0);
        return result;
    }
}
