package com.examples;

import org.junit.Test;

public class FrogSimulationTest {

    @Test
    public void testSimulate(){
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
    }

    @Test
    public void testRunSimulations(){
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.runSimulations(10));
    }

}
