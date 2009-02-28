/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.utils;


/**
 * ����ά��һ��ip��ַ
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public class IpAddress {

    private int[] address = new int[4];

    /**
     * ȡ��ip��ַ�ĵ�indexλ��ֵ
     * @param index
     * @return
     */
    public int getAddress(int index) {
        return address[index];
    }

    /**
     * ��һ��String����IpAddress
     * @param addressString
     * @throws Exception
     */
    public IpAddress(String addressString) throws Exception {
        super();
        String[] part = addressString.split("[.]");
        if (part.length != address.length)
            throw new Exception("Error ip address format");
        for (int i = 0; i < address.length; i++) {
            address[i] = Integer.parseInt(part[i]);
        }
    }

    /**
     * �Ƚ�����IpAddress
     * @param anotherIpAddress ���Ƚϵ�IpAddress
     * @return the value 0 if the argument IpAddress is equal to this IpAddress;
     *         a value less than 0 if this IpAddress is lexicographically less
     *         than the IpAddress argument; and a value greater than 0 if this
     *         IpAddress is lexicographically greater than the IpAddress
     *         argument.
     */
    public int compareTo(IpAddress anotherIpAddress) {
        for (int index = 0; index < address.length; index++) {
            int dif = this.getAddress(index) - anotherIpAddress.getAddress(index);
            if (dif != 0)
                return dif;
        }
        return 0;
    }

    /**
     * �ж϶����Ƿ���ͬ
     * @param rhs ���ȽϵĶ���
     * @return �����Ƿ���ͬ
     */
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (this == rhs)
            return true;
        if (!(rhs instanceof IpAddress))
            return false;
        IpAddress that = (IpAddress) rhs;
        for (int index = 0; index < address.length; index++)
            if (this.getAddress(index) != that.getAddress(index))
                return false;
        return true;
    }

    /**
     * ����IpAddress��String��ʽ
     */
    public String toString() {
        String retVal = "" + address[0];
        for (int index = 1; index < address.length; index++)
            retVal = retVal + "." + address[index];
        return retVal;
    }

}
