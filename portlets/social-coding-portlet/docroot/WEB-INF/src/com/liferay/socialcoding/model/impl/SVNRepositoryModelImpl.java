/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.socialcoding.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialcoding.model.SVNRepository;
import com.liferay.socialcoding.model.SVNRepositoryModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SVNRepository service. Represents a row in the &quot;SC_SVNRepository&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.socialcoding.model.SVNRepositoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SVNRepositoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SVNRepositoryImpl
 * @see com.liferay.socialcoding.model.SVNRepository
 * @see com.liferay.socialcoding.model.SVNRepositoryModel
 * @generated
 */
public class SVNRepositoryModelImpl extends BaseModelImpl<SVNRepository>
	implements SVNRepositoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a s v n repository model instance should use the {@link com.liferay.socialcoding.model.SVNRepository} interface instead.
	 */
	public static final String TABLE_NAME = "SC_SVNRepository";
	public static final Object[][] TABLE_COLUMNS = {
			{ "svnRepositoryId", Types.BIGINT },
			{ "url", Types.VARCHAR },
			{ "revisionNumber", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table SC_SVNRepository (svnRepositoryId LONG not null primary key,url VARCHAR(200) null,revisionNumber LONG)";
	public static final String TABLE_SQL_DROP = "drop table SC_SVNRepository";
	public static final String ORDER_BY_JPQL = " ORDER BY svnRepository.url ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SC_SVNRepository.url ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialcoding.model.SVNRepository"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialcoding.model.SVNRepository"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.socialcoding.model.SVNRepository"),
			true);
	public static long URL_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialcoding.model.SVNRepository"));

	public SVNRepositoryModelImpl() {
	}

	public long getPrimaryKey() {
		return _svnRepositoryId;
	}

	public void setPrimaryKey(long primaryKey) {
		setSvnRepositoryId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_svnRepositoryId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return SVNRepository.class;
	}

	public String getModelClassName() {
		return SVNRepository.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("svnRepositoryId", getSvnRepositoryId());
		attributes.put("url", getUrl());
		attributes.put("revisionNumber", getRevisionNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long svnRepositoryId = (Long)attributes.get("svnRepositoryId");

		if (svnRepositoryId != null) {
			setSvnRepositoryId(svnRepositoryId);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Long revisionNumber = (Long)attributes.get("revisionNumber");

		if (revisionNumber != null) {
			setRevisionNumber(revisionNumber);
		}
	}

	public long getSvnRepositoryId() {
		return _svnRepositoryId;
	}

	public void setSvnRepositoryId(long svnRepositoryId) {
		_svnRepositoryId = svnRepositoryId;
	}

	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	public void setUrl(String url) {
		_columnBitmask = -1L;

		if (_originalUrl == null) {
			_originalUrl = _url;
		}

		_url = url;
	}

	public String getOriginalUrl() {
		return GetterUtil.getString(_originalUrl);
	}

	public long getRevisionNumber() {
		return _revisionNumber;
	}

	public void setRevisionNumber(long revisionNumber) {
		_revisionNumber = revisionNumber;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SVNRepository.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SVNRepository toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SVNRepository)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public SVNRepository toUnescapedModel() {
		if (ProxyUtil.isProxyClass(getClass())) {
			InvocationHandler invocationHandler = ProxyUtil.getInvocationHandler(this);

			AutoEscapeBeanHandler autoEscapeBeanHandler = (AutoEscapeBeanHandler)invocationHandler;

			_unescapedModel = (SVNRepository)autoEscapeBeanHandler.getBean();
		}
		else {
			_unescapedModel = (SVNRepository)this;
		}

		return _unescapedModel;
	}

	@Override
	public Object clone() {
		SVNRepositoryImpl svnRepositoryImpl = new SVNRepositoryImpl();

		svnRepositoryImpl.setSvnRepositoryId(getSvnRepositoryId());
		svnRepositoryImpl.setUrl(getUrl());
		svnRepositoryImpl.setRevisionNumber(getRevisionNumber());

		svnRepositoryImpl.resetOriginalValues();

		return svnRepositoryImpl;
	}

	public int compareTo(SVNRepository svnRepository) {
		int value = 0;

		value = getUrl().compareTo(svnRepository.getUrl());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SVNRepository svnRepository = null;

		try {
			svnRepository = (SVNRepository)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = svnRepository.getPrimaryKey();

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
		SVNRepositoryModelImpl svnRepositoryModelImpl = this;

		svnRepositoryModelImpl._originalUrl = svnRepositoryModelImpl._url;

		svnRepositoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SVNRepository> toCacheModel() {
		SVNRepositoryCacheModel svnRepositoryCacheModel = new SVNRepositoryCacheModel();

		svnRepositoryCacheModel.svnRepositoryId = getSvnRepositoryId();

		svnRepositoryCacheModel.url = getUrl();

		String url = svnRepositoryCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			svnRepositoryCacheModel.url = null;
		}

		svnRepositoryCacheModel.revisionNumber = getRevisionNumber();

		return svnRepositoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{svnRepositoryId=");
		sb.append(getSvnRepositoryId());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", revisionNumber=");
		sb.append(getRevisionNumber());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialcoding.model.SVNRepository");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>svnRepositoryId</column-name><column-value><![CDATA[");
		sb.append(getSvnRepositoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revisionNumber</column-name><column-value><![CDATA[");
		sb.append(getRevisionNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SVNRepository.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SVNRepository.class
		};
	private long _svnRepositoryId;
	private String _url;
	private String _originalUrl;
	private long _revisionNumber;
	private long _columnBitmask;
	private SVNRepository _escapedModel;
	private SVNRepository _unescapedModel;
}