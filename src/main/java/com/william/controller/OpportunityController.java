package com.william.controller;

import com.william.entity.Opportunity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OpportunityController {

  @GetMapping("/Opportunity")
  List<Opportunity> all() {
    return List.of(new Opportunity("William"), new Opportunity("Aymeric"));
  }
}