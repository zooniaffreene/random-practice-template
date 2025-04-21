# random-practice-template

This lab is to practice using Math.random().

On the AP Exam you cannot import anything so you MUST use Math.random() anytime you need a random value.

Math.random() generates a DOUBLE between 0 and 1 (not including 1). Inclusive/exclusive AGAIN: [0, 1)

Lets say you want to generate a random integer between 1 and 10, inclusive of both. HOW? 3 steps

1) Math.random() * RANGE (how many numbers in your set)
2) CAST to int if necessary
3) Add/Subtract your initial value

So...     int rand = (int) (Math.random() * 10) + 1
