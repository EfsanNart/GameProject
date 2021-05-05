
public class Main {

	public static void main(String[] args) {
		    Customer customer=new Customer();
	        customer.setId(1);
	        customer.setNationalIdentity("12345432791");
	        customer.setFirstName("Ela");
	        customer.setLastName("Nart");
	        customer.setBirthdayDate("17.03.2001");
	        
	        
	        
	        CustomerManager customerManager=new CustomerManager(new Authorize());
	        customerManager.login(customer);
	        customerManager.update(customer);
	        customerManager.delete(customer);
	        
	        
	        System.out.println("---------------------------------------");
	        Game game=new Game();
	        game.setId(1);
	        game.setName("Minecraft");
	        game.setPrice(130);
	        game.setDiscountPrice(0);
	        
	        
	        Game[] games= {game};

	        GameManager gameManager=new GameManager();
	        gameManager.add(game);
	        gameManager.getAll(games);
	        
	        
	        System.out.println("---------------------------------------");
	        
	        Campaign campaign=new Campaign();
	        campaign.setId(1);
	        campaign.setCampaignName("3 al 2 öde");
	        campaign.setDiscount(10.20);
	        
	        Campaign[] campaigns= {campaign};

	        CampaignManager campaignManager=new CampaignManager();
	        campaignManager.add(campaign);
	        campaignManager.getAll(campaigns);
	        
	        
	        System.out.println("---------------------------------------");
	        
	        Sale sale=new Sale();
	        sale.setId(1);
	        sale.setCreditCardNo("1986543289201729");
	        Sale[] sales= {sale};

	        SaleManager saleManager=new SaleManager();
	        saleManager.add(sale,game,customer,campaign);
	        saleManager.getAll(sales);

	}

}
