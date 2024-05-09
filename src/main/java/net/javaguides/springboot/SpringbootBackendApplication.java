package net.javaguides.springboot;

import net.javaguides.springboot.repository.BranchRepository;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.BranchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Autowired
	private BranchService branchService;
	

	@Override
	public void run(String... args) throws Exception {
//		
//		 Employee emp = new Employee();
//		 emp.setId(1);
//
//         Branch branch = new Branch();
//         branch.setBranchName("Science");
//         branch.addEmpId(emp);
//         Branch newPatient = branchService.saveBranch(branch);
		}
}
