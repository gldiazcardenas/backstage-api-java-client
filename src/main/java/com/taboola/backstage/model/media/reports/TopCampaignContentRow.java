package com.taboola.backstage.model.media.reports;

/**
 * Created by vladi
 * Date: 10/27/2017
 * Time: 10:09 PM
 * By Taboola
 */
public class TopCampaignContentRow {

    private String item;
    private String itemName;
    private String thumbnailUrl;
    private String url;
    private String campaigns;
    private String campaignName;
    private String contentProvider;
    private String contentProviderName;
    private Long impressions;
    private Double ctr;
    private Long clicks;
    private Double cpc;
    private Double cpm;
    private Double spent;
    private String currency;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(String campaigns) {
        this.campaigns = campaigns;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getContentProvider() {
        return contentProvider;
    }

    public void setContentProvider(String contentProvider) {
        this.contentProvider = contentProvider;
    }

    public String getContentProviderName() {
        return contentProviderName;
    }

    public void setContentProviderName(String contentProviderName) {
        this.contentProviderName = contentProviderName;
    }

    public Long getImpressions() {
        return impressions;
    }

    public void setImpressions(Long impressions) {
        this.impressions = impressions;
    }

    public Double getCtr() {
        return ctr;
    }

    public void setCtr(Double ctr) {
        this.ctr = ctr;
    }

    public Long getClicks() {
        return clicks;
    }

    public void setClicks(Long clicks) {
        this.clicks = clicks;
    }

    public Double getCpc() {
        return cpc;
    }

    public void setCpc(Double cpc) {
        this.cpc = cpc;
    }

    public Double getCpm() {
        return cpm;
    }

    public void setCpm(Double cpm) {
        this.cpm = cpm;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "TopCampaignContentRow{" +
        "item='" + item + '\'' +
        ", itemName='" + itemName + '\'' +
        ", thumbnailUrl='" + thumbnailUrl + '\'' +
        ", url='" + url + '\'' +
        ", campaigns='" + campaigns + '\'' +
        ", campaignName='" + campaignName + '\'' +
        ", contentProvider='" + contentProvider + '\'' +
        ", contentProviderName='" + contentProviderName + '\'' +
        ", impressions=" + impressions +
        ", ctr=" + ctr +
        ", clicks=" + clicks +
        ", cpc=" + cpc +
        ", cpm=" + cpm +
        ", spent=" + spent +
        ", currency='" + currency + '\'' +
        '}';
    }
}