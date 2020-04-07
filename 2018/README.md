# 2018 AP Computer Science A



## Free Response Questions

Questions | Scoring | Samples and Commentary | Score Distributions |
--------- | ------- | ---------------------- | ------------------- |
Free-Response Questions | Scoring Guidelines<p>Chief Reader Report<p>Scoring Statistics|Sample Responses Q1<p>Sample Responses Q2<p>Sample Responses Q3<p>Sample Responses Q4|Scoring Distributions


## Questions

### Question 1 - Frog Simulation

#### Question A
Write the simulate method, which simulates the frog attempting to hop in a straight line to a goal from
the frog's starting position of 0 within a maximum number of hops. The method returns true if the frog
successfully reached the goal within the maximum number of hops; otherwise, the method returns false.

The FrogSimulation class provides a method called hopDistance that returns an integer
representing the distance (positive or negative) to be moved when the frog hops. A positive distance
represents a move toward the goal. A negative distance represents a move away from the goal. The returned
distance may vary from call to call. Each time the frog hops, its position is adjusted by the value returned by
a call to the hopDistance method.

The frog hops until one of the following conditions becomes true:
* The frog has reached or passed the goal.
* The frog has reached a negative position.
* The frog has taken the maximum number of hops without reaching the goal.

The following examples shows a declaration of a FrogSimulation object for which the goal distance is
24 inches and the maximum number of hops is 5. The table shows some possible outcomes of calling the
simulate method.

FrogSimulation sim = new FrogSimulation(24, 5);

Examples | Values returned by<p>hopDistance() | Final position<p>of frog | Return value of<p>sim.sumulate()-|
---------|------------------------------------|--------------------------|----------------------------------|
Example 1|5, 7, -2, 8, 6 | 24 | true
Example 2|6, 7, 6, 6 | 25 | true
Example 3|6, -6, 31 | 31 | true
Example 4|4, 2, -8 | -2 | false
Example 5|5, 4, 2, 4, 3 | 18 | false

Complete method simulate below. You must use hopDistance appropriately to receive full credit.

```
    /** Runs num simulations and returns the proportion of simulations in which the frog
     *  successfully reached or passed the goal.
     *  Precondition: num > 0
     */ 
    public boolean simulate()
```


#### Question B
Write the runSimulations method, which performs a given number of simulations and returns the
proportion of simulations in which the frog successfully reached or passed the goal. For example, if the
parameter passed to runSimulations is 400, and 100 of the 400 simulate method calls returned true, 
then the runSimulations method should return 0.25.

Complete method runSimulations below. Assume that simulate works as specified, regardless
of what you wrote in part (a). You must use simulate appropriately to receive full credit.

```
    /** Runs num simulations and returns the proportion of simulations in which the frog
     *  successfully reached or passed the goal.
     *  Precondition: num > 0
     */
    public double runSimulations(int num)
```
 