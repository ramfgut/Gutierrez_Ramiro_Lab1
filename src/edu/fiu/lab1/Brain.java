/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author rgutierrez
 *
 */
public class Brain implements SelfCheckCapable {
int Processor;
/**
 * This is the chip that runs the computer for the Brain.
 */
int Memory;
/**
 * This is the amount of RAM the Brain computer has. It has 512MB of RAM and also a 5TB SSD for storage of data prior to transmission. 
 */
String Computer;
/**
 * This is the main computer that runs all systems of the rover. 
 */
String Backup_Computer;
/**
 * This is the backup computer that runs all systems of the rover. This will only engage if the main system fails.  
 */
String Navigation;
/**
 * This is the system responsible for landing the rover on Mars from the transport vehicle. 
 * Once on Mars this system is responsible for navigating the rover on the planet surface. 
 */


Communications send_data()
{return null;}

Communications receive_data()
{return null;}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Brain";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
