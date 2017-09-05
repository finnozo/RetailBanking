package com.isolutions4u.retailbanking.dao;

import com.isolutions4u.retailbanking.model.Branch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BranchDAOImpl implements BranchDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveBranch(Branch branch) {

        Session currentSession = sessionFactory.getCurrentSession();

        // save the customer

        String branchNo = getCount() + 10000 + "";

        branch.setBranchNo(branchNo);
        currentSession.saveOrUpdate(branch);

    }

    @Override
    public List<Branch> getAllBranches() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Branch> query = currentSession.createQuery("from Branch", Branch.class);

        // execute query and get result list

        List<Branch> branches = query.getResultList();

        return branches;
    }


    private Long getCount() {

        Session currentSession = sessionFactory.getCurrentSession();

        return (Long) currentSession.createCriteria("com.isolutions4u.retailbanking.model.Branch").setProjection(Projections.rowCount()).uniqueResult();
    }


}
