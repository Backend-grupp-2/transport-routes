package org.example.routes.repository;

import org.example.routes.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findRoutesByStartAndEnd(String start, String end);

}
