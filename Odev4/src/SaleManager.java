
public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale, Game game, Customer customer, Campaign campaign) {
		System.out.println(sale.getId()+"'Numaralý iþlem: "+game.getName()+" isimli oyun "+customer.getFirstName()+" "+customer.getLastName()+" kullanýcýsýna "+campaign.getCampaignName()+" kampanyasý ile satýldý");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId()+"'Numaralý satýþ silindi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId()+"'Numaralý satýþ güncellendi.");
		
	}

	@Override
	public void getAll(Sale[] sales) {
		System.out.println("Kayýtlý kredi kartý bilgileri");
        for (Sale sale : sales) {
            System.out.println(sale.getId()+"' Numaralý kullanýcý: " +sale.getCreditCardNo());

        }
		
	}

}
