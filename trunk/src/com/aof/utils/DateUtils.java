package com.aof.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    /**
     * ��������Date����ת�����������ò�ѯ��ʼʱ���Date���󣬲�����Date�����ʱ�䲿�ֽ�����Ϊ00:00:00��
     * @return Date����
     */
    public static Date getStartDate(Date date) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }
    
    /**
     * ��������Date����ת�����������ò�ѯ����ʱ���Date���󣬲�����Date�����ʱ�䲿�ֽ�����Ϊ23:59:59��
     * @return Date����
     */
    public static Date getExpireDate(Date date) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }
    
    public static int getDateDiff(Date startDate, Date endDate) {
        Date targetStartDate = getStartDate(startDate);
        Date targetEndDate = getStartDate(endDate);
        long oneDateMill = 24 * 60 * 60 * 1000;
        return (int)((targetEndDate.getTime() - targetStartDate.getTime()) / oneDateMill);        
    }
    
    public static Date dateAdd(Date targDate, int field, int amount) {
       Calendar calendar=Calendar.getInstance();
       calendar.setTime(targDate);
       calendar.add(field, amount);
       return calendar.getTime();
    }
}
