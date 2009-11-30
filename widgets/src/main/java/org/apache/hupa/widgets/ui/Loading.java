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

package org.apache.hupa.widgets.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Widget which shows a Loading state
 *
 */
public class Loading extends Composite{
    private SimplePanel sPanel = new SimplePanel();
    private HorizontalPanel panel = new HorizontalPanel();
    public Loading(String loadingMsg) {
        panel.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
        panel.setVerticalAlignment(HorizontalPanel.ALIGN_MIDDLE);
        panel.add(new Image(GWT.getModuleBaseURL() + "../images/ajax-loader.gif"));
        if (loadingMsg != null) {
            panel.add(new Label(loadingMsg));
        }
        
        initWidget(sPanel);
    }
    
    public Loading() {
        this(null);
    }
    
    /**
     * Show the Loading image
     */
    public void show() {
        sPanel.clear();
        sPanel.add(panel);
    }
    
    /**
     * Hde the Loading image
     */
    public void hide() {
        sPanel.clear();
        sPanel.add(new HTML("&nbsp"));
    }

}