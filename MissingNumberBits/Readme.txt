This is the Missing number problem no. 268
We are going to solve it using two ways
First is my method using sum formula missing number = sum1 -sum2
here we calculate the sum of all arrays in nums and store it in sum2
then we calculate the sum of series 1-nums.length
the formula to do this is = n(1+n)/2  1= first num and n = nums.length

Second Method is also simple we use xor opertor ^ to get the solution 
Here we xor all the number in nums 
and all the number in 0-nums.length;
after that we xor xor1 and xor2 to get our missing number

