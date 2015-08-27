package org.socialsignin.provider.google;

import org.socialsignin.springsocial.security.signin.SpringSocialSecurityConnectInterceptor;
import org.springframework.social.google.api.Google;
import org.springframework.stereotype.Component;

@Component
public class GoogleConnectionInterceptor extends SpringSocialSecurityConnectInterceptor<Google>{

}
