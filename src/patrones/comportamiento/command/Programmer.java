/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.command;

/**
 *
 * @author daza
 */
public class Programmer implements Command {

    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}
