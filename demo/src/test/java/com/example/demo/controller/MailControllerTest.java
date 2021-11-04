//package com.example.demo.controller;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(MailController.class)
//class MailControllerTest {
//    @Autowired
//    MockMvc mock;
//
//    @Test
//    void sendEmail() throws Exception {
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/sendmail");
//        MvcResult mvcResult = mock.perform(requestBuilder).andReturn();
//        assertEquals("Email Sent Sucessfully!",mvcResult.getResponse().getContentAsString());
//    }
//}