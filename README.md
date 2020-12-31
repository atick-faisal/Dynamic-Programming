<p align="center">
  <img src="/assets/banner.png" width="400">
</p>
<h1 align="center">Dynamic Programming</h1>
<p align="cneter" justify="center">Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial.</p>

<h3>Fibonacci</h3>

Write a function **fib(n)** that takes in a number as an argument.
The function should return n-th number in the **Fibonacci sequence**.

> The first and second number of the sequence is 1.
>
> To generate the next number in the sequence we add the previous two.
>
> Base case: fib(n) = 1 *for n < 2*
>
> Algorithm: fib(n) = fib(n-1) + fib(n-2)
>
> Brute force recursion time complexity: O(2<sup>n</sup>).

#### [Memorizarion](/src/recursion/fibonacci/Fibonacci.kt)
- Create a memory object using hash-map or similar data structure
- Store the return values in the hash-map with the input number as key
- In the beginning of every recursion, check for the result in the memory object
- If the result is already there, return; otherwise continue
- Time complexity: **O(n)**

<p align="center">
    <img src="assets/fib_tree.png" width="600">
</p>

#### [Tabulation](/src/tabulation/fibonacci/Fibonacci.kt)
- Create a table of length (n+1). Initialize with 0s
- Seed table by inserting 1 in the 1th element. table[1] = 1
- Iterate through the table and add each element to the next two elements.
- Continue to the end of the table. In the end, **table[n] = fib(n)**

<p align="center">
    <img src="assets/fib_table.png" width="600">
</p>

<h3>Grid Traveller</h3>

Say that you are traveller on a **2D grid**. You start at the top left conner.
Your goal is to travel to the bottom right corner.
You can only move **down** or **right** 
How many ways can you travel on a **m x n** grid?
Write a function gridTraveller(m, n) that calculates this.

> gridTraveller(1, 1) = 1
>
> gridTraveller(0, n), gridTraveller(m, 0) = 0
>
> Moving right on a m x n grid will result in a (m-1) x n for the next move
>
> Moving down on a m x n grid will result in a m x (n-1) grid for the next move
>
> Time complexity: O(2<sup>m+n</sup>)

#### [Memorization](src/recursion/grid/GridTraveller.kt)

- Create a memory object using hash-map or similar data structure
- Store the return values in the hash-map with the input number as key
- In the beginning of every recursion, check for the result in the memory object
- If the result is already there, return; otherwise change the grid dimension accordingly and continue
- Time complexity: **O(m x n)**

<p align="center">
    <img src="assets/grid_tree.png" width="600">
</p>

#### [Tabulation](src/tabulation/grid/GridTraveller.kt)

- Create an table with (m + 1) x (n + 1) dimension. Initialize every cell with 0s
- Seed the table by: table[1][1] = 1; since gridTraveller(1, 1) = 1
- Iterate through the table. Add each element to the element on right and down.
- Continue till the bottom right corner. table[m][n] will contain the result
- Time complexity **O(m * n)**

<p align="center">
    <img src="assets/grid_table.png" width="600">
</p>