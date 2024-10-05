package com.example.freelancer_matching_platform.controller;

import com.example.freelancer_matching_platform.model.Bid;
import com.example.freelancer_matching_platform.service.BidService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BidController.class)
public class BidControllerTest {

    @Mock
    private BidService bidService;

    @InjectMocks
    private BidController bidController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(bidController).build();
    }

    @Test
    void testGetAllBids() throws Exception {
        Bid bid = new Bid();
        bid.setId(1L);
        bid.setAmount(BigDecimal.valueOf(500));
        bid.setFreelancerId(1L);
        bid.setProjectId(1L);

        List<Bid> bidList = Collections.singletonList(bid);
        when(bidService.getAllBids()).thenReturn(bidList);

        mockMvc.perform(get("/api/bids"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].amount").value(500))
                .andExpect(jsonPath("$[0].freelancerId").value(1))
                .andExpect(jsonPath("$[0].projectId").value(1));
    }

    @Test
    void testCreateBid() throws Exception {
        Bid bid = new Bid();
        bid.setId(1L);
        bid.setAmount(BigDecimal.valueOf(500));
        bid.setFreelancerId(1L);
        bid.setProjectId(1L);

        when(bidService.saveBid(any(Bid.class))).thenReturn(bid);

        String bidJson = "{ \"amount\": 500, \"freelancerId\": 1, \"projectId\": 1 }";

        mockMvc.perform(post("/api/bids")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bidJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.amount").value(500))
                .andExpect(jsonPath("$.freelancerId").value(1))
                .andExpect(jsonPath("$.projectId").value(1));
    }
}



