package net.lingwood.calendar.service;

import net.lingwood.entity.Client;

import java.util.List;

public interface CalendarServiceIF {

	Client  saveUserData(Client client);
	List<Client> getUserData();
	Client updateUserData(Client client);
	void deleteUserData(Long id);
	
}
