package com.mycode.testcode.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;

import javax.print.attribute.standard.MediaSize;
import java.math.BigDecimal;
import java.util.Date;

public class AdmNssIcsPaymentCommissionDtlMonth {
    // 月度回款提成明细 adm_nss_ics_payment_commission_dtl_month
    @ExcelIgnore
    private int id; // -- id
    @Excel(name="统计月份")
    private String stat_month ; //-- 统计月份

    private int frame_id ; //-- 框架id
    @Excel(name="框架号")
    private String frame_num; // -- 框架号
    private int contract_id ; //-- 合同id
    @Excel(name="合同号")
    private String contract_num; // -- 合同号
    @Excel(name="渠道ID")
    private String channel_id ; //-- 渠道id
    private String user_id ; //-- 员工id
    @Excel(name="工号")
    private String user_code ; //-- 员工工号
    @Excel(name="网销销售")
    private String user_name ; //-- 员工姓名
    private Date join_date; // -- 入职日期
    private String job_status ; //-- 在岗状态
    private String dept_id ; //-- 部门id
    private int sign_company_id ; //-- 签约公司id
    private String sign_method ; //-- 签约方式
    private BigDecimal brand_sign_amt ; //-- 品牌签约金额
    private String payment_apply_bill_id ; //-- 回款申请单id
    private String payment_apply_bill_num ; //-- 回款申请单号
    private BigDecimal payment_amt ; //-- 回款金额
    private Date payment_date; // -- 回款日期
    private int real_sign_count ; //-- 实计签约家数
    private int is_out_acctdate ; //-- 是否超出账期
    @Excel(name="超期汇款金额",type = 10)
    private BigDecimal outdate_payment_amt ; //-- 超期回款金额
    private BigDecimal indate_amt ; //-- 未超期金额
    private BigDecimal base_ratio ; //-- 基础系数
    private BigDecimal sign_count_ratio ; //-- 签约家数系数
    private BigDecimal renew_disconnect_ratio ; //-- 续约断档系数
    private BigDecimal real_commission_amt ; //-- 实计提成金额
    private BigDecimal real_commission_amt_old ; //-- 实计提成金额（没有新产品前）
    private Date create_time ; //-- 创建时间
    private Date modify_time ; //-- 修改时间
    private Date begin_date ; //-- 开始日期
    private int frame_deluxe_published_count; // -- 框架豪华版已发布家数
    private String remark; // 备注
    private String commission_policy; // 提成政策
    private BigDecimal ics_split_contract_amt ; //-- ics实计提成金额(拆分数据产品后)
    private BigDecimal zhwx_split_contract_amt ; //-- 智慧网销获得拆分合同金额
    private BigDecimal znzt_split_contract_amt ; //-- 智能展厅获得拆分合同金额
    private BigDecimal ics_split_ratio ; //-- 车商汇拆分后占比
    private BigDecimal zhwx_split_ratio ; //-- 智慧网销拆分后占比
    private BigDecimal znzt_split_ratio ; //-- 智能展厅拆分后占比
    private BigDecimal zhwx_real_commission_amt ; //-- 智慧网销拆分提成金额
    private BigDecimal znzt_real_commission_amt ; //-- 智能展厅拆分提成金额

    private BigDecimal outdatePaymentCommissionAmt;
    private BigDecimal indatePaymentCommissionAmt;

    public String getSign_company_name() {
        return sign_company_name;
    }

    public void setSign_company_name(String sign_company_name) {
        this.sign_company_name = sign_company_name;
    }

    private String sign_company_name ; //-- 签约公司

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStat_month() {
        return stat_month;
    }

    public void setStat_month(String stat_month) {
        this.stat_month = stat_month;
    }

    public int getFrame_id() {
        return frame_id;
    }

    public void setFrame_id(int frame_id) {
        this.frame_id = frame_id;
    }

    public String getFrame_num() {
        return frame_num;
    }

