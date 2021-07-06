package com.william.controller;

import com.william.model.Opportunity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OpportunityController {

  @GetMapping("/Opportunity")
  List<Opportunity> all() {
    return List.of(new Opportunity(1, "AA", "AA", "William"), new Opportunity(2,"BB","BB", "Aymeric"));
  }
}