package com.example.demo.serviceimpl;

import com.example.demo.DTO.RecordDTO;
import com.example.demo.DTO.RegisteredDTO;
import com.example.demo.service.UserService;
import com.example.demo.userRepositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepositary userRepositary;

    @Override
    public RecordDTO addUser(RegisteredDTO registeredDTO) {
        return userRepositary.save(registeredDTO);
    }

    @Override
    public List<RecordDTO> getDataList() {
        return userRepositary.findAll();
    }

    @Override
    public RecordDTO getDatafromId(int id) {
        return userRepositary.findAllById(id);
    }

    @Override
    public String deleteDataById(int id) {
        return "Data is deleted";
    }
}
