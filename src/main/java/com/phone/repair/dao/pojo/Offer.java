package com.phone.repair.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Offer implements Serializable {
    private int partId;
    private String partName;
    private BigDecimal offerPrice;

    public Offer(String partName, BigDecimal offerPrice) {
        this.partName = partName;
        this.offerPrice = offerPrice;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                ", offerPrice=" + offerPrice +
                '}';
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Offer(int partId, String partName, BigDecimal offerPrice) {
        this.partId = partId;
        this.partName = partName;
        this.offerPrice = offerPrice;
    }

    public Offer() {
    }
}
