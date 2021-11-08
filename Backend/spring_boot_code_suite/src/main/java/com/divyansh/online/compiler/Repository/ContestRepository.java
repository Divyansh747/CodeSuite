package com.divyansh.online.compiler.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.online.compiler.Entity.ContestEntity;

@Repository
public interface ContestRepository extends JpaRepository<ContestEntity, Long>{

	List<ContestEntity> findAll();
	//List<ContestEntity> findByContestID(Long ContestID);
	
}
