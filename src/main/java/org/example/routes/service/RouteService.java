package org.example.routes.service;

import org.example.routes.model.Route;
import org.example.routes.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getRoute(String start, String end) {
        List<Route> routes = routeRepository.findRoutesByStartAndEnd(start, end);
        return routes;
    }

    /*public List<Route> getRouteAll() {
        List<Route> routes = routeRepository.findAll();
        return routes;
    }*/
}
