# Big O

## Core Concept

Big O is a notation used to describe how the cost of an algortihm change when the input grows.  
The cost here can two general things :  

1. The Quantity of work done by the algorithms (operations)
2. The additional memory created bt the algorithms.

## Mental Model

1. Identify the input (generally called n)
2. Read the code and visualize operations
3. Observe how the cost of the algorithm changes when the input increase
4. Deduct the Time and Spatial Complexity of the Algorithm

## Keys Patterns

- `O(1)` : Constant cost. Access by index...
- `O(log n)` : The problem is reduced or increased by a constant multiplicator at each iteration
- `O(n)` : The work increase proportionally with the increase of the input
- `O(n log n)` : a logorithm work is repeated `n` times or conversly
- `O(n²)` : A linear work is repeated for each `n` input

- Consecutive blocks: add the costs.
- Nested blocks: multiply the costs.
- Keep the dominant term when we have +1 Complexity.
- Constant factors do not change the Big O class.

## Evidence

- I wrote a function in Java for each of the main Big O families.
- I analyzed several pieces of code and determined their time and space complexity.
- I identified the patterns used to recognize each complexity family.

## Common pitfalls

- Confusing `O(log n)` and `O(n log n)`, especially when loop are nested.
- Forgetting to simplify the final expression by keeping the term that dominates as `n` grows.
- Believing that directly using the input data necessarily changes the complexity.
- Confusing the memory already occupied by the input with the auxiliary memory created by the algorithm, when n grows.

## New Capability

I can now analyze the time and space complexity of a simple piece of code, identify its Big O notation, and justify my reasoning based on how the cost changes as the input size increases.

## Next

Arrays
