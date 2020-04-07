# 2018 AP Computer Science A



## Free Response Questions

Questions | Scoring | Samples and Commentary | Score Distributions |
--------- | ------- | ---------------------- | ------------------- |
Free-Response Questions | Scoring Guidelines<p>Chief Reader Report<p>Scoring Statistics|Sample Responses Q1<p>Sample Responses Q2<p>Sample Responses Q3<p>Sample Responses Q4|Scoring Distributions


## Questions

### Question 1 - Frog Simulation
This question involves reasoning about a simulation of a frog hopping in a straight line. The frog attempts
to hop to a goal within a specified number of hops. The simulation is encapsulated in the following
FrogSimulation class. You will write two of the methods in this class.
 
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

### Question 2 - WordPress
This question involves reasoning about pairs of words that are represented by the following WordPair class.

#### Question A
Write the constructor for the WordPairList class. The constructor takes an array of strings words as
a parameter and initializes the instance variable allPairs to an ArrayList of WordPair objects.

A WordPair object consists of a word from the array paired with a word that appears later in the array.
The allPairs list contains WordPair objects (words{i}, words{j}) for every i and j, 
where 0<=i<=j<words.length. Each WordPair object is added exactly once to the list.

The following examples illustrate two different WordPairList objects.

##### Example 1
String[] wordNums = {"one", "two", "three"};<p>
WordPairList exampleOne = new WordPairList(wordNums);

After the code segment has executed, the allPairs instance variable of exampleOne will contain
the following WordPair objects in some order.

    ("one", "two"), ("one", "three"), ("two", "three")
    
##### Example 2
String[] phrase = {"the", "more", "the", "merrier"};<p>
WordPairList exampleTwo = new WordPairList(phrase);

After the code segment has executed, the allPairs instance variable of exampleTwo will contain
the following WordPair objects in some order.

    ("the", "more"), ("the", "the"), ("the", "merrier")
    ("more", "the"), ("more", "merrier"), ("the", "merrier")

Complete the WordPairList constructor below.

```
    /** Constructs a WordPairList object as described in part (a).
     *  Precondition: words.length >= 2
     */
    public WordPairList(String[] words)
```


#### Question B
Write the WordPairList method numMatches. This method returns the number of WordPair
objects in allPairs for which the two strings match.

For example, the following code segment creates a WordPairList object.

String[] moreWords = {"the", "red", "fox", "the", "red"};
WordPairList exampleThree = new WordPairList(moreWords);

After the code segment has executed, the allPairs instance variable of exampleTwo will contain
the following WordPair objects in some order. The pairs in which the first string matches the second
string are **bold** for illustration.

    ("the", "red"), ("the", "fox"), **("the", "the")**,
    ("the", "red"), ("red", "fox"), ("red", "the"),
    **("red", "red")**, ("fox", "the"), ("fox", "red"),
    ("the", "red") 
    
The call exampleThree.numMatches() should return 2.

Complete method numMatches below.
```
    /** Returns the number of matches as described in part (b).
     */
    public int numMatches()
```