    public void setFrame_num(String frame_num) {
        this.frame_num = frame_num;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_num() {
        return contract_num;
    }

    public void setContract_num(String contract_num) {this.contract_num = contract_num; }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {this.user_id = user_id; }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {this.user_code = user_code; }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {this.user_name = user_name; }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {this.join_date = join_date; }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {this.job_status = job_status; }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {this.dept_id = dept_id; }

    public int getSign_company_id() {
        return sign_company_id;
    }

    public void setSign_company_id(int sign_company_id) {
        this.sign_company_id = sign_company_id;
    }

    public String getSign_method() {
        return sign_method;
    }

    public void setSign_method(String sign_method) {this.sign_method = sign_method; }

    public BigDecimal getBrand_sign_amt() {
        return brand_sign_amt;
    }

    public void setBrand_sign_amt(BigDecimal brand_sign_amt) {
        this.brand_sign_amt = brand_sign_amt;
    }

    public String getPayment_apply_bill_id() {
        return payment_apply_bill_id;
    }

    public void setPayment_apply_bill_id(String payment_apply_bill_id) {this.payment_apply_bill_id = payment_apply_bill_id; }

    public String getPayment_apply_bill_num() {
        return payment_apply_bill_num;
    }

    public void setPayment_apply_bill_num(String payment_apply_bill_num) {this.payment_apply_bill_num = payment_apply_bill_num; }

    public BigDecimal getPayment_amt() {
        return payment_amt;
    }

    public void setPayment_amt(BigDecimal payment_amt) {
        this.payment_amt = payment_amt;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {this.payment_date = payment_date; }

    public int getReal_sign_count() {
        return real_sign_count;
    }

    public void setReal_sign_count(int real_sign_count) {
        this.real_sign_count = real_sign_count;
    }

    public int getIs_out_acctdate() {
        return is_out_acctdate;
    }

    public void setIs_out_acctdate(int is_out_acctdate) {
        this.is_out_acctdate = is_out_acctdate;
    }

    public BigDecimal getOutdate_payment_amt() {
        return outdate_payment_amt;
    }

    public void setOutdate_payment_amt(BigDecimal outdate_payment_amt) {
        this.outdate_payment_amt = outdate_payment_amt;
    }

    public BigDecimal getIndate_amt() {
        return indate_amt;
    }

    public void setIndate_amt(BigDecimal indate_amt) {
        this.indate_amt = indate_amt;
    }

    public BigDecimal getBase_ratio() {
        return base_ratio;
    }

    public void setBase_ratio(BigDecimal base_ratio) {
        this.base_ratio = base_ratio;
    }

    public BigDecimal getSign_count_ratio() {
        return sign_count_ratio;
    }

    public void setSign_count_ratio(BigDecimal sign_count_ratio) {
        this.sign_count_ratio = sign_count_ratio;
    }

    public BigDecimal getRenew_disconnect_ratio() {
        return renew_disconnect_ratio;
    }

    public void setRenew_disconnect_ratio(BigDecimal renew_disconnect_ratio) {
        this.renew_disconnect_ratio = renew_disconnect_ratio;
    }

    public BigDecimal getReal_commission_amt() {
        return real_commission_amt;
    }

    public void setReal_commission_amt(BigDecimal real_commission_amt) {
        this.real_commission_amt = real_commission_amt;
    }

    public BigDecimal getReal_commission_amt_old() {
        return real_commission_amt_old;
    }

    public void setReal_commission_amt_old(BigDecimal real_commission_amt_old) {
        this.real_commission_amt_old = real_commission_amt_old;
    }

    public BigDecimal getIcs_split_contract_amt() {
        return ics_split_contract_amt;
    }

    public void setIcs_split_contract_amt(BigDecimal ics_split_contract_amt) {
        this.ics_split_contract_amt = ics_split_contract_amt;
    }

    public BigDecimal getZhwx_split_contract_amt() {
        return zhwx_split_contract_amt;
    }

    public void setZhwx_split_contract_amt(BigDecimal zhwx_split_contract_amt) {
        this.zhwx_split_contract_amt = zhwx_split_contract_amt;
    }

    public BigDecimal getZnzt_split_contract_amt() {
        return znzt_split_contract_amt;
    }

    public void setZnzt_split_contract_amt(BigDecimal znzt_split_contract_amt) {
        this.znzt_split_contract_amt = znzt_split_contract_amt;
    }

    public BigDecimal getIcs_split_ratio() {
        return ics_split_ratio;
    }

    public void setIcs_split_ratio(BigDecimal ics_split_ratio) {
        this.ics_split_ratio = ics_split_ratio;
    }

    public BigDecimal getZhwx_split_ratio() {
        return zhwx_split_ratio;
    }

    public void setZhwx_split_ratio(BigDecimal zhwx_split_ratio) {
        this.zhwx_split_ratio = zhwx_split_ratio;
    }

    public BigDecimal getZnzt_split_ratio() {
        return znzt_split_ratio;
    }

    public void setZnzt_split_ratio(BigDecimal znzt_split_ratio) {
        this.znzt_split_ratio = znzt_split_ratio;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public int getFrame_deluxe_published_count() {
        return frame_deluxe_published_count;
    }

    public void setFrame_deluxe_published_count(int frame_deluxe_published_count) {
        this.frame_deluxe_published_count = frame_deluxe_published_count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCommission_policy() {
        return commission_policy;
    }

    public void setCommission_policy(String commission_policy) {
        this.commission_policy = commission_policy;
    }

    public BigDecimal getZhwx_real_commission_amt() {
        return zhwx_real_commission_amt;
    }

    public void setZhwx_real_commission_amt(BigDecimal zhwx_real_commission_amt) {
        this.zhwx_real_commission_amt = zhwx_real_commission_amt;
    }

    public BigDecimal getZnzt_real_commission_amt() {
        return znzt_real_commission_amt;
    }

    public void setZnzt_real_commission_amt(BigDecimal znzt_real_commission_amt) {
        this.znzt_real_commission_amt = znzt_real_commission_amt;
    }

    public BigDecimal getOutdatePaymentCommissionAmt() {
        return outdatePaymentCommissionAmt;
    }

    public void setOutdatePaymentCommissionAmt(BigDecimal outdatePaymentCommissionAmt) {
        this.outdatePaymentCommissionAmt = outdatePaymentCommissionAmt;
    }

    public BigDecimal getIndatePaymentCommissionAmt() {
        return indatePaymentCommissionAmt;
    }

    public void setIndatePaymentCommissionAmt(BigDecimal indatePaymentCommissionAmt) {
        this.indatePaymentCommissionAmt = indatePaymentCommissionAmt;
    }
}
