/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author rgutierrez
 *
 */
public class Communications implements SelfCheckCapable {
String Satellite;
/**
 * The rover will use a satellite to transmit back to Earth. 
 * It will send messages from the surface of Mars to a satellite and then
 * the satellite will transmit to Earth.
 */
String Operator;
/**
* The operator will take momentary control of the rover to conduct various diagnostics and tests. 
*/
int Frequency;
/**
* The rover will use ultra high, low gain and high gain frequencies to transmit. 
*/

void send_command()
{}

void receive_command() 
{} 
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
