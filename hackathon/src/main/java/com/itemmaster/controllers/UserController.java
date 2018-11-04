package com.itemmaster.controllers;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemmaster.models.Users;
import com.itemmaster.services.UserService;

@RestController
public class UserController extends BaseController {

	@Autowired
	UserService userService;

	@Autowired
	private DefaultTokenServices tokenServices;

	@Autowired
	private TokenStore tokenStore;

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public void saveUser(@RequestBody Users user, ModelMap map) {
		userService.saveUser(user);
	}

	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public String test() {
		return "hello";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/oauth/token")
	public void revokeToken(HttpServletRequest request) {
		// https://www.baeldung.com/logout-spring-security-oauth,
		// https://www.baeldung.com/rest-api-spring-oauth2-angularjs
		String authHeader = request.getHeader("Authorization");
		Collection<OAuth2AccessToken> tokens = tokenStore.findTokensByClientId("trusted-app");
		tokens.forEach(token -> {
			System.out.println(token.getTokenType() + " <----> " + token.getValue());
		});
		if (authHeader != null) {
			String tokenValue = authHeader.replace("Bearer", "").trim();
			OAuth2Authentication auth = tokenStore.readAuthentication(tokenValue);
			System.out.println("is Authenticated " + auth.isAuthenticated());
			System.out.println(auth.getUserAuthentication().isAuthenticated());
			OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
			tokenServices.revokeToken(tokenValue);
			tokenStore.removeAccessToken(accessToken);
		}
	}
}
