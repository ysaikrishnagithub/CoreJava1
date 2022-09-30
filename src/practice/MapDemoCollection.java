package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> d=  new HashMap<Integer,String>();
		System.out.println("\nEducation completion of years");
		d.put(2015, "ssc");
		d.put(2018, "Inter");
		d.put(2019, "b.tech (1st yr)");
		d.put(2020, "b.tech(2nd yr)");
		d.put(2021, "b.tech(3rd yr)");
		d.put(2022, "b.tech (4th yr passed out)");
		d.put(2015, "nmss");
		
		System.out.println(d);
		
		LinkedHashMap<Integer,String> d1=  new LinkedHashMap<Integer,String>();
		System.out.println("\nEducation completion of years");
		d1.put(2015, "ssc");
		d1.put(2018, "Inter");
		d1.put(2019, "b.tech (1st yr)");
		d1.put(2020, "b.tech(2nd yr)");
		d1.put(2021, "b.tech(3rd yr)");
		d1.put(2022, "b.tech (4th yr passed out)");
		d1.put(2015, "nmss");
		
		System.out.println(d1);

		TreeMap<Integer,String> d3=  new TreeMap<Integer,String>();
		System.out.println("\nEducation completion of years");
		d3.put(2022, "b.tech (4th yr passed out)");
		d3.put(2019, "b.tech (1st yr)");
		d3.put(2015, "ssc");
		d3.put(2018, "Inter");
		d3.put(2021, "b.tech(3rd yr)");
		d3.put(2020, "b.tech(2nd yr)");
		d3.put(2015, "nmss");
		
		System.out.println(d3);
		
	}

}
