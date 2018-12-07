package com.lafaya.toolbox;

import android.app.Activity;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;

public class MonitorLafayahardware {

    private Activity activity;
    //==================revolving door monitor ===========
    private TextView text_info_sensor1,text_info_sensor2,text_info_sensor3,text_info_sensor4,text_info_sensor5,text_info_sensor6;
    private TextView text_info_sensor7,text_info_sensor8,text_info_sensor9,text_info_sensor10,text_info_sensor11,text_info_sensor12;
    private TextView text_info_sensor13,text_info_sensor14,text_info_sensor15,text_info_sensor16,text_info_sensor17,text_info_sensor18;
    private TextView text_info_sensor19,text_info_sensor20;


    //===================lafaya controler monitor===========
    //硬件型号
    private TextView text_info_la_hardwaretype;
    // 外设状态：开门开关，紧急开关，内传感器，外传感器，安全传感器，内安全光幕，外安全光幕，备用输入，使能状态，锁状态-开，开锁指令，关锁指令。
    private TextView text_info_la_sensor1, text_info_la_sensor2, text_info_la_sensor3, text_info_la_sensor4, text_info_la_sensor5, text_info_la_sensor6, text_info_la_sensor7, text_info_la_sensor8;
    private TextView text_info_la_enable, text_info_la_lock1, text_info_la_lock2, text_info_la_lock3;

    // 遥控接口状态: 常闭-K1，常开-K2, 自动-K3, 单向-K4
    private TextView text_info_la_remote1, text_info_la_remote2, text_info_la_remote3, text_info_la_remote4;

    // 电机驱动状态：电机转速，电机电流，驱动温度，电机方向，电机类型，编码方向，驱动过载，驱动故障，驱动使能。
    private TextView text_info_la_motorspeed, text_info_la_motorcurrent, text_info_la_drivetemp, text_info_la_motordir, text_info_la_motortype;
    private TextView text_info_la_encodedir, text_info_la_overload, text_info_la_driveerror, text_info_la_driveenable;

    // 拨码开关状态：dip1 ~ 10
    private TextView text_info_la_dip1,text_info_la_dip2,text_info_la_dip3,text_info_la_dip4,text_info_la_dip5,text_info_la_dip6,text_info_la_dip7,text_info_la_dip8,text_info_la_dip9,text_info_la_dip10;
    // 数码管状态：a,b,c,d,e,f,g,dp
    private TextView text_info_la_LEDA,text_info_la_LEDB,text_info_la_LEDC,text_info_la_LEDD,text_info_la_LEDE,text_info_la_LEDF,text_info_la_LEDG,text_info_la_LEDDP;
    // 其它状态：开门状态，故障状态，电源欠压，备用电源，复位按键 ，蜂鸣器，联动状态
    private TextView text_info_la_dooropen, text_info_la_doorerror, text_info_la_powerlow, text_info_la_standby, text_info_la_resetkey, text_info_la_bee, text_info_la_canlink;


    public char[] lafayasensor_status = new char[]{0x00,0x00, 0x00,0x00, 0x00,0x00, 0x00,0x00, 0x00,0x00, 0x00,0x00, 0x00,0x00, 0x00,0x00,0x00,0x00,0x00};

