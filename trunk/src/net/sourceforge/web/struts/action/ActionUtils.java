/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.web.struts.action;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import com.shcnc.struts.form.DateFormatter;

/**
 * ΪAction�ṩ���õķ���
 * @author nicebean
 * @version 1.0 (2005-11-15)
 */
public class ActionUtils extends com.shcnc.struts.action.ActionUtils {
    private static DateFormatter dfDisplayDate = new DateFormatter(
            java.util.Date.class, "yyyy/MM/dd");

    private static DateFormatter df8CharsDate = new DateFormatter(
            java.util.Date.class, "yyyyMMdd");

    /**
     * ȡ��yyyyMMdd��ʽ��ϵͳ����
     * @return yyyyMMdd��ʽ�������ַ���
     */
    public static String getTodayAs8Chars() {
        return get8CharsFromDate(new Date());
    }

    /**
     * ȡ��yyyy/MM/dd��ʽ��ϵͳ����
     * @return yyyy/MM/dd��ʽ�������ַ���
     */
    public static String getTodayAsDisplayDate() {
        return getDisplayDateFromDate(new Date());
    }
    
    /**
     * ��yyyyMMdd��ʽ�������ַ���ת��Ϊyyyy/MM/dd��ʽ
     * @return yyyy/MM/dd��ʽ�������ַ���
     */
    public static String getDisplayDateFrom8Chars(String date) {
        return date.substring(0, 4) + "/" + date.substring(4, 6) + "/"
                + date.substring(6, 8);
    }

    /**
     * ��yyyy/MM/dd��ʽ�������ַ���ת��ΪyyyyMMdd��ʽ
     * @return yyyyMMdd��ʽ�������ַ���
     */
    public static String get8CharsFromDisplayDate(String date) {
        return date.substring(0, 4) + date.substring(5, 7)
                + date.substring(8, 10);
    }

    /**
     * ��Date������������ת��ΪyyyyMMdd��ʽ���ַ���
     * @return yyyyMMdd��ʽ�������ַ���
     */
    public static String get8CharsFromDate(Date date) {
        return df8CharsDate.format(date);
    }

    /**
     * ��yyyyMMdd��ʽ�������ַ���ת��Date����
     * @return Date����
     */
    public static Date getDateFrom8Chars(String s) {
        if (s.length() != 8) {
            throw new RuntimeException("date error");
        }
        return (Date) df8CharsDate.unformat(s);
    }

    /**
     * ��yyyy/MM/dd��ʽ�������ַ���ת��Date����
     * @return Date����
     */
    public static java.util.Date getDateFromDisplayDate(String s) {
        if (s.length() != 10) {
            throw new RuntimeException("date error");
        }
        return (Date) dfDisplayDate.unformat(s);
    }

    /**
     * ��Date������������ת��Ϊyyyy/MM/dd��ʽ���ַ���
     * @return yyyy/MM/dd��ʽ�������ַ���
     */
    public static String getDisplayDateFromDate(Date date) {
        return dfDisplayDate.format(date);
    }

    /**
     * ��yyyy/MM/dd��ʽ�������ַ���ת�����������ò�ѯ��ʼʱ���Date���󣬲�����Date�����ʱ�䲿�ֽ�����Ϊ00:00:00��
     * @return Date����
     */
    public static Date getQueryBeginDateFromDisplayDate(String s) {
    	Date date=getDateFromDisplayDate(s);
    	Calendar calendar=Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.set(Calendar.HOUR_OF_DAY,0);
    	calendar.set(Calendar.MINUTE,0);
    	calendar.set(Calendar.SECOND,0);
    	return calendar.getTime();
    }
    
    /**
     * ��yyyy/MM/dd��ʽ�������ַ���ת�����������ò�ѯ����ʱ���Date���󣬲�����Date�����ʱ�䲿�ֽ�����Ϊ23:59:59��
     * @return Date����
     */
    public static Date getQueryToDateFromDisplayDate(String s) {
    	Date date=getDateFromDisplayDate(s);
    	Calendar calendar=Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.set(Calendar.HOUR_OF_DAY,23);
    	calendar.set(Calendar.MINUTE,59);
    	calendar.set(Calendar.SECOND,59);
    	return calendar.getTime();
    }

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

    public static BigDecimal parseBigDecimal(String amount) {
        if(amount==null) return null;
        try{
            return new BigDecimal(amount);
        }
        catch(Throwable t)
        {
            return null;
        }
    }
}