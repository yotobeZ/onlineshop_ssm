package com.hfut.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Salerecord implements Serializable {
    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private Integer saleId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private Integer saleNo;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private Date saleDate;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private Integer saleNum;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column salerecord.SaleId
     *
     * @return the value of salerecord.SaleId
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Salerecord withSaleId(Integer saleId) {
        this.setSaleId(saleId);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleId
     *
     * @param saleId the value for salerecord.SaleId
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    /**
     * This method returns the value of the database column salerecord.SaleNo
     *
     * @return the value of salerecord.SaleNo
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Integer getSaleNo() {
        return saleNo;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Salerecord withSaleNo(Integer saleNo) {
        this.setSaleNo(saleNo);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleNo
     *
     * @param saleNo the value for salerecord.SaleNo
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public void setSaleNo(Integer saleNo) {
        this.saleNo = saleNo;
    }

    /**
     * This method returns the value of the database column salerecord.ProId
     *
     * @return the value of salerecord.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Salerecord withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.ProId
     *
     * @param proId the value for salerecord.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column salerecord.SaleDate
     *
     * @return the value of salerecord.SaleDate
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Salerecord withSaleDate(Date saleDate) {
        this.setSaleDate(saleDate);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleDate
     *
     * @param saleDate the value for salerecord.SaleDate
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * This method returns the value of the database column salerecord.SaleNum
     *
     * @return the value of salerecord.SaleNum
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public Salerecord withSaleNum(Integer saleNum) {
        this.setSaleNum(saleNum);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleNum
     *
     * @param saleNum the value for salerecord.SaleNum
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleId=").append(saleId);
        sb.append(", saleNo=").append(saleNo);
        sb.append(", proId=").append(proId);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", saleNum=").append(saleNum);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
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
        Salerecord other = (Salerecord) that;
        return (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getSaleNo() == null ? other.getSaleNo() == null : this.getSaleNo().equals(other.getSaleNo()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getSaleDate() == null ? other.getSaleDate() == null : this.getSaleDate().equals(other.getSaleDate()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()));
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getSaleNo() == null) ? 0 : getSaleNo().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getSaleDate() == null) ? 0 : getSaleDate().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        return result;
    }
}