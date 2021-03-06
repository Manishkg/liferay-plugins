<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String tabs2 = ParamUtil.getString(request, "tabs2", "gadget");

String redirect = ParamUtil.getString(request, "redirect");

String portletResource = ParamUtil.getString(request, "portletResource");

PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);

String url = PrefsParamUtil.getString(preferences, request, "url", StringPool.BLANK);

Map<String, UserPref> userPrefs = (Map<String, UserPref>)renderRequest.getAttribute(WebKeys.USER_PREFS);
%>

<liferay-portlet:renderURL var="portletURL" portletConfiguration="true">
	<portlet:param name="tabs2" value="<%= tabs2 %>" />
	<portlet:param name="redirect" value="<%= redirect %>" />
</liferay-portlet:renderURL>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input name="tabs2" type="hidden" value="<%= tabs2 %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<c:if test="<%= userPrefs != null %>">
		<liferay-ui:tabs
			names="gadget,preferences"
			param="tabs2"
			url="<%= portletURL %>"
		/>
	</c:if>

	<c:choose>
		<c:when test='<%= tabs2.equals("gadget") || (userPrefs == null) %>'>
			<aui:fieldset>
				<aui:input cssClass="lfr-input-text-container" label="url" name="preferences--url--" type="text" value="<%= url %>" />
			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" />
			</aui:button-row>
		</c:when>
		<c:when test='<%= tabs2.equals("preferences") && (userPrefs != null) %>'>
			<liferay-util:include page="/gadget/configuration.jsp" servletContext="<%= application %>" />
		</c:when>
	</c:choose>
</aui:form>