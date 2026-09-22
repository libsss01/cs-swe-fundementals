# Arrays

## Core Idea

An array is a fixed-size data structure that stores multiple elements of the same type. Each element is accessible through an index starting at `0`.

Accessing an element by its index has a time complexity of `O(1)` because the computer can determine its location using an address calculation such as:

`address = base + (elementSize * index)`

This means that the number of elements in the array does not affect the cost of direct access.

## Mental Model

During this learning session, I used arrays with some unused positions to distinguish **physical capacity** from **logical size**.

For example:

`[1, 2, 3, 4, 0, 0]`

Here, `0` is only used as a convention to represent an unused position. In a real array, `0` can also be a valid value.

From this example, we can distinguish several properties:

- `arr.length`: the physical capacity of the array. Here, it is `6`.
- `size`: the number of logically used elements. Here, it is `4`.
- `size - 1`: the index of the last logical element.
- `size`: the index of the first free position, if capacity is still available, if not size is alwas equal to the array length.
- `arr.length - 1`: the last physical index of the array.

For example:

`[1, 4, 5, 0]`

The logical size is `3` and the physical capacity is `4`.

Therefore:

- last logical index = `size - 1 = 2`
- first free position = `size = 3`
- last physical index = `arr.length - 1 = 3`

## Key Patterns

### Access

Access by index has a complexity of `O(1)`.

When accessing `arr[i]`, the computer does not need to iterate through the previous elements. It can determine the position directly from the index.

### Linear Search

- **Best case: `O(1)`**  
  The target is found at the first logical position. Only one comparison is required, regardless of how large the input becomes.

- **Worst case: `O(n)`**  
  The target is at the end of the logical array or does not exist. In this case, up to `n` elements must be checked.

### Insertion

When inserting an element somewhere before the end of the logical array, existing elements must be shifted to the right.

The elements move **to the right**, while the loop processes them **from right to left**. This prevents values from being overwritten before they are moved.

After the shift, the new value is written at the desired index.

Complexity depends on the insertion position:

- **Insert at beginning: `O(n)`**  
  Almost every logical element must be shifted.

- **Insert in middle: `O(n)`**  
  The number of shifted elements can grow proportionally with the input size.

- **Insert at end: `O(1)`**, if unused physical capacity is available.  
  No shift is required because the new element can be written directly at index `size`.

### Deletion

When deleting an element, the elements located after it are shifted to the left to keep the logical array compact.

The elements move **to the left**, and the loop processes them **from left to right**.

The shift progressively overwrites the deleted element. After the shift, the old last logical position can be cleared and `size` is decremented.

Complexity depends on the deletion position:

- **Delete at beginning: `O(n)`**  
  Almost every remaining element must be shifted.

- **Delete in middle: `O(n)`**  
  The number of shifted elements can grow proportionally with the input size.

- **Delete at end: `O(1)`**  
  No shift is required because no logical element exists after the deleted one.

## Complexity Summary

| Operation | Complexity |

|---|---|

| Access | `O(1)` |
| Linear Search | `O(n)` worst case |
| Insert at beginning | `O(n)` |
| Insert in middle | `O(n)` |
| Insert at end | `O(1)` if capacity is available |
| Delete at beginning | `O(n)` |
| Delete in middle | `O(n)` |
| Delete at end | `O(1)` |

## Evidence

`ArrayExamples.java` implements the following operations:

- `find`
- `insert`
- `delete`

`Main.java` tests:

- search
- insertion at the beginning, middle, and end
- deletion at the beginning, middle, and end
- array states before and after operations

## Common Traps

- Off-by-one errors.
- Confusing `size`, `size - 1`, and `arr.length - 1`.
- Confusing the direction in which elements move with the direction in which the loop iterates.
- Forgetting to validate an index before insertion or deletion.
- Forgetting that insertion allows `index == size`, while deletion does not.
- Checking capacity after modifying the array instead of before.
- Assuming that `0` always represents an unused position.

## New Capability

- Explain how direct array access works and why it has `O(1)` complexity.
- Distinguish logical size from physical capacity.
- Analyze the complexity of array access, search, insertion, and deletion.
- Implement manual `find`, `insert`, and `delete` operations.
- Reason about shifts instead of memorizing their loops.
- Distinguish best-case and worst-case behavior.
- Detect common boundary and off-by-one errors.

## Next

Hash Maps / Hash Tables
