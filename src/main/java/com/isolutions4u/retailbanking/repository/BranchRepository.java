package com.isolutions4u.retailbanking.repository;

import com.isolutions4u.retailbanking.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("branchRepository")
public interface BranchRepository extends JpaRepository<Branch, String> {

    List<Branch> findByName(String name);

    Branch findByBranchNo(String branchNo);

}
