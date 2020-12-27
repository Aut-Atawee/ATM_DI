package ATM_DI;

import java.util.Map;

public interface DataSource {
    Map<Integer, Customer> readCustomers() ;
}
