<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
%>

<%@ include file="/init.jsp" %>

<%
PortletPreferences preferences = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}

String articlesTitle = preferences.getValue("articles-title", StringPool.BLANK);
int articlesDelta = GetterUtil.getInteger(preferences.getValue("articles-delta", StringPool.BLANK), SearchContainer.DEFAULT_DELTA);
String articlesDisplayStyle = preferences.getValue("articles-display-style", "title");
String articleWindowState = preferences.getValue("article-window-state", WindowState.MAXIMIZED.toString());
String childArticlesDisplayStyle = preferences.getValue("child-articles-display-style", "abstract");
boolean enableArticleComments = GetterUtil.getBoolean(preferences.getValue("enable-article-comments", null), true);
boolean enableArticleCommentRatings = GetterUtil.getBoolean(preferences.getValue("enable-article-comment-ratings", null));

String selectionMethod = preferences.getValue("selection-method", "parent-group");
long[] scopeGroupIds = GetterUtil.getLongValues(preferences.getValues("scope-group-ids", new String[0]));
long[] resourcePrimKeys = GetterUtil.getLongValues(preferences.getValues("resource-prim-keys", new String[0]));

boolean allArticles = GetterUtil.getBoolean(preferences.getValue("all-articles", null), true);
String orderByColumn = preferences.getValue("order-by-column", "modified-date");
boolean orderByAscending = GetterUtil.getBoolean(preferences.getValue("order-by-ascending", null));

OrderByComparator orderByComparator = null;

if (orderByColumn.equals("create-date")) {
	orderByComparator = new ArticleCreateDateComparator(orderByAscending);
}
else if (orderByColumn.equals("modified-date")) {
	orderByComparator = new ArticleModifiedDateComparator(orderByAscending);
}
else if (orderByColumn.equals("priority")) {
	orderByComparator = new ArticlePriorityComparator(orderByAscending);
}
else if (orderByColumn.equals("title")) {
	orderByComparator = new ArticleTitleComparator(orderByAscending);
}

if (articleWindowState.equals(WindowState.MAXIMIZED.toString()) && windowState.equals(WindowState.MAXIMIZED)) {
	String backURL = currentURL;

	backURL = HttpUtil.setParameter(backURL, "p_p_state", WindowState.NORMAL.toString());
	backURL = HttpUtil.removeParameter(backURL, renderResponse.getNamespace() + "jspPage");

	portletDisplay.setURLBack(backURL);
}
%>

<%!
private String _replaceHTML(String html, String[] oldSubs, String[] newSubs) {
	for (int i = 0; i < oldSubs.length; i++) {
		html = StringUtil.replace(
			html,
			new String[] {
				HttpUtil.encodeURL(oldSubs[i], true),
				HtmlUtil.escapeAttribute(oldSubs[i]),
				HtmlUtil.escapeAttribute(HtmlUtil.escapeURL(oldSubs[i]))
			},
			new String[] {
				HttpUtil.encodeURL(newSubs[i], true),
				HtmlUtil.escapeAttribute(newSubs[i]),
				HtmlUtil.escapeAttribute(HtmlUtil.escapeURL(newSubs[i]))
			});
	}

	return html;
}
%>