package net.lingwood.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.lingwood.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}