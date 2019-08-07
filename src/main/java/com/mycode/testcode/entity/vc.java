package com.mycode.testcode.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;

/**
 * @ClassName vc
 * Description: TODO
 * @Author dailiuyang
 * @Date 2019/7/30 16:14
 **/
public class vc {


    @Excel(name = "客户名称")
    private String vcName;
    @Excel(name = "客户手机号")
    private String vcPphone;

    @Excel(name = "是否未提交",replace = {"是_0", "否_1","否_2","否_3","否_4","否_5"})
    private Integer orderStatus;
    /**
     * @Description: 客户订单统计
     */
    @Excel(name = "客户订单总计",type = 10)
    private Integer orderTotal;

    /**
     * @Description: 客户订单金额统计
     */
    @Excel(name = "客户订单总金额",type = 10)
    private Double orderMoneyTotal;

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public String getVcPphone() {
        return vcPphone;
    }

    public void setVcPphone(String vcPphone) {
        this.vcPphone = vcPphone;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Double getOrderMoneyTotal() {
        return orderMoneyTotal;
    }

    public void setOrderMoneyTotal(Double orderMoneyTotal) {
        this.orderMoneyTotal = orderMoneyTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        vc vc = (vc) o;

        if (!vcName.equals(vc.vcName)) return false;
        if (!vcPphone.equals(vc.vcPphone)) return false;
        if (!orderStatus.equals(vc.orderStatus)) return false;
        if (!orderTotal.equals(vc.orderTotal)) return false;
        return orderMoneyTotal.equals(vc.orderMoneyTotal);
    }

    @Override
    public int hashCode() {
        int result = vcName.hashCode();
        result = 31 * result + vcPphone.hashCode();
        result = 31 * result + orderStatus.hashCode();
        result = 31 * result + orderTotal.hashCode();
        result = 31 * result + orderMoneyTotal.hashCode();
        return result;
    }
}
