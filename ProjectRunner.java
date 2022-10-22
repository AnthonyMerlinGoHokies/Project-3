// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Anthony Merlin
package towerofhanoi;

/**
 * Class to start the project and visual representation
 * 
 * @author Anthony Merlin
 * @version 10.18.2022
 *
 */
public class ProjectRunner {
    /**
     * main method to run this class and start the project
     * 
     * @param args
     *            Command Line Arguments
     */
    public static void main(String[] args) {
        int disks = 5;

        if (args.length == 1) {
            disks = Integer.parseInt(args[0]);
        }
        HanoiSolver solver = new HanoiSolver(disks);
        PuzzleWindow puzzle = new PuzzleWindow(solver);
    }
}