Here We have 3 approaches first is the brute force other is the binary 
search (nlogn) and optimal is the two pointers approach

Binary is when we use for loop to pick one and find the first element - 
target to find the other element we use binary search method to find the 
subtrated value

Next is the Two pointer method here we use l and right pointer 

we calculate l+r and then compare it with target if equal we got the 
answer
if l+r > target we decrease r --
if l+r < target we increase l++

we get the solution with only O(n)time

