package com.itemmaster.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import com.itemmaster.models.Users;
import com.itemmaster.repository.UserRepository;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(String.format("The username %s doesn't exist", username));
		}

		List<GrantedAuthority> authorities = new ArrayList<>();

		authorities.add(new SimpleGrantedAuthority("USER"));
		authorities.add(new SimpleGrantedAuthority("ADMIN"));

		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(),
				user.getPassword(), authorities);

		return userDetails;
	}*/

	@Override
	public void saveUser(Users user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(Users user) {
		userRepository.saveAndFlush(user);
	}

	@Override
	public Users getUser(Long userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public List<Users> getAllUser() {
		return userRepository.findAll();
	}

}
