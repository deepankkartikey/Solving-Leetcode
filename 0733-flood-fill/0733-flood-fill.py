class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        rows, cols = len(image), len(image[0])
        color_to_change = image[sr][sc]
        
        def fill(r, c):
            nonlocal rows, cols, color_to_change, color
            if r < 0 or c < 0 or r > rows-1 or c > cols-1 or \
            image[r][c] == color or image[r][c] != color_to_change:
                return
            
            image[r][c] = color
            
            fill(r-1, c)
            fill(r+1, c)
            fill(r, c+1)
            fill(r, c-1)
            
        fill(sr, sc)
        
        return image