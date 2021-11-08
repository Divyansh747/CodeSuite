package com.divyansh.online.compiler.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.online.compiler.Entity.PracticeEntity;

@Repository
public interface PracticeRepository extends JpaRepository<PracticeEntity, Long> {

	List<PracticeEntity> findAll();
	
}
