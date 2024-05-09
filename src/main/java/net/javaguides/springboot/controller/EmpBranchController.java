//package net.javaguides.springboot.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import net.javaguides.springboot.model.EmployeeBranchDTO;
//import net.javaguides.springboot.service.EmpBranchService;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/v1/empbranch")
//public class EmpBranchController {
//    @Autowired
//    private EmpBranchService empBranchService;
//
//    @GetMapping 
//    public ResponseEntity<List<EmployeeBranchDTO>> getAllBranches() {
//        List<EmployeeBranchDTO> branches = empBranchService.getEmployeeBranchInfo();
//        return ResponseEntity.ok(branches);
//    }
//}