    public void initializeTextView(Activity inactivity){

        activity = inactivity;
        //
        text_info_sensor1 = (TextView)activity.findViewById(R.id.text_info_sensor1);
        text_info_sensor2 = (TextView)activity.findViewById(R.id.text_info_sensor2);
        text_info_sensor3 = (TextView)activity.findViewById(R.id.text_info_sensor3);
        text_info_sensor4 = (TextView)activity.findViewById(R.id.text_info_sensor4);
        text_info_sensor5 = (TextView)activity.findViewById(R.id.text_info_sensor5);
        text_info_sensor6 = (TextView)activity.findViewById(R.id.text_info_sensor6);
        text_info_sensor7 = (TextView)activity.findViewById(R.id.text_info_sensor7);
        text_info_sensor8 = (TextView)activity.findViewById(R.id.text_info_sensor8);
        text_info_sensor9 = (TextView)activity.findViewById(R.id.text_info_sensor9);
        text_info_sensor10 = (TextView)activity.findViewById(R.id.text_info_sensor10);
        text_info_sensor11 = (TextView)activity.findViewById(R.id.text_info_sensor11);
        text_info_sensor12 = (TextView)activity.findViewById(R.id.text_info_sensor12);
        text_info_sensor13 = (TextView)activity.findViewById(R.id.text_info_sensor13);
        text_info_sensor14 = (TextView)activity.findViewById(R.id.text_info_sensor14);
        text_info_sensor15 = (TextView)activity.findViewById(R.id.text_info_sensor15);
        text_info_sensor16 = (TextView)activity.findViewById(R.id.text_info_sensor16);
        text_info_sensor17 = (TextView)activity.findViewById(R.id.text_info_sensor17);
        text_info_sensor18 = (TextView)activity.findViewById(R.id.text_info_sensor18);
        text_info_sensor19 = (TextView)activity.findViewById(R.id.text_info_sensor19);
        text_info_sensor20 = (TextView)activity.findViewById(R.id.text_info_sensor20);

        //
        //硬件型号
        text_info_la_hardwaretype = (TextView) activity.findViewById(R.id.text_info_la_hardwaretype);
        // 外设状态：开门开关，紧急开关，内传感器，外传感器，安全传感器，内安全光幕，外安全光幕，备用输入，使能状态，锁状态-开，开锁指令，关锁指令。
        text_info_la_sensor1 = (TextView)activity.findViewById(R.id.text_info_la_sensor1);
        text_info_la_sensor2 = (TextView)activity.findViewById(R.id.text_info_la_sensor2);
        text_info_la_sensor3 = (TextView)activity.findViewById(R.id.text_info_la_sensor3);
        text_info_la_sensor4 = (TextView)activity.findViewById(R.id.text_info_la_sensor4);
        text_info_la_sensor5 = (TextView)activity.findViewById(R.id.text_info_la_sensor5);
        text_info_la_sensor6 = (TextView)activity.findViewById(R.id.text_info_la_sensor6);
        text_info_la_sensor7 = (TextView)activity.findViewById(R.id.text_info_la_sensor7);
        text_info_la_sensor8 = (TextView)activity.findViewById(R.id.text_info_la_sensor8);

        text_info_la_enable = (TextView)activity.findViewById(R.id.text_info_la_enable);
        text_info_la_lock1 = (TextView)activity.findViewById(R.id.text_info_la_lock1);
        text_info_la_lock2 = (TextView)activity.findViewById(R.id.text_info_la_lock2);
        text_info_la_lock3 = (TextView)activity.findViewById(R.id.text_info_la_lock3);

        // 遥控接口状态: 常闭-K1，常开-K2, 自动-K3, 单向-K4
        text_info_la_remote1 = (TextView)activity.findViewById(R.id.text_info_la_remote1);
        text_info_la_remote2 = (TextView)activity.findViewById(R.id.text_info_la_remote2);
        text_info_la_remote3 = (TextView)activity.findViewById(R.id.text_info_la_remote3);
        text_info_la_remote4 = (TextView)activity.findViewById(R.id.text_info_la_remote4);

        // 电机驱动状态：电机转速，电机电流，驱动温度，电机方向，电机类型，编码方向，驱动过载，驱动故障，驱动使能。
        text_info_la_motorspeed = (TextView)activity.findViewById(R.id.text_info_la_motorspeed);
        text_info_la_motorcurrent = (TextView)activity.findViewById(R.id.text_info_la_motorcurrent);
        text_info_la_drivetemp = (TextView)activity.findViewById(R.id.text_info_la_drivetemp);
        text_info_la_motordir = (TextView)activity.findViewById(R.id.text_info_la_motordir);
        text_info_la_motortype = (TextView)activity.findViewById(R.id.text_info_la_motortype);
        text_info_la_encodedir = (TextView)activity.findViewById(R.id.text_info_la_encodedir);
        text_info_la_overload = (TextView)activity.findViewById(R.id.text_info_la_overload);
        text_info_la_driveerror = (TextView)activity.findViewById(R.id.text_info_la_driveerror);
        text_info_la_driveenable = (TextView)activity.findViewById(R.id.text_info_la_driveenable);

        // 拨码开关状态：dip1 ~ 10
        text_info_la_dip1 = (TextView)activity.findViewById(R.id.text_info_la_dip1);
        text_info_la_dip2 = (TextView)activity.findViewById(R.id.text_info_la_dip2);
        text_info_la_dip3 = (TextView)activity.findViewById(R.id.text_info_la_dip3);
        text_info_la_dip4 = (TextView)activity.findViewById(R.id.text_info_la_dip4);
        text_info_la_dip5 = (TextView)activity.findViewById(R.id.text_info_la_dip5);
        text_info_la_dip6 = (TextView)activity.findViewById(R.id.text_info_la_dip6);
        text_info_la_dip7 = (TextView)activity.findViewById(R.id.text_info_la_dip7);
        text_info_la_dip8 = (TextView)activity.findViewById(R.id.text_info_la_dip8);
        text_info_la_dip9 = (TextView)activity.findViewById(R.id.text_info_la_dip9);
        text_info_la_dip10 = (TextView)activity.findViewById(R.id.text_info_la_dip10);

        // 数码管状态：a,b,c,d,e,f,g,dp
        text_info_la_LEDA = (TextView)activity.findViewById(R.id.text_info_la_LEDA);
        text_info_la_LEDB = (TextView)activity.findViewById(R.id.text_info_la_LEDB);
        text_info_la_LEDC = (TextView)activity.findViewById(R.id.text_info_la_LEDC);
        text_info_la_LEDD = (TextView)activity.findViewById(R.id.text_info_la_LEDD);
        text_info_la_LEDE = (TextView)activity.findViewById(R.id.text_info_la_LEDE);
        text_info_la_LEDF = (TextView)activity.findViewById(R.id.text_info_la_LEDF);
        text_info_la_LEDG = (TextView)activity.findViewById(R.id.text_info_la_LEDG);
        text_info_la_LEDDP = (TextView)activity.findViewById(R.id.text_info_la_LEDDP);

        // 其它状态：开门状态，故障状态，电源欠压，备用电源，复位按键 ，蜂鸣器，联动状态
        text_info_la_dooropen = (TextView)activity.findViewById(R.id.text_info_la_dooropen);
        text_info_la_doorerror = (TextView)activity.findViewById(R.id.text_info_la_doorerror);
        text_info_la_powerlow = (TextView)activity.findViewById(R.id.text_info_la_powerlow);
        text_info_la_standby = (TextView)activity.findViewById(R.id.text_info_la_standby);
        text_info_la_resetkey = (TextView)activity.findViewById(R.id.text_info_la_resetkey);
        text_info_la_bee = (TextView)activity.findViewById(R.id.text_info_la_bee);
        text_info_la_canlink = (TextView)activity.findViewById(R.id.text_info_la_canlink);


        sensormobileShwoUpdate("000000000000");
        sensorfixedShwoUpdate("00000000");

        //lafaya sensor
        lafayaShowUpdate(lafayasensor_status);
    }


