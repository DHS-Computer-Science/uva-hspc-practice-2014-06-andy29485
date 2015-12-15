# Practice 2014 - 06: Spawn of Ungoliant

## Background
The spider children of Ungoliant are spreading through Mirkwood. Each of the
giant spiders cannot move from the tree which it inhabits; however, each can lay
eggs in the trees adjacent to it. Each egg will rapidly hatch and grow into
another spider, who will then lay their own eggs.

Given a map of Mirkwood, indicating where spider-filled and spider-free trees
are, determine how far the spider infestation will spread.

For this problem, adjacency is one of the four cardinal
directions (north, south, east, and west); two trees connected via
a diagonal are not considered adjacent.

## Description

### Input
The first line of an input case is of the form W H, where W is the width of the
map and H is the height. The next H lines contain strings of length W specifying
the layout of Mirkwood. An S character represents a spider-infested tree, and an
T character represents a spider-free tree. A . (period) signifies open space on
the forest floor, where there is no tree.

The end of input is signified by two zero’s, which is a case that should not
be processed.

### Output
For each test case, print out the map of Mirkwood once the spiders have spread
as far as possible. There should be no blank lines between maps.

## Sample
### Input
```
3 4
T..
TST
..T
TTT
5 5
T.T.T
.T.T.
..S..
.T.T.
T.T.T
0 0
```

### Output
```
S..
SSS
..S
SSS
T.T.T
.T.T.
..S..
.T.T.
T.T.T
```
