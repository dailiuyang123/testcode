package com.mycode.testcode.controller;

import com.mycode.testcode.entity.AdmNssIcsPaymentCommissionDtlMonth;
import com.mycode.testcode.entity.vc;
import com.mycode.testcode.util.EasyPoiUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EasyPoiController
 * Description: TODO
 * @Author dailiuyang
 * @Date 2019/7/30 16:15
 **/

@Controller
public class EasyPoiController {

    @RequestMapping("/export_excel")
    public void exportExcel(@RequestParam Map<String,Object> map, HttpServletResponse response){
        //根据条件查询数据库数据list
        List<AdmNssIcsPaymentCommissionDtlMonth> list=new ArrayList();

//        for(int i=0;i<10;i++){
//            vc vc=new vc();
//            vc.setVcName("v1No"+i);
//            vc.setVcPphone("12345678");
//            vc.setOrderStatus(1);
//            vc.setOrderTotal(i+1);
//            vc.setOrderMoneyTotal(999.01);
//            list.add(vc);
//        }

        for(int i=0;i<10;i++){
            AdmNssIcsPaymentCommissionDtlMonth admNssIcsPaymentCommissionDtlMonth=new AdmNssIcsPaymentCommissionDtlMonth();
            admNssIcsPaymentCommissionDtlMonth.setStat_month("2019年6月");
            admNssIcsPaymentCommissionDtlMonth.setFrame_num("JXS_201609_0006");
            admNssIcsPaymentCommissionDtlMonth.setContract_num("SW-JXS-201704-00300");
            admNssIcsPaymentCommissionDtlMonth.setChannel_id("11");
            admNssIcsPaymentCommissionDtlMonth.setUser_code("2985");
            admNssIcsPaymentCommissionDtlMonth.setUser_name("夏勇");
            admNssIcsPaymentCommissionDtlMonth.setOutdate_payment_amt(new BigDecimal(100.11));
            list.add(admNssIcsPaymentCommissionDtlMonth);
        }

        //设置表名，引脚名，文件格式，及写入list数据到excel中
        EasyPoiUtil.exportExcel(list,"客户订单统计表","网销业绩管理",AdmNssIcsPaymentCommissionDtlMonth.class,"网销业绩管理.xls",response);
    }

}
