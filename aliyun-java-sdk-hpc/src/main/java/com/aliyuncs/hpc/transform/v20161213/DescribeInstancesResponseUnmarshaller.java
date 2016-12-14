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
package com.aliyuncs.hpc.transform.v20161213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse.Instance;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse.Instance.InstanceType;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse.Instance.JumpserverStatus;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse.Instance.PackageId;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesResponse.Instance.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setInstanceType(InstanceType.getEnum(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType")));
			instance.setPackageId(PackageId.getEnum(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PackageId")));
			instance.setStatus(Status.getEnum(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status")));
			instance.setInnerIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setJumpserverStatus(JumpserverStatus.getEnum(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpserverStatus")));
			instance.setJumpserverInnerIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpserverInnerIpAddress"));
			instance.setJumpServerPublicIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpServerPublicIpAddress"));
			instance.setCreationTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setExpireTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpireTime"));

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}