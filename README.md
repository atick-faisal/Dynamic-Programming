<p align="center">
  <img src="https://blog.ploeh.dk/content/binary/asymmetric-fractal-tree.png" width="200">
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
> Brute force time complexity: O(2<sup>n</sup>). After optimization: O(n)
