package org.socialsignin.provider.google;

import org.socialsignin.provider.AbstractProviderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.web.ConnectInterceptor;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.google.api.Google;

@Configuration
public class GoogleProviderConfig extends AbstractProviderConfig<Google>{
	@Autowired
	private ConnectInterceptor<Google> facebookConnectInterceptor;
	
	@Override
	protected ConnectInterceptor<Google> getConnectInterceptor() {
		return facebookConnectInterceptor;
	}
}
