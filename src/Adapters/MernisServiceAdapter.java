package Adapters;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;
import MernisService.SCDKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        SCDKPSPublicSoap kpsPublic = new SCDKPSPublicSoap();
        boolean result = kpsPublic.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                        customer.getFirstName().toUpperCase(),
                        customer.getLastName().toUpperCase(),
                        customer.getDateOfBirth().getYear()

        );
        return result;
    }
}
