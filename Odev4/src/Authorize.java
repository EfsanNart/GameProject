
public class Authorize implements AuthorizeService {

	private String nationalIdentity=("12345432791");
    private String firstName=("Ela");
    private String lastName=("Nart");
    private String birthdayDate=("17.03.2001");

    @Override
    public boolean verify(Customer customer) {
    	if((this.nationalIdentity.equals(customer.getNationalIdentity()))&&(this.firstName.equals(customer.getFirstName()))&&(this.lastName.equals(customer.getLastName()))&&(this.birthdayDate.equals(customer.getBirthdayDate())))
    		return true;
    	 else {
             return false;
         }
    }
	
}
