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
// CoinDispenserService12
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Coin Dispenser for release 1.2.
//
//   Automatically generated from CoinDispenserControl12.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface CoinDispenserService12 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public boolean getCapEmptySensor() throws JposException;
	public boolean getCapJamSensor() throws JposException;
	public boolean getCapNearEmptySensor() throws JposException;
	
	// Properties
	public int     getDispenserStatus() throws JposException;
	
	// Methods
	public void    dispenseChange(int amount) throws JposException;
	
}
