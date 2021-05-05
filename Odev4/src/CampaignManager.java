
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" kampanyasý güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" kampanyasý silindi.");
		
	}

	@Override
	public void getAll(Campaign[] campaigns) {
		
		  for (Campaign campaign:campaigns){
	            System.out.println(campaign.getCampaignName()+ " kampanyasýnýn indirim oraný: "+campaign.getDiscount());
	         }
	}

}
