package com.api.integraplace.repository;

import com.api.integraplace.entity.BPR2Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPR2Repository extends JpaRepository<BPR2Entity, Long> {
}
