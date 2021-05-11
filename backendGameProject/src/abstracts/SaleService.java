package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer, Game game);
	void campaignSale(Gamer gamer, Game game, Campaign campaign);

}
