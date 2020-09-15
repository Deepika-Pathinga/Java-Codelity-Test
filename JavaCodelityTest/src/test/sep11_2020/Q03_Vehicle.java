/*
 * 3. Write a java program to implement the fallowing Consider vehicle parking 
 * application where each vehicle information which enters into the parking location 
 * stored in 2 lists. at the end of each day these lists to be merged into single list 
 * and one vehicle information which has highest parked hour should be retrieved, 
 * where each vehicle information has vehicle number, 
 * vehicle model, total duration parked in minutes.
 */

package test.sep11_2020;

import java.util.ArrayList;
import java.util.List;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Q03_Vehicle {

	public static void main(String[] args) {
		List<Q03_VehicleInfo> l1= new ArrayList<>();
		List<Q03_VehicleInfo> l2 = new LinkedList<>();
		l1.add(new Q03_VehicleInfo("1f2g53","S3",65));
		l2.add(new Q03_VehicleInfo("43v7ebhj","A1",34));
		l1.add(new Q03_VehicleInfo("bhjb4","S4",28));
		l2.add(new Q03_VehicleInfo("34bh7b","A4",108));
		l1.addAll(l2);
	
		System.out.println(l1.size());
//		Collections.sort(l1,new VehicleInfo());
		l1.sort(new Q03_VehicleInfo().reversed());
		System.out.println(l1.get(0));
	}

}
