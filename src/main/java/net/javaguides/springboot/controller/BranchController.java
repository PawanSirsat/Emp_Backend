package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Branch;
import net.javaguides.springboot.model.CreateBranchRequest;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.BranchRepository;
import net.javaguides.springboot.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("https://emp-frontend-black.vercel.app")
@RestController
@RequestMapping("/api/v1/branches")
public class BranchController {
	@Autowired
	private BranchService branchService;

	@Autowired
	private BranchRepository branchRepository;

	@GetMapping
	public ResponseEntity<List<Branch>> getAllBranches() {
		List<Branch> branches = branchService.getAllBranches();
		return ResponseEntity.ok(branches);
	}

	@PostMapping("/create")
	public ResponseEntity<Branch> createBranch(@RequestBody CreateBranchRequest createBranchRequest) {
		Branch createdBranch = branchService.createBranch(createBranchRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdBranch);
	}

}
