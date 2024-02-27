package org.example.routes.repository;

import org.example.routes.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findRoutesByStartAndEnd(String start, String end);

}
