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

package com.liferay.hr.service.persistence;

import com.liferay.hr.model.HRUserTimeOff;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r user time off service. This utility wraps {@link HRUserTimeOffPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserTimeOffPersistence
 * @see HRUserTimeOffPersistenceImpl
 * @generated
 */
public class HRUserTimeOffUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(HRUserTimeOff hrUserTimeOff) {
		getPersistence().clearCache(hrUserTimeOff);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HRUserTimeOff> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRUserTimeOff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRUserTimeOff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRUserTimeOff remove(HRUserTimeOff hrUserTimeOff)
		throws SystemException {
		return getPersistence().remove(hrUserTimeOff);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRUserTimeOff update(HRUserTimeOff hrUserTimeOff,
		boolean merge) throws SystemException {
		return getPersistence().update(hrUserTimeOff, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRUserTimeOff update(HRUserTimeOff hrUserTimeOff,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hrUserTimeOff, merge, serviceContext);
	}

	/**
	* Caches the h r user time off in the entity cache if it is enabled.
	*
	* @param hrUserTimeOff the h r user time off
	*/
	public static void cacheResult(
		com.liferay.hr.model.HRUserTimeOff hrUserTimeOff) {
		getPersistence().cacheResult(hrUserTimeOff);
	}

	/**
	* Caches the h r user time offs in the entity cache if it is enabled.
	*
	* @param hrUserTimeOffs the h r user time offs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRUserTimeOff> hrUserTimeOffs) {
		getPersistence().cacheResult(hrUserTimeOffs);
	}

	/**
	* Creates a new h r user time off with the primary key. Does not add the h r user time off to the database.
	*
	* @param hrUserTimeOffId the primary key for the new h r user time off
	* @return the new h r user time off
	*/
	public static com.liferay.hr.model.HRUserTimeOff create(
		long hrUserTimeOffId) {
		return getPersistence().create(hrUserTimeOffId);
	}

	/**
	* Removes the h r user time off with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrUserTimeOffId the primary key of the h r user time off
	* @return the h r user time off that was removed
	* @throws com.liferay.hr.NoSuchUserTimeOffException if a h r user time off with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserTimeOff remove(
		long hrUserTimeOffId)
		throws com.liferay.hr.NoSuchUserTimeOffException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrUserTimeOffId);
	}

	public static com.liferay.hr.model.HRUserTimeOff updateImpl(
		com.liferay.hr.model.HRUserTimeOff hrUserTimeOff, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrUserTimeOff, merge);
	}

	/**
	* Returns the h r user time off with the primary key or throws a {@link com.liferay.hr.NoSuchUserTimeOffException} if it could not be found.
	*
	* @param hrUserTimeOffId the primary key of the h r user time off
	* @return the h r user time off
	* @throws com.liferay.hr.NoSuchUserTimeOffException if a h r user time off with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserTimeOff findByPrimaryKey(
		long hrUserTimeOffId)
		throws com.liferay.hr.NoSuchUserTimeOffException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrUserTimeOffId);
	}

	/**
	* Returns the h r user time off with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrUserTimeOffId the primary key of the h r user time off
	* @return the h r user time off, or <code>null</code> if a h r user time off with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRUserTimeOff fetchByPrimaryKey(
		long hrUserTimeOffId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrUserTimeOffId);
	}

	/**
	* Returns all the h r user time offs.
	*
	* @return the h r user time offs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserTimeOff> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r user time offs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r user time offs
	* @param end the upper bound of the range of h r user time offs (not inclusive)
	* @return the range of h r user time offs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserTimeOff> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r user time offs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r user time offs
	* @param end the upper bound of the range of h r user time offs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r user time offs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRUserTimeOff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r user time offs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r user time offs.
	*
	* @return the number of h r user time offs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRUserTimeOffPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRUserTimeOffPersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRUserTimeOffPersistence.class.getName());

			ReferenceRegistry.registerReference(HRUserTimeOffUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRUserTimeOffPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRUserTimeOffUtil.class,
			"_persistence");
	}

	private static HRUserTimeOffPersistence _persistence;
}