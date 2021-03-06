package concrete;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Eklendi : " + gamer.getFirstName()+" "+gamer.getLastName() );
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi : " + gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu GŁncellendi : " + gamer.getFirstName()+" "+gamer.getLastName());
	}

}
