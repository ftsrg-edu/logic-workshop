Alice, Bob and Cecil are on the island.

Alice says that 
Alice is a knave and 
Bob is a knave and
Cecil is a knave.

Bob says that
(Alice is a knight and Bob is a knave and Cecil is a knave) or
(Alice is a knave and Bob is a knight and Cecil is a knave) or
(Alice is a knave and Bob is a knave and Cecil is a knight).

/*
A, B, C

A: !A && !B && !C
B:
  (A && !B && !C) || 
  (!A && B && !C) || 
  (!A && !B && C)
*/
