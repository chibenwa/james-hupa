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

package org.apache.hupa.client.mapper;

import org.apache.hupa.client.activity.MessageContentActivity;
<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.hupa.client.place.MessagePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
=======
=======
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.place.IMAPMessagePlace;
import org.apache.hupa.client.place.MailFolderPlace;
>>>>>>> prepare for message content panel

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
>>>>>>> integrate all of the views to their corresponding activities and mappers
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

<<<<<<< HEAD
public class MessageContentActivityMapper extends _MessageActivityMapper {
	private final Provider<MessageContentActivity> messageContentActivityProvider;

	@Inject
	public MessageContentActivityMapper(Provider<MessageContentActivity> messageContentActivityProvider) {
		this.messageContentActivityProvider = messageContentActivityProvider;
	}

	@Override
	protected Activity lazyLoadActivity(final Place place) {
		return new ActivityAsyncProxy() {
			@Override
			protected void doAsync(RunAsyncCallback callback) {
				GWT.runAsync(callback);
			}

			@Override
			protected Activity createInstance() {
				if (place instanceof MessagePlace) {
					return messageContentActivityProvider.get().with(((MessagePlace) place).getTokenWrapper());
				}
				return messageContentActivityProvider.get();
			}
		};
=======
public class MessageContentActivityMapper implements ActivityMapper {
	private final Provider<MessageContentActivity> messageContentActivityProvider;

	@Inject
	public MessageContentActivityMapper(
			Provider<MessageContentActivity> messageContentActivityProvider) {
		this.messageContentActivityProvider = messageContentActivityProvider;
	}

	public Activity getActivity(Place place) {
		if(place instanceof DefaultPlace)return null;
		else if (place instanceof MailFolderPlace) return null;
		else if (place instanceof IMAPMessagePlace) return messageContentActivityProvider.get();
		return messageContentActivityProvider.get();
>>>>>>> integrate all of the views to their corresponding activities and mappers
	}
}
