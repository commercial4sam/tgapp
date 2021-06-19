package com.aks.akh.tgf.rangan.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aks.akh.tgf.rangan.entity.Restaurants;
import com.aks.akh.tgf.rangan.utility.FindLocationJavaAPI;

@Controller
public class RestaurantsController {


    @RequestMapping(value="/showRestaurants", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
    	FindLocationJavaAPI restaurantsAPI = new FindLocationJavaAPI();
       	Restaurants restaurants = new Restaurants();
       	List<Restaurants> restaurantsList = restaurantsAPI.getRestaurantsList("atlanta");
       	
       	model.addAttribute("restaurants",restaurants);
       	model.addAttribute("restaurantsList",restaurantsList);
        
        return "restaurants";
    }
    
    
    
}