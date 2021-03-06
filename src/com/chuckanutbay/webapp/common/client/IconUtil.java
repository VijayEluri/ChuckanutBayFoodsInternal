package com.chuckanutbay.webapp.common.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;

public class IconUtil {
	public static final String DATABASE = "icons/database.png";
	public static final String DATE = "icons/date_magnify.png";
	public static final String SEARCH = "icons/magnifier.png";
	public static final String PRINT = "icons/printer.png";
	public static final String PRINT_LARGE = "icons/printer_large.png";
	public static final String PROGRESS = "icons/progress_indicator.gif";
	public static final String NEXT = "icons/arrow_right.png";
	public static final String BACK = "icons/arrow_undo.png";
	public static final String ARROW_UP = "icons/arrow_up.png";
	public static final String REFRESH = "icons/arrow_rotate_anticlockwise.png";
	public static final String REFRESH_LARGE = "icons/refresh_large.png";
	public static final String DELETE = "icons/delete.png";
	public static final String SAVE = "icons/database_add.png";
	public static final String ADD = "icons/add.png";
	public static final String ADD_LARGE = "icons/add_large.png";
	public static final String LIST = "icons/table.png";
	public static final String CHECKMARK = "icons/tick.png";
	public static final String WARNING = "icons/error_go.png";
	public static final String CANCEL = "icons/cross.png";
	public static final String EDIT = "icons/pencil.png";
	public static final String EDIT_LARGE = "icons/pencil_large.png";
	public static final String WHITE_LOGO = "icons/white_logo.png";
	public static final String WHITE_LOGO_NO_ISLAND = "icons/white_logo_no_island.png";
	public static final String LOGO = "icons/chuckanutbayfoodslogo1.png";
	public static final String ORANGE = "icons/orange.png";
	public static final String YELLOW = "icons/yellow.png";
	public static final String GREEN = "icons/green.png";
	public static final String BLUE = "icons/blue.png";
	public static final String PURPLE = "icons/purple.png";
	
	public static Image newImage(String image) {
		return new Image(image);
	}
	
	static public void addIcon(Button button, String icon, String text) {
		HorizontalPanel buttonPanel = new HorizontalPanel();
		Image formatedIcon = new Image(icon);
		HTML formatedText = new HTML(text);
		buttonPanel.setSpacing(2);
		buttonPanel.add(formatedIcon);
		buttonPanel.add(formatedText);
		buttonPanel.setStyleName("center");
		button.setHTML(buttonPanel.getElement().getString());
	}
	
	static public Button newButtonWithIcon(String icon, String text) {
		Button newButton = new Button();
		addIcon(newButton, icon, text);
		return newButton;
	}
	
	static public Button newButtonWithIcon(String icon, String text, ClickHandler clickHandler) {
		Button newButton = new Button();
		addIcon(newButton, icon, text);
		newButton.addClickHandler(clickHandler);
		return newButton;
	}
	
}
