Here we have to use 'AND' and 'OR' operator to reverse the bits.
here we are trying to reverse the bit 
so example:
0000000000000000000000000000001011
1101000000000000000000000000000000

we so to that we are using the least signifiacnt bit and shifting it to 
msb 
so we will first isolate the lsb using AND operator 
by using lsb= n & 1
the shift it lsb<<(31-i)
then OR it to add it to the result

result = result | reverselsb

then n= n>>1 to take the next bit and use for loop to get all the 32 bits 
