package com.william.controller;

import com.william.entity.Toto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TotoController {

  @GetMapping("/toto")
  List<Toto> all() {
    return List.of(new Toto("William"), new Toto("Aymeric"));
  }
}