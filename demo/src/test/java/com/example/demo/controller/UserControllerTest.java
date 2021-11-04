package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserserviceImp;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserserviceImp userserviceImp;

    @Test
    void getAllUser() throws Exception {
        List<User> list = new ArrayList<>();
        list.add(new User(1,"outime1","outime1",null));
        list.add(new User(1,"outime2","outime2",null));
        list.add(new User(1,"outime3","outime3",null));
        Mockito.when(userserviceImp.getAllUser()).thenReturn(list);
        String url = "/user";
        mockMvc.perform(get(url)).andExpect(status().isOk());
    }
}