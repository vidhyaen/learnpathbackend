package com.josi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josi.model.Signup;
@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer>
{

    Signup save(Signup signup);
}