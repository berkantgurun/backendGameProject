package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi : " + campaign.getCampaignName() );
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya GŁncellendi : " + campaign.getCampaignName());
	}

}
