/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse unmarshall(CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.RequestId"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.ResultCode"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setColor(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.Color"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.CreatedAt"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.Description"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setGroupId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.GroupId"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.Id"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.Name"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.ProjectId"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.SourceType"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setTemplate(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.Template"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setTenantId(_ctx.longValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.TenantId"));
		createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorResponse;
	}
}