package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+" oyunu satýn aldý. oyunun adý : "+ game.getGameName()+" : "+ game.getUnitPrice()+"$");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" oyunun kampanya sonrasý fiyatý : "+ game.getAfterDiscountPrice()+"$");
	}

}
