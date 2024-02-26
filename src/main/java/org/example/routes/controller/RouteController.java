package org.example.routes.controller;

import org.example.routes.model.Route;
import org.example.routes.service.RouteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/route")
public class RouteController {

    RouteService routeService = new RouteService();
    @GetMapping("/{start}/{end}")
    public ResponseEntity<List<Route>> getRoute(@PathVariable String start, @PathVariable String end){
        List<Route> routes = routeService.getRoute(start, end);
        
        if (routes.isEmpty()){
            return ResponseEntity.status(204).body(routes);
        } else {
            return ResponseEntity.status(200).body(routes);
        }
    }
}
