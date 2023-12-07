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
// POSPowerService116
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to POS Power for release 1.16.
//
//   Automatically generated from POSPowerControl116.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface POSPowerService116 extends POSPowerService115
{
	// Capabilities
	public boolean getCapBatteryCapacityRemainingInSeconds() throws JposException;
	public boolean getCapChargeTime() throws JposException;
	public boolean getCapVariableBatteryCriticallyLowThresholdInSeconds() throws JposException;
	public boolean getCapVariableBatteryLowThresholdInSeconds() throws JposException;
	
	// Properties
	public int     getBatteryCapacityRemainingInSeconds() throws JposException;
	public int     getBatteryCriticallyLowThresholdInSeconds() throws JposException;
	public void    setBatteryCriticallyLowThresholdInSeconds(int seconds) throws JposException;
	public int     getBatteryLowThresholdInSeconds() throws JposException;
	public void    setBatteryLowThresholdInSeconds(int seconds) throws JposException;
	public int     getChargeTime() throws JposException;
	
}
