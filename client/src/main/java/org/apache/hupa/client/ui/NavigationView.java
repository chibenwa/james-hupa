/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.hupa.client.ui;

<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.hupa.client.activity.NavigationActivity;
<<<<<<< HEAD
import org.apache.hupa.client.place.ContactPlace;
import org.apache.hupa.client.place.FolderPlace;
=======
import org.apache.hupa.client.place.MailFolderPlace;
>>>>>>> try to make switch to setting work
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.PlaceController;
<<<<<<< HEAD
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
=======
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
>>>>>>> try to make switch to setting work
import com.google.inject.Inject;

public class NavigationView extends Composite implements NavigationActivity.Displayable{
	
	@Inject PlaceController placeController; 
	@UiField Anchor mail;
	@UiField Anchor setting;
<<<<<<< HEAD
	@UiField Anchor contact;
	@UiField SimplePanel contactOuter;
	@UiField SimplePanel mailOuter;
	@UiField SimplePanel settingOuter;
	
	@UiField Style style;
	

	interface Style extends CssResource {
		String selected();
		String settingsInnerSelected();
		String mailInnerSelected();
		String contactInnerSelected();
	}
=======
=======
import org.apache.hupa.client.activity.NavigationActivity;

>>>>>>> integrate all of the views to their corresponding activities and mappers
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;

<<<<<<< HEAD
public class NavigationView extends Composite {
>>>>>>> make login page as one part of the overall layout & splite layout to little one
=======
public class NavigationView extends Composite implements NavigationActivity.Displayable{
>>>>>>> integrate all of the views to their corresponding activities and mappers
=======
>>>>>>> try to make switch to setting work

	public NavigationView() {
		initWidget(binder.createAndBindUi(this));
	}
<<<<<<< HEAD
<<<<<<< HEAD
	
	@UiHandler("mail")
	public void onMailClick(ClickEvent e){
		mailOuter.addStyleName(style.selected());
		mail.addStyleName(style.mailInnerSelected());
		
		settingOuter.removeStyleName(style.selected());
		setting.removeStyleName(style.settingsInnerSelected());
		
		contactOuter.removeStyleName(style.selected());
		contact.removeStyleName(style.contactInnerSelected());
		//FIXME need the configure one
		if(GWT.isProdMode()){
			placeController.goTo(new FolderPlace("INBOX"));
		}else{
			placeController.goTo(new FolderPlace("Mock-Inbox"));
		}
	}
	
	
	
	@UiHandler("setting")
	public void onSettingClick(ClickEvent e){
		mailOuter.removeStyleName(style.selected());
		mail.removeStyleName(style.mailInnerSelected());
		contactOuter.removeStyleName(style.selected());
		contact.removeStyleName(style.contactInnerSelected());
		
		settingOuter.addStyleName(style.selected());
		setting.addStyleName(style.settingsInnerSelected());
		placeController.goTo(new SettingPlace("labels"));
	}
	

	@UiHandler("contact")
	public void onContactClick(ClickEvent e){
		Window.alert("//TODO");
//		mailOuter.removeStyleName(style.selected());
//		mail.removeStyleName(style.mailInnerSelected());
//		contactOuter.addStyleName(style.selected());
//		contact.addStyleName(style.contactInnerSelected());
//		
//		settingOuter.removeStyleName(style.selected());
//		setting.removeStyleName(style.settingsInnerSelected());
//		placeController.goTo(new ContactPlace("contacts"));
	}
	
	
=======
>>>>>>> make login page as one part of the overall layout & splite layout to little one
=======
	
	@UiHandler("mail")
	public void onMailClick(ClickEvent e){
		placeController.goTo(new MailFolderPlace("Mock-Inbox"));
	}
	
	@UiHandler("setting")
	public void onSettingClick(ClickEvent e){
		placeController.goTo(new SettingPlace("folders"));
	}
>>>>>>> try to make switch to setting work

	interface NavigationUiBinder extends UiBinder<DockLayoutPanel, NavigationView> {
	}

	private static NavigationUiBinder binder = GWT.create(NavigationUiBinder.class);

}
