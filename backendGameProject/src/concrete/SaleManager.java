package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+" oyunu sat�n ald�. oyunun ad� : "+ game.getGameName()+" : "+ game.getUnitPrice()+"$");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" oyunun kampanya sonras� fiyat� : "+ game.getAfterDiscountPrice()+"$");
	}

}
