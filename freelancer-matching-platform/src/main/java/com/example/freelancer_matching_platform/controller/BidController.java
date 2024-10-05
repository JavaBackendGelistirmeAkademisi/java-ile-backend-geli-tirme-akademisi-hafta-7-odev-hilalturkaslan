package com.example.freelancer_matching_platform.controller;

import com.example.freelancer_matching_platform.model.Bid;
import com.example.freelancer_matching_platform.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bids")
public class BidController {

	@Autowired
	private BidService bidService;

	@PostMapping
	public ResponseEntity<Bid> createBid(@RequestBody Bid bid) {
		Bid createdBid = bidService.createBid(bid);
		return ResponseEntity.ok(createdBid);
	}

	@GetMapping
	public ResponseEntity<List<Bid>> getAllBids() {
		List<Bid> bids = bidService.getAllBids();
		return ResponseEntity.ok(bids);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Bid> getBidById(@PathVariable Long id) {
		Bid bid = bidService.getBidById(id);
		if (bid != null) {
			return ResponseEntity.ok(bid);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Bid> updateBid(@PathVariable Long id, @RequestBody Bid bid) {
		Bid updatedBid = bidService.updateBid(id, bid);
		return ResponseEntity.ok(updatedBid);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBid(@PathVariable Long id) {
		bidService.deleteBid(id);
		return ResponseEntity.noContent().build();
	}
}
