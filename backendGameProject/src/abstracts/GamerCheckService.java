package abstracts;

import entities.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);
	boolean CheckIfRealPerson(Gamer gamer) throws Exception;

}
