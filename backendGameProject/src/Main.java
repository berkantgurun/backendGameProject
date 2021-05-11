import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {
	
	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Berkant");
		gamer.setLastName("Gürün");
		gamer.setNationalityId("12345678910");
		gamer.setDateOfBirth(null);
		
		Game game = new Game();
		game.setId(2);
		game.setGameName("PLAYERUNKNOWN'S BATTLEGROUNDS");
		game.setUnitPrice(69);
		
		Campaign campaign = new Campaign();
		campaign.setId(3);
		campaign.setCampaignName("Sevgililer Günü");
		campaign.setDiscount(50);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		System.out.println("----------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		System.out.println("-------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer, game);
		saleManager.campaignSale(gamer, game, campaign);
		System.out.println("---------------------");
	}


}
