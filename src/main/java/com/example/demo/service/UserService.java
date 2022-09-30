package com.example.demo.service;

import com.example.demo.DTO.RecordDTO;
import com.example.demo.DTO.RegisteredDTO;

import java.util.List;

public interface UserService {
    RecordDTO addUser(RegisteredDTO registeredDTO);

    List<RecordDTO> getDataList();

    RecordDTO getDatafromId(int id);
}
