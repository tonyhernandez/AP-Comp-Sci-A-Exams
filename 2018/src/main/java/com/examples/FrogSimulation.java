package com.examples;

/**
 * This question involves reasoning about a simulation of a frog hopping in a straight line. The frog attempts
 * to hop to a goal within a specified number of hops. The simulation is encapsulated in the following
 * FrogSimulation class. You will write two of the methods in this class.
 */
public class FrogSimulation {

    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;

    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     *  position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     *  Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    private int hopDistance() {
        /* implementation not shown */
        return 0;
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     *  Returns true if the frog successfully reached or passed the goal during the simulation;
     *          false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        return false;
    }

    /** Runs num simulations and returns the proportion of simulations in which the frog
     *  successfully reached or passed the goal.
     *  Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        return 0;
    }
}

