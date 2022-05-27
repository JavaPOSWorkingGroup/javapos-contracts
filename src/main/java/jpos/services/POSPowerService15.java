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
// POSPowerService15
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to POS Power for release 1.5.
//
//   Automatically generated from POSPowerControl15.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface POSPowerService15 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public boolean getCapFanAlarm() throws JposException;
	public boolean getCapHeatAlarm() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public boolean getCapQuickCharge() throws JposException;
	public boolean getCapShutdownPOS() throws JposException;
	public int     getCapUPSChargeState() throws JposException;
	
	// Properties
	public int     getEnforcedShutdownDelayTime() throws JposException;
	public void    setEnforcedShutdownDelayTime(int delay) throws JposException;
	public int     getPowerFailDelayTime() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int powerNotify) throws JposException;
	public int     getPowerState() throws JposException;
	public boolean getQuickChargeMode() throws JposException;
	public int     getQuickChargeTime() throws JposException;
	public int     getUPSChargeState() throws JposException;
	
	// Methods
	public void    shutdownPOS() throws JposException;
	
}
