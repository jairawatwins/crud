package com.example.demo.controller;

import com.example.demo.DTO.RecordDTO;
import com.example.demo.DTO.RegisteredDTO;
import com.example.demo.service.UserService;
import com.example.demo.userRepositary.UserRepositary;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserService userService;
    @PostMapping("/save")
    public RecordDTO adduser(@RequestBody RegisteredDTO registeredDTO){
        return userService.addUser(registeredDTO);
    }

    @GetMapping("/getalldata")
    public List<RecordDTO> getAllData(){
        return userService.getDataList();
    }

    @GetMapping("/get/{id}")
    public RecordDTO getdataFromId(@PathVariable("id") int id){
        return userService.getDatafromId(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDataById(@PathVariable("id") int id){
        return userService.deleteDataById(id);
    }
}
