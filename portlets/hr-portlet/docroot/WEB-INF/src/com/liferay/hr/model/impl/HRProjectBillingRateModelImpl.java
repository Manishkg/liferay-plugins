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

import com.liferay.hr.model.HRProjectBillingRate;
import com.liferay.hr.model.HRProjectBillingRateModel;

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
 * The base model implementation for the HRProjectBillingRate service. Represents a row in the &quot;HRProjectBillingRate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRProjectBillingRateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRProjectBillingRateImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRProjectBillingRateImpl
 * @see com.liferay.hr.model.HRProjectBillingRate
 * @see com.liferay.hr.model.HRProjectBillingRateModel
 * @generated
 */
public class HRProjectBillingRateModelImpl extends BaseModelImpl<HRProjectBillingRate>
	implements HRProjectBillingRateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r project billing rate model instance should use the {@link com.liferay.hr.model.HRProjectBillingRate} interface instead.
	 */
	public static final String TABLE_NAME = "HRProjectBillingRate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrProjectBillingRateId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrProjectId", Types.BIGINT },
			{ "hrProjectRoleId", Types.BIGINT },
			{ "rate", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table HRProjectBillingRate (hrProjectBillingRateId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrProjectId LONG,hrProjectRoleId LONG,rate DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table HRProjectBillingRate";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRProjectBillingRate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRProjectBillingRate"),
			true);

	public Class<?> getModelClass() {
		return HRProjectBillingRate.class;
	}

	public String getModelClassName() {
		return HRProjectBillingRate.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRProjectBillingRate"));

	public HRProjectBillingRateModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrProjectBillingRateId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrProjectBillingRateId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrProjectBillingRateId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrProjectBillingRateId() {
		return _hrProjectBillingRateId;
	}

	public void setHrProjectBillingRateId(long hrProjectBillingRateId) {
		_hrProjectBillingRateId = hrProjectBillingRateId;
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

	public long getHrProjectId() {
		return _hrProjectId;
	}

	public void setHrProjectId(long hrProjectId) {
		_hrProjectId = hrProjectId;
	}

	public long getHrProjectRoleId() {
		return _hrProjectRoleId;
	}

	public void setHrProjectRoleId(long hrProjectRoleId) {
		_hrProjectRoleId = hrProjectRoleId;
	}

	public double getRate() {
		return _rate;
	}

	public void setRate(double rate) {
		_rate = rate;
	}

	@Override
	public HRProjectBillingRate toEscapedModel() {
		if (isEscapedModel()) {
			return (HRProjectBillingRate)this;
		}
		else {
			return (HRProjectBillingRate)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRProjectBillingRate.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRProjectBillingRateImpl hrProjectBillingRateImpl = new HRProjectBillingRateImpl();

		hrProjectBillingRateImpl.setHrProjectBillingRateId(getHrProjectBillingRateId());
		hrProjectBillingRateImpl.setGroupId(getGroupId());
		hrProjectBillingRateImpl.setCompanyId(getCompanyId());
		hrProjectBillingRateImpl.setUserId(getUserId());
		hrProjectBillingRateImpl.setUserName(getUserName());
		hrProjectBillingRateImpl.setCreateDate(getCreateDate());
		hrProjectBillingRateImpl.setModifiedDate(getModifiedDate());
		hrProjectBillingRateImpl.setHrProjectId(getHrProjectId());
		hrProjectBillingRateImpl.setHrProjectRoleId(getHrProjectRoleId());
		hrProjectBillingRateImpl.setRate(getRate());

		hrProjectBillingRateImpl.resetOriginalValues();

		return hrProjectBillingRateImpl;
	}

	public int compareTo(HRProjectBillingRate hrProjectBillingRate) {
		long primaryKey = hrProjectBillingRate.getPrimaryKey();

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

		HRProjectBillingRate hrProjectBillingRate = null;

		try {
			hrProjectBillingRate = (HRProjectBillingRate)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrProjectBillingRate.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{hrProjectBillingRateId=");
		sb.append(getHrProjectBillingRateId());
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
		sb.append(", hrProjectId=");
		sb.append(getHrProjectId());
		sb.append(", hrProjectRoleId=");
		sb.append(getHrProjectRoleId());
		sb.append(", rate=");
		sb.append(getRate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRProjectBillingRate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrProjectBillingRateId</column-name><column-value><![CDATA[");
		sb.append(getHrProjectBillingRateId());
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
			"<column><column-name>hrProjectId</column-name><column-value><![CDATA[");
		sb.append(getHrProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrProjectRoleId</column-name><column-value><![CDATA[");
		sb.append(getHrProjectRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rate</column-name><column-value><![CDATA[");
		sb.append(getRate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRProjectBillingRate.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRProjectBillingRate.class
		};
	private long _hrProjectBillingRateId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrProjectId;
	private long _hrProjectRoleId;
	private double _rate;
	private transient ExpandoBridge _expandoBridge;
}