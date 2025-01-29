package Lab9Part1.prob1.src.business;

import java.util.List;

import Lab9Part1.prob1.Project4_Students.src.business.Book;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.DataAccess;
import Lab9Part1.prob1.Project4_Students.src.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
