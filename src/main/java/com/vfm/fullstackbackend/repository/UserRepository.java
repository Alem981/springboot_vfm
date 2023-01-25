package com.vfm.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfm.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}