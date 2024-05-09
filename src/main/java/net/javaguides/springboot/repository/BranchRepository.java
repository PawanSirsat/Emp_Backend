package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {

	
}
