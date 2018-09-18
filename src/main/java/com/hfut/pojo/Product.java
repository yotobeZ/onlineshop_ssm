package com.hfut.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Product implements Serializable {
    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private String proName;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private String proPic;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private BigDecimal proPrice;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private String proSize;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private String proCatagory;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column product.ProId
     *
     * @return the value of product.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProId
     *
     * @param proId the value for product.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column product.ProName
     *
     * @return the value of product.ProName
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public String getProName() {
        return proName;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProName(String proName) {
        this.setProName(proName);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProName
     *
     * @param proName the value for product.ProName
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * This method returns the value of the database column product.ProPic
     *
     * @return the value of product.ProPic
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public String getProPic() {
        return proPic;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProPic(String proPic) {
        this.setProPic(proPic);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProPic
     *
     * @param proPic the value for product.ProPic
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProPic(String proPic) {
        this.proPic = proPic;
    }

    /**
     * This method returns the value of the database column product.ProPrice
     *
     * @return the value of product.ProPrice
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public BigDecimal getProPrice() {
        return proPrice;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProPrice(BigDecimal proPrice) {
        this.setProPrice(proPrice);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProPrice
     *
     * @param proPrice the value for product.ProPrice
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * This method returns the value of the database column product.ProSize
     *
     * @return the value of product.ProSize
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public String getProSize() {
        return proSize;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProSize(String proSize) {
        this.setProSize(proSize);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProSize
     *
     * @param proSize the value for product.ProSize
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProSize(String proSize) {
        this.proSize = proSize;
    }

    /**
     * This method returns the value of the database column product.ProCatagory
     *
     * @return the value of product.ProCatagory
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public String getProCatagory() {
        return proCatagory;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public Product withProCatagory(String proCatagory) {
        this.setProCatagory(proCatagory);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProCatagory
     *
     * @param proCatagory the value for product.ProCatagory
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    public void setProCatagory(String proCatagory) {
        this.proCatagory = proCatagory;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", proPic=").append(proPic);
        sb.append(", proPrice=").append(proPrice);
        sb.append(", proSize=").append(proSize);
        sb.append(", proCatagory=").append(proCatagory);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProPic() == null ? other.getProPic() == null : this.getProPic().equals(other.getProPic()))
            && (this.getProPrice() == null ? other.getProPrice() == null : this.getProPrice().equals(other.getProPrice()))
            && (this.getProSize() == null ? other.getProSize() == null : this.getProSize().equals(other.getProSize()))
            && (this.getProCatagory() == null ? other.getProCatagory() == null : this.getProCatagory().equals(other.getProCatagory()));
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProPic() == null) ? 0 : getProPic().hashCode());
        result = prime * result + ((getProPrice() == null) ? 0 : getProPrice().hashCode());
        result = prime * result + ((getProSize() == null) ? 0 : getProSize().hashCode());
        result = prime * result + ((getProCatagory() == null) ? 0 : getProCatagory().hashCode());
        return result;
    }
}