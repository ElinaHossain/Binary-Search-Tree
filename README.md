# Binary-Search-Tree

## Overview
This Java program implements a Binary Search Tree (BST), a binary tree data structure where each node has at most two child nodes, typically referred to as the left and right child. The BST is sorted such that for each node, all elements in its left subtree are less than the node, and all elements in its right subtree are greater than the node. The program provides a command-line interface for users to interact with the BST, allowing operations such as insertion, deletion, searching, displaying levels, and more.

## What Does the Program Do?
The program allows users to perform the following operations on the Binary Search Tree:
- Insert a Node: Insert a key-value pair into the BST.
- Delete a Node: Delete a node with a specified key from the BST.
- Size: Retrieve the total number of nodes in the BST.
- Levels: Retrieve the number of levels (height) of the BST.
- Is Empty: Check whether the BST is empty.
- Search Key: Check if a key exists in the BST.
- Display: Display all nodes of the BST.
- Display Specific Level: Display nodes at a specific level of the BST.
- Exit Application: Terminate the program.

## What I Learned
- Implementation of a Binary Search Tree, including operations like insertion, deletion, and searching.
- Recursive algorithms for traversing and manipulating a binary tree.
- Displaying nodes at specific levels within the tree.
- Command-line interface design for user interaction.

## How Could I Improve It?
- Error Handling: Implement more robust error handling for user inputs, ensuring that the program gracefully handles unexpected input.
- BST Validation: Implement a validation mechanism to ensure that the tree remains a valid BST after each operation.
- Testing: Develop comprehensive unit tests to verify the correctness of each BST operation.
- Performance Analysis: Evaluate and optimize the efficiency of BST operations, especially for large trees.
- Generic Type Bounds: Restrict the generic types to extend Comparable or use a separate interface to ensure compatibility with various key types.
- Display Formatting: Improve the formatting of the displayed tree to enhance readability.
- Code Comments: Add more comments to explain the complex logic or algorithms, providing clarity for future developers or contributors.
