package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerBaseId;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.models.Car;
import com.example.demo.models.CarIssue;
import com.example.demo.models.Customer;
import com.example.demo.models.CustomerAddress;
import com.example.demo.models.CustomerBase;
import com.example.demo.models.CustomerCar;
import com.example.demo.models.Employee;
import com.example.demo.models.EmployeeAddress;
import com.example.demo.models.EmployeeUser;
import com.example.demo.models.FixedBy;
import com.example.demo.models.Issue;
import com.example.demo.models.User;
import com.example.demo.repositories.CarIssueRepo;
import com.example.demo.repositories.CarRepo;
import com.example.demo.repositories.CustomerAddressRepo;
import com.example.demo.repositories.CustomerBaseRepo;
import com.example.demo.repositories.CustomerCarRepo;
import com.example.demo.repositories.CustomerRepo;
import com.example.demo.repositories.EmployeeAddressRepo;
import com.example.demo.repositories.EmployeeRepo;
import com.example.demo.repositories.EmployeeUserRepo;
import com.example.demo.repositories.FixedByRepo;
import com.example.demo.repositories.IssueRepo;
import com.example.demo.repositories.UserRepo;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/api/resources")
public class TestController {

	@Autowired CustomerRepo customerRepo;
	@Autowired CustomerAddressRepo customerAddressRepo;
	@Autowired UserRepo userRepo;
	@Autowired CustomerBaseRepo customerBaseRepo;
	@Autowired EmployeeRepo employeeRepo;
	@Autowired EmployeeAddressRepo employeeAddressRepo;
	@Autowired CustomerCarRepo customerCarRepo;
	@Autowired CarRepo carRepo;
	@Autowired CarIssueRepo carIssueRepo;
	@Autowired IssueRepo issueRepo;
	@Autowired FixedByRepo fixedByRepo;
	@Autowired EmployeeUserRepo employeeUserRepo;
	
	
	private String tempUserId;

	@PostMapping("/add-customer")
	public void addCustomer(@RequestBody CustomerEntity customer) {
		Customer newCustomer = new Customer(customer.getFirstName(), customer.getLastName(), customer.getAge(),
				customer.getEmail());
		CustomerAddress newCustomerAddress = new CustomerAddress(customer.getCountry(),
				customer.getProvince(), customer.getAddress(), customer.getCity(), newCustomer.getId());
		
		CustomerBase c = new CustomerBase(UUID.fromString(tempUserId), newCustomer.getId());
		customerBaseRepo.save(c);
		customerRepo.save(newCustomer);
		customerAddressRepo.save(newCustomerAddress);
	}
	
	@PostMapping("/add-user")
	public void addUser(@RequestBody User user) {
		tempUserId = user.getId().toString();
		userRepo.save(user);
	}
	
	@PostMapping("/add-employee/{userId}")
	public void addEmployee(@PathVariable("userId") String userId, @RequestBody Employee employee) {
		UUID employeeId = employee.getId();
		//EmployeeAddress eAddress = new EmployeeAddress(employee.getCountry(), employee.getState(), employee.getProvince(), employee.getAddress(), employee.getCity(), employeeId);
		EmployeeUser e = new EmployeeUser(employeeId, UUID.fromString(userId));
		employeeUserRepo.save(e);
		employeeRepo.save(employee);
		//employeeAddressRepo.save(eAddress);
	}
	
	@PostMapping("/add-car/{id}")
	public void addCar(@PathVariable("id") String id, @RequestBody Car car) {
		String carVin = car.getVin();
		CustomerCar c = new CustomerCar(UUID.fromString(id), carVin);
		carRepo.save(car);
		customerCarRepo.save(c);
	}
	
	@PostMapping("/add-issue/{vin}")
	public void addIssue(@PathVariable("vin") String id, @RequestBody Issue issue) {
		CarIssue c = new CarIssue(id, issue.getId());
		issueRepo.save(issue);
		carIssueRepo.save(c);
	}
	
	@PostMapping("/fix-issue")
	public void addIssueFix(@RequestBody FixedBy fixedBy) {
		fixedByRepo.save(fixedBy);
	}
	
	@GetMapping("/get-user-info")
	public List<User> getUserInfo() {
		return userRepo.findAll();
	}
	
	@GetMapping("/get-all-customers")
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/get-all-employees")
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/get-employee/{employeeId}")
	public Optional<Employee> getEmployeeInfo(@PathVariable("employeeId") String employeeId) {
		return employeeRepo.findById(UUID.fromString(employeeId));
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/get-all-cars")
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}
	

}
