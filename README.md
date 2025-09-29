This repository is a fork of [AlejandraCasado/MinimumDominatingSet](https://github.com/AlejandraCasado/MinimumDominatingSet) with a few adaptations to make the heuristic solver compatible with the [Docker Environment for the PACE Challenge 2025](https://github.com/MarioGrobler/PACE2025-docker). In this version, the solver reads a single instance in the DIMACS-like .gr format from stdin and outputs the dominating set (not just its size) to stdout.

# Minimum Dominating Set Problem
A dominating set in a graph is a set of vertices such that every vertex outside the set is adjacent to a vertex in the set. The domination number is the minimum cardinality of a dominating set in the graph. The problem of finding the minimum dominating set is a combinatorial optimization problem that has been proved to be NP-hard. Given the difficulty of this problem, an Iterated Greedy algorithm is proposed for its solution and it is compared to the solution given by an exact algorithm and by the state-of-art algorithms. Computational results show that the proposal is able to find optimal or near-optimal solutions within a short computational time. 

## Datasets
The code, an Excel file with the tables of the experiments results and instances are available in this repository.

