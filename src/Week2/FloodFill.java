package Week2;

/*
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

*/

class Solution {
    
   
	class Pairs
    {
        int sr, sc;
        Pairs(int sr, int sc)
        {
            this.sr = sr;
            this.sc = sc;
        }
        
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
    	
    	int[] row = {1, -1, 0, 0};
    	int[] col = {0, 0, 1, -1}; 
    	
    	int k = row.length;
    	int color = image[sr][sc];
        System.out.println("Current color " + color);
    	
        Queue<Pairs> queue = new LinkedList<>();
    
        boolean[][] visited = new boolean[image.length][image[0].length]; 
        
        queue.add(new Pairs(sr,sc));
        visited[sr][sc] = true;
        
        while(!queue.isEmpty())
        {
            Pairs p = queue.poll();
            
            int x = p.sr;
            int y = p.sc;
            System.out.println("x and y " + x + " " + y);

            
            if(image[x][y] == color)
            {
            	image[x][y] = newColor;
                System.out.println("Changed COlor");
                                

            }
            
            
            for(int i = 0;i < k; i++)
            {
            	int j = x + row[i];
            	int l = y + col[i];
                System.out.println("new x and y " + j + " " + l);
                
                if(j>= 0 && j < image.length &&
                   l >=0 && l < image[0].length
                   && image[j][l] == color
                   && !visited[j][l]) 
            	{
                    System.out.println("Adding into queue" + j + " " + l);
            		queue.add(new Pairs(j,l));
                    visited[j][l] = true;
            	}
            }   
        } 
        
        return image;
    }

	
}

