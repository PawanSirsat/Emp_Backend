package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Branch;
import net.javaguides.springboot.model.CreateBranchRequest;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.BranchRepository;
import net.javaguides.springboot.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }
    
    @Autowired
    BranchRepository brachRepo;
    @Autowired
    EmployeeRepository employeeRepository;


    @Transactional
    public Branch createBranch(CreateBranchRequest createBranchRequest) {
        // Fetch the associated employee
        Employee employee = employeeRepository.findById(createBranchRequest.getEmployeeId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        // Create a new branch
        Branch branch = new Branch();
        branch.setBranchName(createBranchRequest.getBranchName());
        branch.setEmployee(employee);

        // Save the branch
        return branchRepository.save(branch);
    }
}
