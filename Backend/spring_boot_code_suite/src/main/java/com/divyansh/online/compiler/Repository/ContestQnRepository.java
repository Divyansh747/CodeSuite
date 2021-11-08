package com.divyansh.online.compiler.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.online.compiler.Entity.ContestEntity;
import com.divyansh.online.compiler.Entity.ContestQnEntity;

@Repository
public interface ContestQnRepository extends JpaRepository<ContestQnEntity, Long>{

	List<ContestQnEntity> findAll();
	//List<ContestEntity> findByContestID(Long ContestID);
	
}
