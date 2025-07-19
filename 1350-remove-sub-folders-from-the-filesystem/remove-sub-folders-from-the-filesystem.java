class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String>arr=new ArrayList<>();
        arr.add(folder[0]);
        for(int i=1;i<folder.length;i++){
            String lastFolder=arr.get(arr.size()-1);
            lastFolder+='/';
            if(!folder[i].startsWith(lastFolder)){
                arr.add(folder[i]);
            }
        }
        return arr;
    }
}