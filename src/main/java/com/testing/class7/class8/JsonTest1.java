package com.testing.class7.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author : wangxy
 * @create time ： 2022/5/11
 */
public class JsonTest1 {
    public static void main(String[] args) {
        String str="(activityInfo=DjActivityCreateInfoReq(activityName=门店共赢服务费抵扣红包, activityType=10, purpose=14, channelSource=1, orgCode=null, showLocation=null, showPlatform=null, beginTime=Wed May 11 00:00:00 CST 2022, endTime=Fri Jun 10 23:59:59 CST 2022, activityGrabTimesDay=0, jdActivityGrabTimesDay=0, limitTimes=2, limitNum=0, limitUser=null, limitCity=null, limitChannel=null, limitSource=null), couponInfo=DjCouponCreateInfoReq(couponName=门店共赢服务费抵扣红包, couponType=1, showName=门店共赢服务费抵扣红包, showText=仅当日扫码订单可用, grabBeginTime=Wed May 11 00:00:00 CST 2022, grabEndTime=Tue May 31 23:59:59 CST 2022, couponExpiryType=1, couponBeginTime=null, couponEndTime=null, totalNum=9999999, quota=500, minOrderAmount=500, maxOrderAmount=0, platShareProportion=100, couponMode=4, goodsLimitMode=1, limitOrg=[363236], limitStation=[12264852], limitCity=[2005], limitChannel=[101, 301, 601, 201], limitDelivery=[3], expiryBeginDays=0, expiryEndDays=1), createPin=lailaitui_laoke@imdada.cn, couponAccessToken=inviter-growth-center1-C20200820)";
        str=str.replace("(","{");
        System.out.println(str);
        str=str.replace(")","}");

        System.out.println(str);
        String strS="(\\w+)\\s*=\\s*(\\w+)";

        String strresult=str.replaceAll(strS,"\"$1\":\"$2\"");
       /* JSONObject sJson=JSON.parseObject(strresult);*/
        System.out.println(strresult);
    }


}
