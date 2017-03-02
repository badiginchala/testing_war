package com.recruit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.recruit.pojo.Position;

@Repository
public interface PositionRepository extends MongoRepository<Position, String> {

}
