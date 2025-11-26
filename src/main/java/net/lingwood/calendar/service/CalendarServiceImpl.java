package net.lingwood.calendar.service;


	import net.lingwood.entity.Client;

	import net.lingwood.repository.ClientRepository;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public class CalendarServiceImpl implements CalendarServiceIF {

	    //@Autowired
	    ClientRepository clientRepository;

	    public CalendarServiceImpl(ClientRepository clientRepository) {
	    	this.clientRepository = clientRepository;
	    }
	    
	    @Override
	    public Client saveUserData(Client userEntity) {
	     return clientRepository.save(userEntity);
	    }

	    @Override
	    public List<Client> getUserData() {
	        return clientRepository.findAll();
	    }

	    @Override
	    public Client updateUserData(Client client) {
	        return clientRepository.save(client);
	    }

	    @Override
	    public void deleteUserData(Long id) {
	    	clientRepository.deleteById(id);
	    }
		
	
}
