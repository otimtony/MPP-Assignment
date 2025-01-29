package Lab9Part1.prob1.src.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Lab9Part1.prob1.Project4_Students.src.business.Book;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.Auth;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.DataAccess;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.DataAccessFacade;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.User;

public class SystemController implements ControllerInterface {
	public static Auth currentAuth = null;
	
	public void login(String id, String password) throws LoginException {
		DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.readUserMap();
		if(!map.containsKey(id)) {
			throw new LoginException("ID " + id + " not found");
		}
		String passwordFound = map.get(id).getPassword();
		if(!passwordFound.equals(password)) {
			throw new LoginException("Password incorrect");
		}
		currentAuth = map.get(id).getAuthorization();
		
	}
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}
	
	
}
