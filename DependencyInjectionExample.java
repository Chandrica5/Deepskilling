// Self-learning project for Dependency Injection
// Created by Chandrica.P

interface CustomerRepository {
    void findCustomerById(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public void findCustomerById(int id) {
        System.out.println("Customer with ID " + id + " is found in the database.");
    }
}

class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomer(int id) {
        customerRepository.findCustomerById(id);
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);
        service.getCustomer(11);
    }
}
