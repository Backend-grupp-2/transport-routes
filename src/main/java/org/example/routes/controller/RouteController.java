package org.example.routes.controller;

import org.example.routes.model.Route;
import org.example.routes.model.RouteObj;
import org.example.routes.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/route/*")
public class RouteController {

    @Autowired
    RouteService routeService;
    @GetMapping("/{start}/{end}")
    public RouteObj getRoute(@PathVariable String start, @PathVariable String end){
        List<Route> routes = routeService.getRoute(start, end);
        RouteObj obj = new RouteObj();
        obj.setRoutes(routes);
        return obj;
    }

    /*@GetMapping("/test")
    public ResponseEntity<?> getRouteAll(){
        List<Route> routes = routeService.getRouteAll();
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }*/
}
