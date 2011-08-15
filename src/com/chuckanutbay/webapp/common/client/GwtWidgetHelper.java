package com.chuckanutbay.webapp.common.client;

import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class GwtWidgetHelper {
	public static HorizontalPanel newHorizontalPanel(Widget...widgets) {
		HorizontalPanel hPanel = new HorizontalPanel();
		for (Widget widget : widgets) {
			hPanel.add(widget);
		}
		return hPanel;
	}
	public static VerticalPanel newVerticalPanel(Widget...widgets) {
		VerticalPanel vPanel = new VerticalPanel();
		for (Widget widget : widgets) {
			vPanel.add(widget);
		}
		return vPanel;
	}
	public static FlexTable newFlexTable(String...strings) {
		FlexTable ft = new FlexTable();
		populateFlexTableRow(ft, 0, 0, strings);
		return ft;
	}
	public static void populateFlexTableRow(FlexTable flexTable, int row, int startColumn, String...strings) {
		for (int i = 0; i < strings.length; i++) {
			flexTable.setText(row, i, strings[i]);
		}
	}
	public static void populateFlexTableRow(FlexTable flexTable, int row, int startColumn, Widget...widgets) {
		for (int i = 0; i < widgets.length; i++) {
			flexTable.setWidget(row, i, widgets[i]);
		}
	}
	public static void setStyleName(String style, Widget...widgets) {
		for (Widget widget : widgets) {
			widget.setStyleName(style);
		}
	}
	public static void setSpacing(int spacing, CellPanel...widgets) {
		for (CellPanel widget : widgets) {
			widget.setSpacing(spacing);
		}
	}
}