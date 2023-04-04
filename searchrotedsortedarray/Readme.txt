So this is Similar to binary search

but here 
we check three condition

as the array is sorted we need to figure out where the search will lie

we use two pointer l, and r

we compare them if l<r the array is sorted and we can use normal binary 
search to get the answer.
Other l > r then it is unsorted so 
we can figure it out by eliminating the others 
so if mid element is greater than left we can say that the element between 
l and mid are sorted and we need to check if target is between them, if 
not elimnated by changing left and right as necessary.

 