    //传感器状态显示，每隔2秒就查询一次
    public void sensorfixedShwoUpdate(String textstring){
        if(textstring.substring(textstring.length()-1,textstring.length()).equals("0")){
            text_info_sensor10.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor10.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor10.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor10.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-2,textstring.length()-1).equals("0")){
            text_info_sensor9.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor9.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor9.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor9.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-3,textstring.length()-2).equals("0")){
            text_info_sensor8.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor8.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor8.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor8.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-4,textstring.length()-3).equals("0")){
            text_info_sensor7.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor7.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor7.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor7.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-5,textstring.length()-4).equals("0")){
            text_info_sensor6.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor6.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor6.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor6.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-6,textstring.length()-5).equals("0")){
            text_info_sensor5.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor5.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor5.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor5.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-7,textstring.length()-6).equals("0")){
            text_info_sensor4.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor4.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor4.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor4.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-8,textstring.length()-7).equals("0")){
            text_info_sensor3.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor3.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor3.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor3.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }
    public void sensormobileShwoUpdate(String textstring){
        if(textstring.substring(textstring.length()-1,textstring.length()).equals("0")){
            text_info_sensor20.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor20.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor20.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor20.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-2,textstring.length()-1).equals("0")){
            text_info_sensor19.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor19.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor19.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor19.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-3,textstring.length()-2).equals("0")){
            text_info_sensor18.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor18.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor18.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor18.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-4,textstring.length()-3).equals("0")){
            text_info_sensor17.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor17.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor17.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor17.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-5,textstring.length()-4).equals("0")){
            text_info_sensor2.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor2.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor2.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor2.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-6,textstring.length()-5).equals("0")){
            text_info_sensor1.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor1.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-7,textstring.length()-6).equals("0")){
            text_info_sensor16.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor16.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor16.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor16.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if(textstring.substring(textstring.length()-8,textstring.length()-7).equals("0")){
            text_info_sensor15.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor15.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor15.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor15.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-9,textstring.length()-8).equals("0")){
            text_info_sensor14.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor14.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor14.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor14.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-10,textstring.length()-9).equals("0")){
            text_info_sensor13.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor13.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor13.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor13.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-11,textstring.length()-10).equals("0")){
            text_info_sensor12.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor12.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor12.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor12.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
        if(textstring.substring(textstring.length()-12,textstring.length()-11).equals("0")){
            text_info_sensor11.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_sensor11.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_sensor11.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_sensor11.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }

    public void lafayaShowUpdate(char[] msgValue){


        //char[] tempValue = new char[]{0x02,0xFF, 0x03,0xFF, 0xFF,0xC7, 0x15,0x48, 0x29,0x00, 0x1A,0x00, 0x00,0x00, 0x00,0x00,0x60,0x0F,0x00};

        //msgValue = tempValue;

        //硬件型号
        if(msgValue[0] == (char)0x01){
            text_info_la_hardwaretype.setText("LACS-03");
        }else if(msgValue[0] == (char)0x02){
            text_info_la_hardwaretype.setText("HDC00");
        }
        //更新外设状态
        updateSensorport(msgValue);

        // 遥控接口状态
        updateRemoteport(msgValue[2]);
        // 电机驱动状态
        updateMotorpara( msgValue);

        // 拨码开关状态：dip1 ~ 10
        updateDIP(msgValue);

        // 数码管状态：a,b,c,d,e,f,g,dp
        updateLED(msgValue[5]);

        // 其它状态：开门状态，故障状态，电源欠压，备用电源，复位按键 ，蜂鸣器，联动状态

        updatOther(msgValue);

    }

    private void updateSensorport(char[] msgValue){
        // 外设状态：开门开关，紧急开关，内传感器，外传感器，安全传感器，内安全光幕，外安全光幕，备用输入
        if((msgValue[4] & 0x08) == 0x08){
            text_info_la_sensor1.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor1.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x04) == 0x04){
            text_info_la_sensor2.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor2.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor2.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor2.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x01) == 0x01){
            text_info_la_sensor3.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor3.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor3.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor3.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x02) == 0x02){
            text_info_la_sensor4.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor4.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor4.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor4.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x10) == 0x10){
            text_info_la_sensor5.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor5.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor5.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor5.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x40) == 0x40){
            text_info_la_sensor6.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor6.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor6.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor6.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x80) == 0x80){
            text_info_la_sensor7.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor7.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor7.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor7.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[4] & 0x20) == 0x20){
            text_info_la_sensor8.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_sensor8.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_sensor8.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_sensor8.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        //使能状态，锁状态-开，开锁指令，关锁指令。

        if((msgValue[6] & 0x40) == 0x40){
            text_info_la_enable.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_enable.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_enable.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_enable.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[6] & 0x04) == 0x04){
            text_info_la_lock1.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_lock1.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_lock1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_lock1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[6] & 0x01) == 0x01){
            text_info_la_lock2.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_lock2.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_lock2.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_lock2.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[6] & 0x02) == 0x02){
            text_info_la_lock3.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_lock3.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_lock3.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_lock3.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }

    private void updateRemoteport(char msgValue){
        // 遥控接口状态: 常闭-K1，常开-K2, 自动-K3, 单向-K4
        if((msgValue & 0x80) == 0x80){
            text_info_la_remote1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_remote1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }else {
            text_info_la_remote1.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_remote1.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }

        if((msgValue & 0x40) == 0x40){
            text_info_la_remote1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_remote1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }else {
            text_info_la_remote2.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_remote2.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }

        if((msgValue & 0x20) == 0x20){
            text_info_la_remote3.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_remote3.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }else {
            text_info_la_remote3.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_remote3.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }

        if((msgValue & 0x10) == 0x10){
            text_info_la_remote4.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_remote4.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }else {
            text_info_la_remote4.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_remote4.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }
    }

    private void updateMotorpara(char[]msgValue){
        // 电机驱动状态：电机转速，电机电流，驱动温度，电机方向，电机类型，编码方向，驱动过载，驱动故障，驱动使能。

        int tempValue = 0;

        tempValue = ((int)msgValue[11] << 8) + msgValue[12];
        text_info_la_motorspeed.setText(Integer.toString(tempValue));

        tempValue = ((int)msgValue[9] << 8) + msgValue[10];
        text_info_la_motorcurrent.setText(Integer.toString(tempValue));

        tempValue = (int)msgValue[8];
        text_info_la_drivetemp.setText(Integer.toString(tempValue));

        if((msgValue[7] & 0x08) == 0x08){
            text_info_la_motordir.setText("电机方向-反");
        }else {
            text_info_la_motordir.setText("电机方向-正");
        }

        if((msgValue[7] & 0x01) == 0x01){
            text_info_la_motortype.setText("电机类型-无刷");
        }else {
            text_info_la_motortype.setText("电机类型-有刷");
        }

        if((msgValue[7] & 0x40) == 0x40){
            text_info_la_encodedir.setText("编码方向-反");
        }else {
            text_info_la_encodedir.setText("编码方向-正");
        }

        if((msgValue[7] & 0x10) != 0x10){
            text_info_la_overload.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_overload.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_overload.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_overload.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[16] & 0x20) != 0x20){
            text_info_la_driveerror.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_driveerror.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_driveerror.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_driveerror.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[16] & 0x40) != 0x40){
            text_info_la_driveenable.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_driveenable.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_driveenable.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_driveenable.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }


    }

    private void updateDIP(char[] msgValue){
        //码开关状态：dip1 ~ 10

        if((msgValue[3] & 0x01) == 0x01){
            text_info_la_dip1.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip1.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip1.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip1.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x02) == 0x02){
            text_info_la_dip2.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip2.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip2.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip2.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x04) == 0x04){
            text_info_la_dip3.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip3.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip3.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip3.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x08) == 0x08){
            text_info_la_dip4.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip4.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip4.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip4.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x10) == 0x10){
            text_info_la_dip5.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip5.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip5.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip5.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x20) == 0x20){
            text_info_la_dip6.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip6.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip6.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip6.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x40) == 0x40){
            text_info_la_dip7.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip7.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip7.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip7.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[3] & 0x80) == 0x80){
            text_info_la_dip8.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip8.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip8.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip8.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[2] & 0x01) == 0x01){
            text_info_la_dip9.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip9.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip9.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip9.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[2] & 0x02) == 0x02){
            text_info_la_dip10.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dip10.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dip10.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dip10.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }

    private void updateLED(char msgValue){
        // 数码管状态：a,b,c,d,e,f,g,dp
        if((msgValue & 0x01) != 0x01){
            text_info_la_LEDA.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDA.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDA.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDA.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x02) != 0x02){
            text_info_la_LEDB.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDB.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDB.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDB.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x04) != 0x04){
            text_info_la_LEDC.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDC.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDC.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDC.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x08) != 0x08){
            text_info_la_LEDD.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDD.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDD.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDD.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x10) != 0x10){
            text_info_la_LEDE.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDE.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDE.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDE.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x20) != 0x20){
            text_info_la_LEDF.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDF.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDF.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDF.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x40) != 0x40){
            text_info_la_LEDG.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDG.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDG.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDG.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue & 0x80) != 0x80){
            text_info_la_LEDDP.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_LEDDP.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_LEDDP.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_LEDDP.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }

    private void updatOther(char[] msgValue){
        // 其它状态：开门状态，故障状态，电源欠压，备用电源，复位按键 ，蜂鸣器，联动状态
        if((msgValue[2] & 0x10) == 0x10){
            text_info_la_dooropen.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_dooropen.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_dooropen.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_dooropen.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        //故障状态。。。未定义
        //if((msgValue[2] & 0x04) == 0x04){
            text_info_la_doorerror.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_doorerror.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        //}else {
        //    text_info_la_doorerror.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
        //    text_info_la_doorerror.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        //}

        if((msgValue[6] & 0x20) != 0x20){
            text_info_la_powerlow.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_powerlow.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_powerlow.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_powerlow.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }


        if((msgValue[2] & 0x40) != 0x40){
            text_info_la_standby.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_standby.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_standby.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_standby.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[6] & 0x10) == 0x10){
            text_info_la_resetkey.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_resetkey.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_resetkey.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_resetkey.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }


        if((msgValue[2] & 0x20) != 0x20){
            text_info_la_bee.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_bee.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_bee.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_bee.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }

        if((msgValue[2] & 0x80) != 0x80){
            text_info_la_canlink.setTextColor(activity.getResources().getColor(R.color.colorString));
            text_info_la_canlink.setBackgroundColor(activity.getResources().getColor(R.color.colorSensor));
        }else {
            text_info_la_canlink.setTextColor(activity.getResources().getColor(R.color.colorStringWhite));
            text_info_la_canlink.setBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
        }


    }


}
