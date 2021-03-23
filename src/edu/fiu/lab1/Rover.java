/**
 * 
 */
package edu.fiu.lab1;

/**
 * @author rgutierrez
 *
 */
public class Rover {
	int body;
	/**
	 * This is the body that houses and contains all the components of the rover.
	 */
	int arm;
	/**
	 * This is the arm that collects data samples from the surface of the planet. 
	 */
	int drivetrain;
	/**
	 * The drivetrain is what sends power from the battery to the wheels for movement. 
	 */
	int system_control;
	/**
	 * System control will monitor and operate all key components of the rover to ensure it is safe 
	 * and also to carry its mission on Mars.
	 */
	int sample_storage;
	/**
	 * Physical samples from the surface of Mars will be kept here for study and analysis. 
	 */
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Brain myBrain = new Brain();
myBrain.runSelfCheck();
	}

}
