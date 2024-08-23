Here is a Python console application that solves the knapsack problem using dynamic programming:

```python
def knapSack(W, wt, val, n):
    K = [[0 for w in range(W + 1)]
            for i in range(n + 1)]
             
    # Build table K[][] in bottom
    # up manner
    for i in range(n + 1):
        for w in range(W + 1):
            if i == 0 or w == 0:
                K[i][w] = 0
            elif wt[i - 1] <= w:
                K[i][w] = max(val[i - 1]
                  + K[i - 1][w - wt[i - 1]],
                               K[i - 1][w])
            else:
                K[i][w] = K[i - 1][w]
 
    return K[n][W]
 
# Driver code
val = [60, 100, 120]
wt = [10, 20, 30]
W = 50
n = len(val)
 
print(knapSack(W, wt, val, n))
```

This program defines a function `knapSack` that takes four arguments: `W` (the maximum weight that the knapsack can hold), `wt` (a list of the weights of each item), `val` (a list of the values of each item), and `n` (the number of items). It uses dynamic programming to build a table `K` where `K[i][w]` will be storing the maximum value that can be achieved with `i` items and total weight `w`. The final result, which is the maximum value that can be achieved with `n` items and weight `W`, is then returned by the function.

The "driver code" at the end of the program sets up some example values and weights, calls the `knapSack` function with these values, and then prints the result.