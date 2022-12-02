# FizzBuzz
#### Respond to the following:

1. Fill out the following truth table:

| P  | Q  | P && Q | P \|\| Q |
|:--:|:--:|:------:|:--------:|
| T  | T  |    T   |   T      |
| T  | F  |    F   |   T      |
| F  | T  |    F   |   T      |
| F  | F  |    F   |   F      |


2. Prove a version of DeMorgan's Law:

| P  | Q  | P \|\| Q | ! (P \|\| Q) | !P | !Q | !P && !Q |
|:--:|:--:|:--------:|:------------:|:--:|:--:|:--------:|
| T  | T  |    T     |       F      |  F | F  |   F      |
| T  | F  |    T     |       T      |  F | T  |   F      |
| F  | T  |    T     |       T      |  T | F  |   F      |
| F  | F  |    F     |       T      |  T | T  |   T      |

3. What does DeMorgan's state and how did you prove it for the case above?
  * The DeMorgan states that the complement of the union of two sets A and B is equal to the intersection of the complement of the sets A and B.
    The table proves the case because the results of P and Q intersected on some of the conditions.
