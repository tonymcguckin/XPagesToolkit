/**
 * Copyright 2013, WebGate Consulting AG
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
package org.openntf.xpt.test.dss.mock;

import org.openntf.xpt.core.dss.AbstractStorageService;

public class ListDoubleIntStorageServiceIncomplete extends AbstractStorageService<ListDoubleIntTestMock> {
	private static ListDoubleIntStorageServiceIncomplete m_Service = new ListDoubleIntStorageServiceIncomplete();

	public static ListDoubleIntStorageServiceIncomplete getInstance() {
		return m_Service;
	}

	@Override
	protected ListDoubleIntTestMock createObject() {
		return null;
	}

}
