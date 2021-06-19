package com.aks.akh.tgf.rangan.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.aks.akh.tgf.rangan.entity.Restaurants;

public class FindLocationJavaAPI {

	public static void main(String[] args) {
		FindLocationJavaAPI javaURLConnect = new FindLocationJavaAPI();
		String locID = javaURLConnect.findLocationIDByCityName("atlanta");
		javaURLConnect.findRestaurantsByLocationID(locID);
	}

	public List<Restaurants> getRestaurantsList(String city){
		String locID = findLocationIDByCityName(city);
		return findRestaurantsByLocationID(locID);
	}
	
	private String findLocationIDByCityName(String city) {

		String locationID = "";
		try {
			String urlStr ="https://travel-advisor.p.rapidapi.com/locations/auto-complete?query="+city;
			URL url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("x-rapidapi-key",
					"1f5e29c315msha7258159ac18447p1a7247jsncbcfd8125631");
			con.setRequestProperty("x-rapidapi-host",
					"travel-advisor.p.rapidapi.com");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			int status = con.getResponseCode();
			System.out.println("Status Code is  --- >" + status);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();
			
			JSONObject jsonObj = new JSONObject(content.toString());
			System.out.println("Complete Object  :"+jsonObj);
			
			JSONArray jsonArr = (JSONArray) jsonObj.get("data");
			System.out.println(jsonArr);
			System.out.println(getKey(jsonArr, "result_object"));
			JSONObject resultObj = (JSONObject) getKey(jsonArr, "result_object");
			System.out.println("Location ID  :"+resultObj.get("location_id"));
			locationID  = (String)resultObj.get("location_id");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locationID;
	}
	
	private List<Restaurants> findRestaurantsByLocationID(String locationID){

		List<Restaurants> listRestaurants = new ArrayList<Restaurants>();
		try {
			String urlStr ="https://travel-advisor.p.rapidapi.com/restaurants/list?location_id="+locationID
					+ "&restaurant_tagcategory=10591&restaurant_tagcategory_standalone=10591&currency=USD&lunit=mi&limit=30&open_now=false&lang=en_US";
			
//			String urlStr ="https://travel-advisor.p.rapidapi.com/restaurants/list?location_id=293919&restaurant_tagcategory=10591&restaurant_tagcategory_standalone=10591&currency=USD&lunit=km&limit=30&open_now=false&lang=en_US";
			URL url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("x-rapidapi-key",
					"1f5e29c315msha7258159ac18447p1a7247jsncbcfd8125631");
			con.setRequestProperty("x-rapidapi-host",
					"travel-advisor.p.rapidapi.com");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			int status = con.getResponseCode();
			System.out.println("Status Code is  --- >" + status);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();
			
			JSONObject jsonObj = new JSONObject(content.toString());
			JSONArray jArr = (JSONArray) jsonObj.get("data");
			JSONObject value = null;
			Restaurants restaurants = null;
		    for (int i = 0; i < jArr.length(); i++)
		    {
		    	restaurants = new Restaurants();
		        JSONObject item = jArr.getJSONObject(i);
		        if (item.keySet().contains("address_obj"))
		        {
		            value = (JSONObject) item.get("address_obj");
		            System.out.println(value.get("street1")+","+value.get("city"));
		            restaurants.setAddress(value.get("street1")+","+value.get("city"));
		        }
		        if(item.has("rating"))
		        restaurants.setRating((String)item.get("rating"));
		        if(item.has("website"))
		        restaurants.setWebsite((String)item.get("website"));	
		        if(item.has("phone"))
		        restaurants.setPhoneNo((String)item.get("phone"));
		        if(item.has("name"))
		        restaurants.setRestaurantName((String)item.get("name"));	
		        
		        if(item.has("num_reviews"))
		        restaurants.setNumReviews((String)item.get("num_reviews"));
		        if(item.has("ranking"))
		        restaurants.setRanking((String)item.get("ranking"));	
		        listRestaurants.add(restaurants);
		    }

			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listRestaurants;

		
	}
	
	private Object getKey(JSONArray array, String key)
	{
	    Object value = null;
	    for (int i = 0; i < array.length(); i++)
	    {
	        JSONObject item = array.getJSONObject(i);
	        if (item.keySet().contains(key))
	        {
	            value = item.get(key);
	            break;
	        }
	    }

	    return value;
	}
	
	
	
	private void executeHttpRequest(){
		
	}
}
