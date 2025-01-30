package Lab9Part1.prob1.src.business;

import java.util.List;

import Lab9Part1.prob1.src.business.Book;
import Lab9Part1.prob1.src.dataaccess.DataAccess;
import Lab9Part1.prob1.src.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
