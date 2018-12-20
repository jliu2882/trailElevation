package jliu2882;

public class Trail {
    private int[] markers;

    public Trail(int[] markers){
        this.markers=markers;
    }
    public boolean isLevelTrailSegment(int start, int end){
        int max = markers[start];
        int min = markers[start];
        for(int i = start + 1; i <= end;i++){
            if(markers[i]>max){
                max = markers[i];
            } else if(markers[i]<min){
                min = markers[i];
            }
        }
        if(max-min>10){
            return false;
        }
        return true;
    }
    public boolean isDifficult(){
        int count = 0;
        for(int i = 0; i < markers.length -1;i++){
            if(thirtyPlus(markers[i],markers[i+1])){
                count++;
            }
            else{
                count = 0;
            }
        }
        if(count>=3){
            return true;
        }
        return false;
    }
    public boolean thirtyPlus(int a, int b){
        if(Math.abs(a-b)>=30){
            return true;
        }
        return false;
    }
}
