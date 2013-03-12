package org.vnguyen.joreman;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamWrapper {
	@JsonProperty("host_parameter") public HostParameter hostParam;
	
	public ParamWrapper() {}
	
	public ParamWrapper(HostParameter hostParam) {
		this.hostParam = hostParam;
	}
}
