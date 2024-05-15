package com.api.integraplace.repository;

import com.api.integraplace.entity.BPR1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPR1Repository extends JpaRepository<BPR1Entity,Long> {
}
