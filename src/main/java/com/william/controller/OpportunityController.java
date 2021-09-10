package com.william.controller;

import com.william.model.Delivery;
import com.william.model.Opportunity;
import com.william.model.Status;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class OpportunityController {
  ArrayList<Opportunity> Opportunities = new ArrayList<Opportunity>();


  @GetMapping("/Opportunity")
  public ArrayList<Opportunity> getOpportunity() {
    return Opportunities;
  }

  @PostMapping("/Opportunity")
  public ArrayList<Opportunity> addOpportunity(int id, String code, String childcode, String Client, String name, String division, String responsible, Delivery delivery, Status status) {
    Opportunities.add(new Opportunity(id,code,childcode,Client,name,division,responsible, delivery,status));
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
