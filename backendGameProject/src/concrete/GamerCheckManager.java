package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerCheckManager implements GamerService{

	private GamerCheckService gamerChechService;
	
	public GamerCheckManager(GamerCheckService gamerChechService) {
		super();
		this.gamerChechService = gamerChechService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerChechService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu Kaydedildi : " + gamer.getFirstName()+" "+gamer.getLastName());
		}else {
			System.out.println("ERROR");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi : "+gamer.getFirstName()+" "+gamer.getLastName() );
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
	}

}
