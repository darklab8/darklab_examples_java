package com.example.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@lombok.Data class Coffee {
    private @lombok.Getter final String id;
    private String name;
}

@RestController
class RestApiDemoController {
private List<Coffee> coffees = new ArrayList<>();
    public RestApiDemoController() {
        coffees.addAll(List.of(
            new Coffee("capucino"),
            new Coffee("black")
        ));
    }

    @RequestMapping(value = "/coffees", method = RequestMethod.GET)
        Iterable<Coffee> getCoffees() {
            return coffees;
    }

    @RequestMapping(value = "/coffees/{id}", method = RequestMethod.GET)
    Optional<Coffee> getCoffeeById(@PathVariable String id) {
        for (Coffee c: coffees) {
            if (c.getId().equals(id)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    @PostMapping(value = "/coffees")
        Iterable<Coffee> createCoffee(@RequestBody Coffee coffee) {
            coffees.add(coffee);
            return coffees;
    }
}