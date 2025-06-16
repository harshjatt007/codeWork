class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        Set<String> corners = new HashSet<>();
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        long actualArea = 0;

        for (int[] rect : rectangles) {
            int a = rect[0], b = rect[1], c = rect[2], d = rect[3];

            // Update bounding rectangle
            minX = Math.min(minX, a);
            minY = Math.min(minY, b);
            maxX = Math.max(maxX, c);
            maxY = Math.max(maxY, d);

            // Add area
            actualArea += (long)(c - a) * (d - b);

            // Record all 4 corners of current rectangle
            String[] pts = {
                a + "," + b,  // bottom-left
                a + "," + d,  // top-left
                c + "," + b,  // bottom-right
                c + "," + d   // top-right
            };

            for (String pt : pts) {
                if (!corners.add(pt)) {
                    corners.remove(pt);
                }
            }
        }

        // Expected area from bounding box
        long expectedArea = (long)(maxX - minX) * (maxY - minY);

        // Check area
        if (actualArea != expectedArea) return false;

        // Check corners
        if (corners.size() != 4 ||
            !corners.contains(minX + "," + minY) ||
            !corners.contains(minX + "," + maxY) ||
            !corners.contains(maxX + "," + minY) ||
            !corners.contains(maxX + "," + maxY)) {
            return false;
        }

        return true;
    }
}