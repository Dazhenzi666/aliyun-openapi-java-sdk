/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.hpc.model.v20161213;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstancePasswordRequest extends RpcAcsRequest<ModifyInstancePasswordResponse> {
	
	public ModifyInstancePasswordRequest() {
		super("HPC", "2016-12-13", "ModifyInstancePassword", "hpc");
		setMethod(MethodType.POST);
	}

	private String tOKEN;

	private String instanceId;

	private String newPassword;

	public String getTOKEN() {
		return this.tOKEN;
	}

	public void setTOKEN(String tOKEN) {
		this.tOKEN = tOKEN;
		putQueryParameter("TOKEN", tOKEN);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
		putQueryParameter("NewPassword", newPassword);
	}

	@Override
	public Class<ModifyInstancePasswordResponse> getResponseClass() {
		return ModifyInstancePasswordResponse.class;
	}

}
