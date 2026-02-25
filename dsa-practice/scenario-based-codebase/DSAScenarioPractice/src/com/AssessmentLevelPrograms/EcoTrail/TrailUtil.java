package com.AssessmentLevelPrograms.EcoTrail;
import java.util.*;
import java.util.stream.Collectors;

public class TrailUtil {
	private List<Trail> trailList = new ArrayList<>();
	
	public List<Trail> getTrailList(){
		return trailList;
	}
	public void setTrailList() {
		this.trailList = (List<Trail>) trailList;
	}
	
	public void addTrailRecord(Trail trail) {
		trailList.add(trail);
	}
	
	public Trail getTrailById(String trailId) {
		for(Trail t : trailList) {
			if(t.getTrailId().equals(trailId)) {
				return t;
			}
		}
		return null;
	}
	
	public Set<Trail> getMostHikedTrails() {
		Set<Trail> hk = new LinkedHashSet<>();
		
		int maxHike = Integer.MIN_VALUE;
		
		for(Trail t : trailList) {
			if(t.getHikeCount() > maxHike) {
				maxHike = t.getHikeCount();
			}
		}
		
		for(Trail t : trailList) {
			if(t.getHikeCount() == maxHike) {
				hk.add(t);
			}
		}
		return hk;
	}
	
	public Map<String, Integer> getHikeCountByRegion(String region, int hikeCount) {
		return trailList.stream()
				.collect(Collectors.groupingBy(
						Trail::getRegion,
						LinkedHashMap::new,
						Collectors.summingInt(Trail::getHikeCount)
						));
	}
	
	public Map<String, List<Trail>> groupTrailsByDifficulty(){
		return trailList.stream()
				.collect(Collectors.groupingBy(
						Trail::getDifficulty,
						Collectors.toList()));
	}
	
	public boolean updateHikeCount(String trailId, int additionalHikes) {
		
		for(Trail t : trailList) {
	        if(t.getTrailId().equals(trailId)) {

	            int updatedCount = t.getHikeCount() + additionalHikes;
	            t.setHikeCount(updatedCount);

	            return true;
	        }
	    }

	    return false;
	}
	
	public List<Trail> filterTrails(String region, String difficulty) {
		return trailList.stream()
				.filter(e -> e.getRegion().equalsIgnoreCase(region))
				.filter(e -> e.getDifficulty().equalsIgnoreCase(difficulty))
				.collect(Collectors.toList());
	}
	
	public Map<String, Trail> getTopTrailsByRegion(){
		return trailList.stream()
	            .collect(Collectors.groupingBy(
	                    Trail::getRegion,
	                    LinkedHashMap::new,
	                    Collectors.collectingAndThen(
	                            Collectors.maxBy(
	                                    Comparator.comparingInt(Trail::getHikeCount)
	                            ),
	                            Optional::get
	                    )
	            ));
	}
	
//Or 
//
//	public Map<String, List<Trail>> getTopTrailsByRegion(int n) {
//	    return trailList.stream()
//	        .collect(Collectors.groupingBy(Trail::getRegion,
//	            Collectors.collectingAndThen(Collectors.toList(),
//	                list -> list.stream()
//	                    .sorted(Comparator.comparing(Trail::getHikeCount).reversed())
//	                        .limit(n)
//	                        .collect(Collectors.toList()))));		
//    }
 
	
	public Map<String, DifficultyStats> getDifficultyStats(){

		return trailList.stream()
	            .collect(Collectors.groupingBy(
	                    Trail::getDifficulty,
	                    LinkedHashMap::new,
	                    Collectors.collectingAndThen(
	                            Collectors.summarizingInt(Trail::getHikeCount),
	                            stats -> new DifficultyStats(
	                                    (int) stats.getCount(),
	                                    stats.getSum()
	                            )
	                    )
	            ));
	}
	

//Or
//
//    public Map<String, String> getDifficultyStats() {
//
//	    return trailList.stream()
//	        .collect(Collectors.groupingBy(
//	            Trail::getDifficulty,
//	            Collectors.collectingAndThen(
//	                Collectors.summarizingDouble(Trail::getHikeCount),
//	                s -> "count=" + s.getCount() +
//	                     ", min=" + s.getSum() + 
//	                     ", avg=" + s.getAverage() )));
//	 }
	
}





