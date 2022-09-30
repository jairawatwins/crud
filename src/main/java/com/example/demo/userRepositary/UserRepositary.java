package com.example.demo.userRepositary;
import com.example.demo.DTO.RecordDTO;
import com.example.demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<RecordDTO,Integer> {
}
