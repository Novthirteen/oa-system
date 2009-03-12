/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.admin;

import com.shcnc.hibernate.PersistentStringEnum;

public class ExpiresTime extends PersistentStringEnum {
	public static final ExpiresTime NEVER = new ExpiresTime("����", "00");
	public static final ExpiresTime TEND = new ExpiresTime("ʮ��", "01");
	public static final ExpiresTime ONEM = new ExpiresTime("һ����", "02");
	public static final ExpiresTime TWOM = new ExpiresTime("������", "03");
	public static final ExpiresTime THREEM = new ExpiresTime("������", "04");
	public static final ExpiresTime HALFY = new ExpiresTime("����", "05");
	public static final ExpiresTime ONEY = new ExpiresTime("һ��", "06");
	public ExpiresTime() {
	}

	private ExpiresTime(String name, String persistentValue) {
		super(name, persistentValue);
	}
	
	
}