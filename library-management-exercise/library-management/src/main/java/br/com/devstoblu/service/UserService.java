package br.com.devstoblu.service;

import java.util.List;
import java.util.UUID;

import br.com.devstoblu.dto.UserDto;

public interface UserService {

	UserDto insertUser(UserDto userDto);
	List<UserDto> getAllUsers();
	UserDto getUserById(UUID id);
	UserDto updateUser(UserDto newUserDto, UUID id);
	void deletUser(UUID id);

    
}
