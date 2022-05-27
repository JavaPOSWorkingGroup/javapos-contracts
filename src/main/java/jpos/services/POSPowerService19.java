//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// POSPowerService19
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to POS Power for release 1.9.
//
//   Automatically generated from POSPowerControl19.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface POSPowerService19 extends POSPowerService18
{
	// Capabilities
	public boolean getCapBatteryCapacityRemaining() throws JposException;
	public boolean getCapCompareFirmwareVersion() throws JposException;
	public boolean getCapRestartPOS() throws JposException;
	public boolean getCapStandbyPOS() throws JposException;
	public boolean getCapSuspendPOS() throws JposException;
	public boolean getCapUpdateFirmware() throws JposException;
	public boolean getCapVariableBatteryCriticallyLowThreshold() throws JposException;
	public boolean getCapVariableBatteryLowThreshold() throws JposException;
	
	// Properties
	public int     getBatteryCapacityRemaining() throws JposException;
	public int     getBatteryCriticallyLowThreshold() throws JposException;
	public void    setBatteryCriticallyLowThreshold(int threshold) throws JposException;
	public int     getBatteryLowThreshold() throws JposException;
	public void    setBatteryLowThreshold(int threshold) throws JposException;
	public int     getPowerSource() throws JposException;
	
	// Methods
	public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
	public void    restartPOS() throws JposException;
	public void    standbyPOS(int reason) throws JposException;
	public void    suspendPOS(int reason) throws JposException;
	public void    updateFirmware(String firmwareFileName) throws JposException;
	
}
