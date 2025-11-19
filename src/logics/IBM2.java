package logics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class IBM2 {

	public static void main(String[] args) {
		List<Integer> timestamp = new ArrayList<>();
		timestamp.add(10);
		timestamp.add(5);
		timestamp.add(20);
		timestamp.add(40);
		timestamp.add(50);
		timestamp.add(10);
		
		List<String> serviceIds = new ArrayList<>();
		serviceIds.add("Srv1");
		serviceIds.add("Srv1");
		serviceIds.add("Srv2");
		serviceIds.add("Srv1");
		serviceIds.add("Srv2");
		serviceIds.add("Srv1");
		
		int threshold = 10;
		//Return the services ID [lexicographically] that has timeout is greater than the threshold
		List<String> timeoutServices = findBeyondThresholdServices(timestamp, serviceIds, threshold);
		for(String s : timeoutServices) {
			System.out.println(s + " ");
		}

	}

	private static List<String> findBeyondThresholdServices(List<Integer> timestamp, List<String> serviceIds, int threshold) {
		List<String> output = new ArrayList<>();		
		if(timestamp == null || serviceIds == null) {
			return output;
		}		
		if(timestamp.size() == 0 || serviceIds.size() == 0) {
			return output;
		}		
		HashMap<String, List<Integer>> map = new HashMap<>();		
		for(int i = 0; i < serviceIds.size(); i++) {
			if(map.containsKey(serviceIds.get(i))) {
				List<Integer> serviceTimestamps = map.get(serviceIds.get(i));
				if(serviceTimestamps != null && !serviceTimestamps.contains(timestamp.get(i))) {
					serviceTimestamps.add(timestamp.get(i));
				}				
			} else {
				List<Integer> serviceNewTimestamp = new ArrayList<>();
				serviceNewTimestamp.add(timestamp.get(i));
				map.put(serviceIds.get(i), serviceNewTimestamp);
			}
		}		
		for(String serviceId : map.keySet()) {
			List<Integer> times = map.get(serviceId);
			Collections.sort(times);
			boolean isValid = false;
			for(int i = 1; i < times.size(); i++) {
				int timeDifference = times.get(i) - times.get(i - 1);
				isValid = (timeDifference > threshold);
				if(isValid) {
					output.add(serviceId);
					break;
				}
			}
		}		
		Collections.sort(output);
		return output;
	}
}
