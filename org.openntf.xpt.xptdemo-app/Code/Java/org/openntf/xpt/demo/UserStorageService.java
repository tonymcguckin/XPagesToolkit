/*
 * � Copyright WebGate Consulting AG, 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xpt.demo;

import org.openntf.xpt.core.dss.DominoStorageService;

import com.ibm.xsp.extlib.util.ExtLibUtil;

public class UserStorageService {

	private static UserStorageService m_Service;

	private UserStorageService() {

	}

	public static UserStorageService getInstance() {
		if (m_Service == null) {
			m_Service = new UserStorageService();
		}
		return m_Service;
	}

	public void saveUser(UserProfile usCurrent) {
		try {
			DominoStorageService.getInstance().saveObject(usCurrent, ExtLibUtil.getCurrentDatabase());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
