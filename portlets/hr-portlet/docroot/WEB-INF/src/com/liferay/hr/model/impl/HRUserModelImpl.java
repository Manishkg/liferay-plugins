/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRUser;
import com.liferay.hr.model.HRUserModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRUser service. Represents a row in the &quot;HRUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRUserImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserImpl
 * @see com.liferay.hr.model.HRUser
 * @see com.liferay.hr.model.HRUserModel
 * @generated
 */
public class HRUserModelImpl extends BaseModelImpl<HRUser>
	implements HRUserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r user model instance should use the {@link com.liferay.hr.model.HRUser} interface instead.
	 */
	public static final String TABLE_NAME = "HRUser";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrUserId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrEmploymentTypeId", Types.BIGINT },
			{ "hrJobTitleId", Types.BIGINT },
			{ "hrOfficeId", Types.BIGINT },
			{ "hrTerminationTypeId", Types.BIGINT },
			{ "hrWageTypeId", Types.BIGINT },
			{ "hireDate", Types.TIMESTAMP },
			{ "terminationDate", Types.TIMESTAMP },
			{ "wageAmount", Types.DOUBLE },
			{ "wageCurrencyCode", Types.VARCHAR },
			{ "benefitsExempt", Types.BOOLEAN },
			{ "overtimeExempt", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table HRUser (hrUserId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrEmploymentTypeId LONG,hrJobTitleId LONG,hrOfficeId LONG,hrTerminationTypeId LONG,hrWageTypeId LONG,hireDate DATE null,terminationDate DATE null,wageAmount DOUBLE,wageCurrencyCode VARCHAR(75) null,benefitsExempt BOOLEAN,overtimeExempt BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table HRUser";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRUser"),
			true);

	public Class<?> getModelClass() {
		return HRUser.class;
	}

	public String getModelClassName() {
		return HRUser.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRUser"));

	public HRUserModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrUserId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrUserId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrUserId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrUserId() {
		return _hrUserId;
	}

	public void setHrUserId(long hrUserId) {
		_hrUserId = hrUserId;
	}

	public String getHrUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getHrUserId(), "uuid", _hrUserUuid);
	}

	public void setHrUserUuid(String hrUserUuid) {
		_hrUserUuid = hrUserUuid;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getHrEmploymentTypeId() {
		return _hrEmploymentTypeId;
	}

	public void setHrEmploymentTypeId(long hrEmploymentTypeId) {
		_hrEmploymentTypeId = hrEmploymentTypeId;
	}

	public long getHrJobTitleId() {
		return _hrJobTitleId;
	}

	public void setHrJobTitleId(long hrJobTitleId) {
		_hrJobTitleId = hrJobTitleId;
	}

	public long getHrOfficeId() {
		return _hrOfficeId;
	}

	public void setHrOfficeId(long hrOfficeId) {
		_hrOfficeId = hrOfficeId;
	}

	public long getHrTerminationTypeId() {
		return _hrTerminationTypeId;
	}

	public void setHrTerminationTypeId(long hrTerminationTypeId) {
		_hrTerminationTypeId = hrTerminationTypeId;
	}

	public long getHrWageTypeId() {
		return _hrWageTypeId;
	}

	public void setHrWageTypeId(long hrWageTypeId) {
		_hrWageTypeId = hrWageTypeId;
	}

	public Date getHireDate() {
		return _hireDate;
	}

	public void setHireDate(Date hireDate) {
		_hireDate = hireDate;
	}

	public Date getTerminationDate() {
		return _terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		_terminationDate = terminationDate;
	}

	public double getWageAmount() {
		return _wageAmount;
	}

	public void setWageAmount(double wageAmount) {
		_wageAmount = wageAmount;
	}

	public String getWageCurrencyCode() {
		if (_wageCurrencyCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _wageCurrencyCode;
		}
	}

	public void setWageCurrencyCode(String wageCurrencyCode) {
		_wageCurrencyCode = wageCurrencyCode;
	}

	public boolean getBenefitsExempt() {
		return _benefitsExempt;
	}

	public boolean isBenefitsExempt() {
		return _benefitsExempt;
	}

	public void setBenefitsExempt(boolean benefitsExempt) {
		_benefitsExempt = benefitsExempt;
	}

	public boolean getOvertimeExempt() {
		return _overtimeExempt;
	}

	public boolean isOvertimeExempt() {
		return _overtimeExempt;
	}

	public void setOvertimeExempt(boolean overtimeExempt) {
		_overtimeExempt = overtimeExempt;
	}

	@Override
	public HRUser toEscapedModel() {
		if (isEscapedModel()) {
			return (HRUser)this;
		}
		else {
			return (HRUser)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRUser.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRUserImpl hrUserImpl = new HRUserImpl();

		hrUserImpl.setHrUserId(getHrUserId());
		hrUserImpl.setGroupId(getGroupId());
		hrUserImpl.setCompanyId(getCompanyId());
		hrUserImpl.setUserId(getUserId());
		hrUserImpl.setUserName(getUserName());
		hrUserImpl.setCreateDate(getCreateDate());
		hrUserImpl.setModifiedDate(getModifiedDate());
		hrUserImpl.setHrEmploymentTypeId(getHrEmploymentTypeId());
		hrUserImpl.setHrJobTitleId(getHrJobTitleId());
		hrUserImpl.setHrOfficeId(getHrOfficeId());
		hrUserImpl.setHrTerminationTypeId(getHrTerminationTypeId());
		hrUserImpl.setHrWageTypeId(getHrWageTypeId());
		hrUserImpl.setHireDate(getHireDate());
		hrUserImpl.setTerminationDate(getTerminationDate());
		hrUserImpl.setWageAmount(getWageAmount());
		hrUserImpl.setWageCurrencyCode(getWageCurrencyCode());
		hrUserImpl.setBenefitsExempt(getBenefitsExempt());
		hrUserImpl.setOvertimeExempt(getOvertimeExempt());

		hrUserImpl.resetOriginalValues();

		return hrUserImpl;
	}

	public int compareTo(HRUser hrUser) {
		long primaryKey = hrUser.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRUser hrUser = null;

		try {
			hrUser = (HRUser)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrUser.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{hrUserId=");
		sb.append(getHrUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", hrEmploymentTypeId=");
		sb.append(getHrEmploymentTypeId());
		sb.append(", hrJobTitleId=");
		sb.append(getHrJobTitleId());
		sb.append(", hrOfficeId=");
		sb.append(getHrOfficeId());
		sb.append(", hrTerminationTypeId=");
		sb.append(getHrTerminationTypeId());
		sb.append(", hrWageTypeId=");
		sb.append(getHrWageTypeId());
		sb.append(", hireDate=");
		sb.append(getHireDate());
		sb.append(", terminationDate=");
		sb.append(getTerminationDate());
		sb.append(", wageAmount=");
		sb.append(getWageAmount());
		sb.append(", wageCurrencyCode=");
		sb.append(getWageCurrencyCode());
		sb.append(", benefitsExempt=");
		sb.append(getBenefitsExempt());
		sb.append(", overtimeExempt=");
		sb.append(getOvertimeExempt());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrUserId</column-name><column-value><![CDATA[");
		sb.append(getHrUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrEmploymentTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrEmploymentTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrJobTitleId</column-name><column-value><![CDATA[");
		sb.append(getHrJobTitleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrOfficeId</column-name><column-value><![CDATA[");
		sb.append(getHrOfficeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrTerminationTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrTerminationTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrWageTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrWageTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hireDate</column-name><column-value><![CDATA[");
		sb.append(getHireDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>terminationDate</column-name><column-value><![CDATA[");
		sb.append(getTerminationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wageAmount</column-name><column-value><![CDATA[");
		sb.append(getWageAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wageCurrencyCode</column-name><column-value><![CDATA[");
		sb.append(getWageCurrencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefitsExempt</column-name><column-value><![CDATA[");
		sb.append(getBenefitsExempt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeExempt</column-name><column-value><![CDATA[");
		sb.append(getOvertimeExempt());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRUser.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRUser.class
		};
	private long _hrUserId;
	private String _hrUserUuid;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrEmploymentTypeId;
	private long _hrJobTitleId;
	private long _hrOfficeId;
	private long _hrTerminationTypeId;
	private long _hrWageTypeId;
	private Date _hireDate;
	private Date _terminationDate;
	private double _wageAmount;
	private String _wageCurrencyCode;
	private boolean _benefitsExempt;
	private boolean _overtimeExempt;
	private transient ExpandoBridge _expandoBridge;
}