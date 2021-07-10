package com.william.controller;

import com.william.model.Opportunity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OpportunityController {

  @GetMapping("/Opportunity")
  List<Opportunity> all() {
    return List.of(new Opportunity(1, "AA", "AA", "William"), new Opportunity(2,"BB","BB", "Aymeric"));
  }

  @PostMapping("/Opportunity")
  public String addOpportunity() {
    return "Opportunity created";
  }

  @DeleteMapping("/Opportunity")
  public String deleteOpportunity() {
    return "Opportunity deleted";
  }

  @PutMapping("/Opportunity")
  public String UpdateOpportunity() {
    return "Opportunity updated";
  }
}
