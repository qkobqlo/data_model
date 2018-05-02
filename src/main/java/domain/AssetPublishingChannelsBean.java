package domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_publishing_channels", schema = "trunk_svetoslav")
public class AssetPublishingChannelsBean
{
    private int publishingChannelId;
    private String publishingChannelName;

    @Id
    @Column(name = "PUBLISHING_CHANNEL_ID")
    public int getPublishingChannelId()
    {
        return publishingChannelId;
    }

    public void setPublishingChannelId(int publishingChannelId)
    {
        this.publishingChannelId = publishingChannelId;
    }

    @Basic
    @Column(name = "PUBLISHING_CHANNEL_NAME")
    public String getPublishingChannelName()
    {
        return publishingChannelName;
    }

    public void setPublishingChannelName(String publishingChannelName)
    {
        this.publishingChannelName = publishingChannelName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AssetPublishingChannelsBean that = (AssetPublishingChannelsBean) o;

        if (publishingChannelId != that.publishingChannelId)
            return false;
        if (publishingChannelName != null ?
                !publishingChannelName.equals(that.publishingChannelName) :
                that.publishingChannelName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = publishingChannelId;
        result = 31 * result + (publishingChannelName != null ? publishingChannelName.hashCode() : 0);
        return result;
    }
}
