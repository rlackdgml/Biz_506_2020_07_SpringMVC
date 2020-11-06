package com.biz.team.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.biz.team.model.UserVO;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AuthProviderImpl implements AuthenticationProvider{


		@Override
		public Authentication authenticate(Authentication authentication) throws AuthenticationException {

	
			String username = authentication.getName();
			
			// username "admin" or "user1" or "guest"
			boolean bUser = username.equals("admin");
			bUser |= username.equals("user1");
			bUser |= username.equals("guest");
			
			// 사용자ID 검사
			if( !bUser ) {
				
				String msg = String.format("[%s] 사용자 ID를 확인하세요", username);
				
			
				throw new InternalAuthenticationServiceException(msg);
				
				
			}
			
			// 로그인 비밀번호 추출하기
			String password = authentication.getCredentials().toString();
			if( !password.equals("1234") ) {
				throw new BadCredentialsException("비밀번호를 확인해 주세요!!");
			}
			
			UserVO userVO = new UserVO();
			log.debug("USER VO : " + userVO.isAccountNonExpired());
			
			if(!userVO.isEnabled()) {
				throw new DisabledException("사용자정보를 사용할수 없습니다");
			}
			if(!userVO.isAccountNonLocked()) {
				throw new LockedException("사용자 계정이 잠겨 있습니다"
						+ " 관리자에게 문의 하세요");
			}
			if(!userVO.isAccountNonExpired()) {
				throw new AccountExpiredException("사용자 계정이 만료되었습니다");
			}
			if(!userVO.isCredentialsNonExpired()) {
				throw new CredentialsExpiredException("사용자 계정의 권한이 없습니다");
			}
			
			
			List<GrantedAuthority> authList = new ArrayList<>();
			
			if(username.equals("admin")) {
				authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			} else if (username.equals("user1")) {
				authList.add(new SimpleGrantedAuthority("ROLE_USER"));	
			} else {
				authList.add(new SimpleGrantedAuthority("ROLE_GUEST"));	
			}
			
			UsernamePasswordAuthenticationToken token 
			= new UsernamePasswordAuthenticationToken(new UserVO(),null,authList);
			
			return token;
		}

		@Override
		public boolean supports(Class<?> authentication) {
			// TODO Auto-generated method stub
			return true;
		}

}
