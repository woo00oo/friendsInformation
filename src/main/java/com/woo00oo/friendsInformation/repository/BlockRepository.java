package com.woo00oo.friendsInformation.repository;

import com.woo00oo.friendsInformation.domain.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Block,Long> {
}
