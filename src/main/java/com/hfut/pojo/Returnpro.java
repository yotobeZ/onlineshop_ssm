package com.hfut.pojo;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Returnpro implements Serializable {
    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    private Integer returnId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    private Integer saleId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    private Integer returnNum;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column returnpro.ReturnId
     *
     * @return the value of returnpro.ReturnId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Integer getReturnId() {
        return returnId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Returnpro withReturnId(Integer returnId) {
        this.setReturnId(returnId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ReturnId
     *
     * @param returnId the value for returnpro.ReturnId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    /**
     * This method returns the value of the database column returnpro.SaleId
     *
     * @return the value of returnpro.SaleId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Returnpro withSaleId(Integer saleId) {
        this.setSaleId(saleId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.SaleId
     *
     * @param saleId the value for returnpro.SaleId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    /**
     * This method returns the value of the database column returnpro.ProId
     *
     * @return the value of returnpro.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Returnpro withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ProId
     *
     * @param proId the value for returnpro.ProId
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column returnpro.ReturnNum
     *
     * @return the value of returnpro.ReturnNum
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Integer getReturnNum() {
        return returnNum;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Returnpro withReturnNum(Integer returnNum) {
        this.setReturnNum(returnNum);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ReturnNum
     *
     * @param returnNum the value for returnpro.ReturnNum
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", returnId=").append(returnId);
        sb.append(", saleId=").append(saleId);
        sb.append(", proId=").append(proId);
        sb.append(", returnNum=").append(returnNum);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
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
        Returnpro other = (Returnpro) that;
        return (this.getReturnId() == null ? other.getReturnId() == null : this.getReturnId().equals(other.getReturnId()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getReturnNum() == null ? other.getReturnNum() == null : this.getReturnNum().equals(other.getReturnNum()));
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReturnId() == null) ? 0 : getReturnId().hashCode());
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getReturnNum() == null) ? 0 : getReturnNum().hashCode());
        return result;
    }
}