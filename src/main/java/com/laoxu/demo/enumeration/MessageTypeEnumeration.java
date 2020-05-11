package com.laoxu.demo.enumeration;

import lombok.Getter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MessageTypeEnumeration {

    public enum SendMessage{
        send1( 1, "视频-就诊申请成功"),
        send2( 2, "视频-停诊"),
        send3( 3, "视频-医生叫号"),
        send4( 4, "视频-取消并退款"),
        send5( 5, "视频-已过号"),
        send6( 6, "视频-医完成诊断未开具处方"),
        send7( 7, "视频-医处方待审核"),
        send8( 8, "视频-医处方审核未通过"),
        send9( 9, "视频-医处方审核通过"),
        send10( 10, "视频-管理员同意退款"),
        send1001( 1001, "取消订单"),
        send11( 11, "视频-管理员拒绝退款"),

        send12(12, "视频-管理员给医生排班"),
        send13(13, "视频-管理员给医生停诊"),
        send14(14, "视频-管理员给医生排班调整"),
        send15(15, "视频-自由排班权限申请提交"),
        send16(16, "视频-自由排班权限申请未通过"),
        send17(17, "视频-自由排班权限申请通过"),
        send18(18, "视频-自由排班申请提交"),
        send19(19, "视频-自由排班申请未通过"),
        send20(20, "视频-自由排班申请通过"),
        send21(21, "视频-自由排班停诊申请提交"),
        send22(22, "视频-自由排班停诊申请未通过"),
        send23(23, "视频-自由排班停诊申请通过"),
        send24(24, "视频-每天提醒有排班的医生"),
        send25(25, "视频-管理员给医生排班(当天)"),
        send26(26, "视频-管理员给医生停诊"),
        send27(27, "视频-自由排班申请通过（修改价格）"),
        send28(28, "视频-自由排班停诊取消"),

        send168( 168, "视频-15分钟未叫号（医生）"),

        //        send101( 101, "图文-支付成功"),
        send102( 102, "图文-医生首次回复患者"),
        send1021( 1021, "团队-医生首次回复患者"),
        send103( 103, "图文-后台提醒患者"),
        send1031( 1031, "团队-后台提醒患者"),
        send104( 104, "图文-后台同意退款"),
        send1041( 1041, "图文-后台同意退款"),
        send105( 105, "团队-后台拒绝退款"),
        send1051( 1051, "团队-后台拒绝退款"),
        send106( 106, "图文-关闭咨询"),
        send1061( 1061, "团队-关闭咨询"),
        send107( 107, "图文-实时聊天"),
        send1072( 1072, "图文（消息）-实时聊天"),
        send1073( 1073, "图文(团队消息)-实时聊天"),
        send1071( 1071, "图文-实时聊天(医生)"),
        send1074( 1074, "图文（消息）-实时聊天(医生)"),
        send1075( 1075, "图文(团队消息)-实时聊天(医生)"),
        send1076( 1076, "图文（消息）-实时聊天(医生)(不发短信)"),
        send1077( 1077, "图文(团队消息)-实时聊天(医生)(不发短信)"),
        send108( 108, "图文-最后6小时提示"),
        send1081( 1081, "团队-最后6小时提示"),
        send109( 109, "图文-绑定手机号提示"),
        send110( 110, "图文-医生只开诊断，未开处方"),
        send111( 111, "图文-医生开具处方，药师审核通过"),
        send113( 113, "图文-系统发起退款"),
        send1131( 1131, "图文-系统发起退款(消息)"),
        send11311( 11311, "团队-系统发起退款(消息)"),
        send114( 114, "图文-患者发起咨询"),
        send1141( 1141, "团队-患者发起咨询"),
        send115( 115, "图文-后台提醒医生"),
        send1151( 1151, "团队-后台提醒医生"),
        send116( 116, "图文-后台价格删除提示"),
        send1161( 1161, "电话-后台价格删除提示"),
        send117( 117, "图文-后台擅长审核通过"),
        send118( 118, "图文-后台擅长审核被拒绝"),
        send119( 119, "图文-患者已评价"),
        send1191( 1191, "图文(消息)-患者已评价"),
        send1192( 1192, "图文（团队消息）-患者已评价"),
        send120( 120, "图文-待评价"),
        send121( 121, "图文-待抢答定时提醒"),
        send122( 122, "图文-后台权限开通"),
        send1221( 1221, "电话-后台权限开通"),
        send123( 123, "图文-处方审核不通过"),
        send124( 124, "图文-重新指派"),
        send125( 125, "医生发送处方"),
        send126( 126, "电话-患者预约成功"),
        send127( 127, "电话-医生点击拨号按钮"),
        send128( 128, "电话-医生未回复，系统退款"),
        send129( 129, "电话-退款同意"),
        send130( 130, "电话-退款拒绝"),
        send131( 131, "电话-预约时间当天早上8点"),
        send132( 132, "电话-后台人工提醒"),


        send164( 164, "入驻-机构申请（管理员）"),
        send165( 165, "入驻-医生申请（管理员）"),
        send150( 150, "入驻-医生入驻审核通过"),
        send151( 151, "入驻-医生入驻审核不通过"),
        send152( 152, "入驻-机构入驻审核通过"),
        send153( 153, "入驻-机构入驻审核不通过"),
        send154( 154, "反馈-患者提交反馈"),
        send155( 155, "反馈-管理员处理反馈"),
        send156( 156, "视频-医生重新叫号"),

        send157( 157, "管理员将医生加入一个团队"),
        send158( 158, "管理员为医生创建一个团队"),
        send159( 159, "管理员将专家团队解散"),
        send160( 160, "管理员更换团队带头专家"),
        send161( 161, "管理员指派订单"),
        send162( 162, "抢答订单成功"),

        send163( 163, "医生提交擅长修改信息-管理员"),
        send166( 166, "处方提交没有排班药师-管理员"),
        send167( 167, "管理员给药师排班"),
        send169( 169, "图文申述（管理员）"),
        send170( 170, "超过10分钟未审核（管理员-药师）"),


        send201( 201, "护理-支付提醒"),
        send202( 202, "护理-支付成功"),
        send2011( 2011, "护理-支付超时"),
        send203( 203, "护理-管理员分配"),
        send204( 204, "护理-护士确认"),
        send2043( 2043, "护理-护士拒绝"),
        send205( 205, "护理-护士出发"),
        send206( 206, "护理-护士到达"),
        send207( 207, "护理-护士完成"),
        send2073( 2073, "护理-护士完成加价订单"),
        send208( 208, "护理-已取消（退钱）"),
        send2081( 2081, "护理-已取消（不退钱）"),
        send2082( 2082, "护理-已取消（患者申请）"),
        send2083( 2083, "护理-终止（护士申请）"),
        send209( 209, "护理-已失效"),
        send2091( 2091, "护理-已失效（管理员）"),
        send2092( 2092, "护理-未在服务时间出发（护士）"),
        send2093( 2093, "护理-服务时间前3.5小时提醒（护士）"),
        send2094( 2094, "护理-服务时间前半小时提醒（护士）"),
        send210( 210, "护理-管理员重新分配"),
        send211( 211, "护理-护士反院"),
        send212( 212, "护理-110"),
        send213( 213, "护理-120"),
        send214( 214, "护理-管理员给护士排班"),
        send215(215, "护理-取消排班管理员通过"),
        send216(216, "护理-取消排班管理员不通过"),
        send217(217, "护理-护士申请取消排班"),
        send218(218, "护理-回访每天9点"),

        send230(230,"检查检验支付成功")

        ;
        /**
         * 短信触发条件id
         */
        @Getter
        public Integer sendId;

        /**
         * 短信触发条件说明
         */
        @Getter
        public String sendExplain;

        SendMessage(Integer sendId, String sendExplain){
            this.sendId = sendId;
            this.sendExplain = sendExplain;
        }

        public static SendMessage getSendMessage(Integer sendId) {
            SendMessage[] values = values();
            return Arrays.stream(values).filter(e -> e.sendId.equals(sendId)).findFirst().orElse(null);
        }

    }

    public enum MessageType{

        type1( 1, 1, "视频-就诊申请成功-发送患者"),
        type2( 1, 2, "视频-就诊申请成功-发送医生"),
        type72( 1, 72, "视频-就诊申请成功-发送医生（推送）"),
        type73( 1, 73, "视频-就诊申请成功-发送患者（推送）"),
        type3( 1, 3, "视频-就诊申请成功-发送管理员"),

        type4( 2, 4, "视频-停诊-发送患者"),
        type74( 2, 74, "视频-停诊-发送患者(推送)"),
        type5( 3, 5, "视频-医生叫号-发送患者"),
        type75( 3, 75, "视频-医生叫号-发送患者(推送)"),
        type6( 4, 6, "视频-取消并退款-发送管理员"),
        type53(5, 53, "视频-线上就诊-已过号"),
        type76(5, 76, "视频-线上就诊-已过号（推送）"),
        type54(6, 54, "视频-病历书写-完成诊断未开具处方"),
        type77(6, 77, "视频-病历书写-完成诊断未开具处方(推送)"),
        type771(6, 591, "服务评价"),
        type5501(170, 5501, "医处方待审核（管理员）"),
        type5502(170, 56, "视频-医处方待审核-发送药师"),
        type55(7, 55, "视频-医处方待审核-发送管理员"),
        type56(7, 56, "视频-医处方待审核-发送药师"),
        type57(8, 57, "视频-医处方未通过-发送医生"),
        type71(8, 71, "视频-医处方未通过-发送医生（推送）"),
        type58(8, 58, "视频-医处方未通过-发送管理员"),
        type59(9, 59, "视频-医处方已通过-发送患者"),
        type60(9, 60, "视频-医处方已通过-发送管理员"),
        type78(9, 78, "视频-医处方已通过-发送患者（推送）"),
        type781(9, 591, "服务评价"),
        type61(10, 61, "视频-管理员同意退款-发送患者"),
        type79(10, 79, "视频-管理员同意退款-发送患者(推送)"),
        type62(10, 62, "视频-管理员同意退款-发送医生"),
        type621(1001, 62, "视频-管理员同意退款-发送医生"),
        type70(10, 70, "视频-管理员同意退款-发送医生(推送)"),
        type63(11, 63, "视频-管理员拒绝退款-发送患者"),
        type99(11, 80, "视频-管理员拒绝退款-发送患者"),


        type7(12, 7, "视频-管理员给医生排班-发送医生"),
        type8(13, 8, "视频-管理员给医生停诊-发送医生"),
        type9(14, 9, "视频-管理员给医生排班调整-发送医生"),
        type112(24, 102, "视频-每天提醒有排班的医生"),
        type119(25, 119, "视频-管理员给医生排班(当天)"),
        type120(26, 120, "管理员给医生取消停诊"),

        type10(15, 10, "视频-自由排班权限申请提交-发送医生"),
        type11(16, 11, "视频-自由排班权限申请未通过-发送医生"),
        type12(17, 12, "视频-自由排班权限申请通过-发送医生"),

        type13(18, 13, "视频-自由排班申请提交-发送医生"),
        type14(19, 14, "视频-自由排班申请未通过-发送医生"),
        type15(20, 15, "视频-自由排班申请通过-发送医生"),
        type121(27, 121, "视频-自由排班申请通过-发送医生(修改价格)"),
        type122(28, 122, "自由排班取消停诊"),

        type16(21, 16, "视频-自由排班停诊申请提交-发送医生"),
        type17(22, 17, "视频-自由排班停诊申请未通过-发送医生"),
        type18(23, 18, "视频-自由排班停诊申请通过-发送医生"),

        type2001(168, 2001, "视频-15分钟未叫号发短信（医生）"),

        //        type81(101, 81, "支付成功（图文）"),
        type19(102, 19, "医生首次回复患者（图文）"),
        type82(102, 82, "医生首次回复患者（图文）"),
        type20(1021, 20, "医生首次回复患者（团队）"),
        type83(1021, 82, "医生首次回复患者（图文）"),
        type21(103, 21, "后台提醒患者（图文）"),
        type22(1031, 22, "后台提醒患者（团队）"),
        type24(104, 24, "后台同意退款"),
        type92(104, 79, "后台同意退款"),
        type241(104, 241, "后台同意退款"),
        type240(1041, 24, "后台同意退款"),
        type921(1041, 79, "后台同意退款"),
        type2411(1041, 2411, "后台同意退款"),
        type25(105, 25, "后台拒绝退款"),
        type93(105, 80, "后台拒绝退款"),
        type193(105, 250, "后台拒绝退款"),
        type251(1051, 25, "后台拒绝退款"),
        type931(1051, 80, "后台拒绝退款"),
        type1931(1051, 251, "后台拒绝退款"),
        type26(106, 26, "关闭咨询（图文）"),
        type86(106, 83, "关闭咨询（图文）"),
        type27(1061, 27, "关闭咨询（团队）"),
        type87(1061, 84, "关闭咨询（团队）"),
        type28(107, 28, "实时聊天（患者）"),
        type281(1072, 281, "实时聊天（患者）"),
        type282(1073, 282, "实时聊天（患者）"),
        type64(1071, 64, "实时聊天（医生）"),
        type283(1074, 283, "实时聊天（医生）"),
        type284(1075, 284, "实时聊天（医生）"),
        type285(1076, 285, "实时聊天（医生）(只发消息)"),
        type286(1077, 286, "实时聊天（医生）(只发消息)"),
        type29(108, 29, "最后6小时提示（图文）"),
        type30(1081, 30, "最后6小时提示（团队）"),
        type31(109, 31, "绑定手机号提示"),
        type32(110, 32, "医生只开诊断，未开处方"),
        type33(111, 33, "医生开具处方，药师审核通过"),
        type84(110, 77, "医生只开诊断，未开处方"),
        type85(111, 78, "医生开具处方，药师审核通过"),
        type34(113, 34, "系统发起退款"),
        type341(1131, 341, "系统发起退款（消息）"),
        type3411(11311, 3411, "系统发起退款（消息）"),
        type35(114, 35, "图文-患者发起咨询"),
        type88(114, 81, "图文-患者发起咨询"),
        type36(1141, 36, "团队-患者发起咨询"),
        type89(1141, 81, "团队-患者发起咨询"),
        type37(115, 37, "图文-后台提醒医生"),
        type38(1151, 38, "团队-后台提醒医生"),
        type39(116, 39, "后台价格删除提示"),
        type391(1161, 391, "后台价格删除提示"),
        type40(117, 40, "后台擅长审核通过"),
        type41(118, 41, "后台擅长审核被拒绝"),
        type42(123, 42, "处方审核不通过"),
        type69(123, 69, "处方审核不通过 推送"),
        type43(124, 43, "重新指派"),
        type44(125, 44, "医生发送处方"),
        type45(126, 45, "电话—患者预约成功（患者）"),
        type90(126, 81, "电话—患者预约成功（患者）"),
        type50(126, 50, "电话—患者预约成功（医生）"),
        type46(127, 46, "医生点击拨号按钮"),
        type47(128, 47, "电话—医生未回复，系统退款"),
        type48(131, 48, "预约时间当天早上8点提醒医生"),
        type49(132, 49, "后台人工提醒"),
        type51(129, 51, "电话-退款同意"),
        type101(129, 79, "电话-退款同意"),
        type1011(129, 241, "电话-退款同意"),
        type52(130, 52, "电话-退款拒绝"),
        type100(130, 80, "电话-退款拒绝"),
        type1001(130, 250, "电话-退款拒绝"),
        type65(119, 65, "患者已评价"),
        type651(1191, 651, "患者已评价"),
        type652(1192, 652, "患者已评价"),
        type66(120, 66, "待评价"),
        type67(121, 67, "待抢答定时提醒"),
        type68(122, 68, "后台权限开通"),
        type681(1221, 681, "后台权限开通"),


        type95(150, 95, "入驻-医生入驻审核通过"),
        type96(151, 96, "入驻-医生入驻审核不通过"),
        type97(152, 97, "入驻-机构入驻审核通过"),
        type98(153, 98, "入驻-机构入驻审核不通过"),
        type102(154, 99, "反馈-患者提交反馈"),
        type103(155, 100, "反馈-管理员处理反馈"),
        type111(156, 101, "视频-医生重新叫号"),

        type113(157, 113, "管理员将医生加入一个团队"),
        type114(158, 114, "管理员为医生创建一个团队"),
        type115(159, 115, "管理员将专家团队解散"),
        type116(160, 116, "管理员更换团队带头专家"),
        type117(161, 117, "管理员指派订单"),
        type118(162, 118, "抢答订单成功"),

        type400(163, 400, "医生提交擅长修改信息-给管理员发推送"),
        type970(164, 970, "入驻-机构入驻申请（管理员）"),
        type950(165, 950, "入驻-机构入驻申请（管理员）"),
        type550(166, 550, "处方提交没有排班药师-管理员"),
        type1190(167, 1190, "管理员给药师排班"),
        type600(169, 600, "图文申述（管理员）"),

        type201(201, 201, "支付提醒-患者"),
        type2011(2011, 2011, "支付提醒-患者"),
        type202(202, 202, "支付成功-患者"),
        type2021(202, 2021, "支付成功-管理员"),
        type203(203, 203, "护理-管理员分配-护士"),
        type204(204, 204, "护理-护士确认-护士"),
        type2041(204, 2041, "护理-护士确认-患者"),
        type2042(204, 2042, "护理-护士确认-管理员"),
        type2043(2043, 2043, "护理-护士拒绝"),
        type205(205, 205, "护理-护士出发-护士"),
        type2051(205, 2051, "护理-护士出发-管理员"),
        type206(206, 206, "护理-护士到达-护士"),
        type2061(206, 2061, "护理-护士到达-患者"),
        type2062(206, 2062, "护理-护士到达-管理员"),
        type207(207, 207, "护理-护士完成-护士"),
        type2071(207, 2071, "护理-护士完成-管理员"),
        type2072(207, 2072, "护理-护士完成-患者"),
        type2073(2073, 2073, "护理-护士完成-患者"),
        type208(208, 208, "护理-已取消（退钱）-患者"),
        type2081(2081, 2081, "护理-已取消（不退钱）-患者"),
        type2082(2082, 2082, "护理-申请取消-管理员"),
        type2083(2083, 2083, "护理-申请取消-管理员"),
        type209(209, 209, "护理-已失效（退钱）-患者"),
        type2091(2091, 2091, "护理-已失效（申请）-管理员"),
        type2092(2092, 2092, "护理-已失效（申请）-管理员"),
        type2093(2093, 2093, "护理-已失效（申请）-管理员"),
        type2094(2094, 2094, "护理-已失效（申请）-管理员"),
        type210(210, 210, "护理-管理员重新分配-护士"),
        type211(211, 211, "护理-护士反院"),
        type212(212, 212, "护理-110"),
        type213(213, 213, "护理-120"),
        type214(214, 214, "护理-管理员给护士排班"),
        type215(215, 215, "护理-取消排班管理员通过"),
        type216(216, 216, "护理-取消排班管理员不通过"),
        type217(217, 217, "护理-护士申请取消排班"),
        type218(218, 218, "护理-护士申请取消排班"),

        type230(230,230,"检查检验支付成功-患者")
        ;
        /**
         * 短信触发条件id
         */
        @Getter
        public Integer sendId;

        /**
         * 短信类型id
         */
        @Getter
        public Integer code;

        /**
         * 短信类型说明
         */
        @Getter
        public String message;

        MessageType(Integer sendId, Integer code, String message){
            this.sendId = sendId;
            this.code = code;
            this.message = message;
        }

        public static MessageType getMessageType(Integer sendId) {
            MessageType[] values = values();
            return Arrays.stream(values).filter(e -> e.sendId.equals(sendId)).findFirst().orElse(null);
        }

        public static List<MessageType> getMessageTypeList(Integer sendId){
            MessageType[] values = values();
            return Arrays.stream(values).filter(e -> e.sendId.equals(sendId)).collect(Collectors.toList());
        }
    }

    public enum MsgType{
        ;
        //文字短信
        public final static Integer  word_message = 1;
        //语音短信
        public final static Integer voice_message =  2;
        //排班信息
        public final static Integer schedule_information = 3;
        //推送消息
        public final static Integer push_msg = 4;
        //微信推送
        public final static Integer wx_push_msg = 5;

        public final static Integer mini_push_msg = 52;
    }

    public enum ContentEnum {
        ;
        //医生姓名
        public final static String DOCTOR_NAME =  "#doctorName#";
        //诊断医生名称
        public final static String DIAGNOSE_DOCTOR_NAME =  "#diagnoseDoctorName#";
        //患者姓名
        public final static String PATIENT_NAME =  "#patientName#";
        //患者姓名
        public final static String PATIENT_SEX =  "#patientSex#";
        //患者电话
        public final static String PATIENT_PHONE = "#patientPhone#";
        //医院
        public final static String HOSPITAL_NAME =  "#hospitalName#";
        //医联体
        public final static String UNION_NAME =  "#unionName#";
        //科室
        public final static String DEPARTMENT =  "#department#";
        //排班日期
        public final static String SCHEDULE_DATE =  "#scheduleDate#";
        //排班日期(9:00-10:00 13:00-18:00 )
        public final static String SCHEDULE_TIME_STR =  "#scheduleTimeStr#";
        //排班时间类别
        public final static String TIME_TYPE =  "#timeType#";
        //排班开始时间
        public final static String START_TIME =  "#startTime#";
        //排班结束时间
        public final static String END_TIME =  "#endTime#";
        //会诊编号
        public final static String CONSULT_NO =  "#consultNo#";
        //客服电话
        public final static String SERVICE_PHONE = "#servicePhone#";
        //拒绝退款理由
        public final static String REFUND_REASON =  "#refundReason#";
        //团队名称
        public final static String TEAM_NAME =  "#teamName#";
        //图文等待回复时间
        public final static String WAIT_TIME =  "#waitTime#";
        //图文结束时长
        public final static String CLOSE_TIME =  "#closeTime#";
        //电话预约时间
        public final static String ORDER_TIME =  "#orderTime#";
        //处方有效期时间
        public final static String RECIPE_TIME =  "#recipeTime#";
        //问诊间url
        public final static String INTERVIEW_ROOM_URL =  "#interviewRoomUrl#";
        //问诊间url
        public final static String LAST_MESSAGE =  "#lastMessage#";
        //排班价格
        public final static String SCHEDULE_PRICE =  "#schedulePrice#";

        public final static String PRICE =  "#price#";
        //排班数量(号源数量)
        public final static String SCHEDULE_NUMBER =  "#scheduleNumber#";
        //排班调整价格
        public final static String SCHEDULE_ADJUSTMENT_NUMBER =  "#scheduleAdjustmentNumber#";
        //当前排号
        public final static String CALL_NUM =  "#callNum#";
        //排队号码
        public final static String WAIT_NUM =  "#waitNum#";
        //处方时间
        public final static String DIAGNOSE_TIME =  "#diagnoseTime#";
        //问诊价格
        public final static String CONSULT_PRICE =  "#consultPrice#";
        //现在时间
        public final static String NOW_TIME =  "#nowTime#";
        //密码
        public final static String PASSWORD =  "#password#";
        //domain
        public final static String DOMAIN =  "#domain#";
        //原因
        public final static String REASON =  "#reason#";
        //管理员电话
        public final static String ADMIN_PHONE =  "#adminPhone#";
        //停诊审核原因
        public final static String STOP_STATUS_REASON = "#stopStatusReason#";

        public final static String CONSULT_ID = "#consultId#";

        public final static String PROJECT_DETAIL_ID = "#projectDetailId#";

        public final static String SCHEDULE_ID = "#scheduleId#";

        public final static String CONSULT_TYPE = "#consultIdType#";
        //项目名称
        public final static String PROJECT_NAME = "#projectName#";
        //套餐名称
        public final static String MENU_NAME = "#menuName#";

        public final static String NURSE_ORDER_TIME = "#nurseOrderTime#";

        public final static String NURSE_ADDRESS = "#nurseAddress#";

        public final static String NURSE_REFUND_REASOM = "#nurseRefundReason#";

        public final static String REFUND_REASOM = "#refundReasons#";

        public final static String VISIT_NUM = "#visitNum#";


    }
}
