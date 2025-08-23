package com.amigoscodespringbootbeginner;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {

    List<SoftwareEngineer> getSoftwareEngineerById(Integer id);
}
