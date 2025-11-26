package net.lingwood.calendar.controllers;

import net.lingwood.calendar.service.CalendarServiceImpl;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import net.lingwood.entity.Client;


@RestController
//@RequestMapping("/clients")
public class ClientsController {

	//@Autowired
	private CalendarServiceImpl clientService;

	
	public ClientsController(CalendarServiceImpl clientService) {
		this.clientService = clientService;
	}
	
    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/user")
    public ResponseEntity saveUserData(@RequestBody Client client){
        try {
        	clientService.saveUserData(client);
           return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
           return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<Client>> getUserData(){
        try {
            return new ResponseEntity<>(clientService.getUserData(),HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
	@PutMapping(value = "/user")
    public ResponseEntity updateUserData(@RequestBody Client client){
        try {
        	clientService.updateUserData(client);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
	@DeleteMapping(value = "/user")
    public ResponseEntity updateUserData(@RequestParam(value = "id") Long userId){
        try {
        	clientService.deleteUserData(userId);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}