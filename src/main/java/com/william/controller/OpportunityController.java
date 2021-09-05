package com.william.controller;

import com.william.model.Opportunity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OpportunityController {
  ArrayList<Opportunity> Opportunities = new ArrayList<Opportunity>(List.of());


  @GetMapping("/Opportunity")
  public ArrayList<Opportunity> getOpportunity() {
    return Opportunities;
  }

  @PostMapping("/Opportunity")
  public ArrayList<Opportunity> addOpportunity() {
    Opportunities.add(new Opportunity(1,"toto","affaire1","affaire1"));
    return Opportunities;
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
