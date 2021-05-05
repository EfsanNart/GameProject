
public interface SaleService {

	void add(Sale sale, Game game, Customer customer, Campaign campaign);
    void delete(Sale sale);
    void update(Sale sale);
    void getAll(Sale[] sales);
}
