class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int max=0;
        for(int i=0;i<boxTypes.length;i++){
            int numberOfBoxes=boxTypes[i][0];
            int numberOfUnitsPerBox=boxTypes[i][1];
            if(truckSize>=numberOfBoxes){
                max+=numberOfBoxes*numberOfUnitsPerBox;
                truckSize-=numberOfBoxes;
            }else{
                max+=numberOfUnitsPerBox*truckSize;
                return max;
            }
        }
        return max;
    }
}