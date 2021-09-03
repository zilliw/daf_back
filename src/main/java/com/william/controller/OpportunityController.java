package com.william.controller;

import com.william.model.Opportunity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OpportunityController {
  ArrayList<Opportunity> Opportunities = new ArrayList<Opportunity>(List.of());


  @GetMapping("/Opportunity")
  public String getOpportunity() {
    return "Opportunity displayed";
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
