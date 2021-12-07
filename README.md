# new
# Question 
You are given the following:

An integer N
An integer X
An integer Y
An array A of N elements
An array B of N elements
Find the number of pairs of  such that:

(A[i]^B[j])&X == (A[i]^B[j])&Y ,  where ^ represents bitwise XOR operator and & represents bitwise AND operator.
Note: Assume -based indexing.

Input

The first line contains a single integer  that denotes the number of test cases. 
For each test case:
The first line contains an integer N.
The second line contains an integer X.
The third line contains an integer Y.
The next line contains N space-separated integers denoting array A.
The next line contains N space-separated integers denoting array B.

0<= A[i],B[j] <= 10^6;


Logic:
 Create an array c with size 10^6.
 
 Prerequestie : 1 ^ 1 ==0; XOR result will be zero if both are same. So 
 
(A[i]^B[j])&X == (A[i]^B[j])&Y ->   ((A[i]^B[j])&X ) ^ ((A[i]^B[j])&Y ) =0

(A[i]& X ^ B[j] &X) ^ (A[i]& Y ^ B[j] &Y)

(A[i]& X ^ A[i]& Y) ^ (A[i]& X ^ B[j]& Y) ^ (A[i]& X ^ B[j]& Y) ^ (B[j]&X ^ B[j]^Y)

(A[i]& X ^ A[i]& Y)^ (B[j]&X ^ B[j]^Y)

This is what we will compute in 2 loops of c array.



