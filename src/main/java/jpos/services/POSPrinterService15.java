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
// POSPrinterService15
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to POS Printer for release 1.5.
//
//   Automatically generated from POSPrinterControl15.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface POSPrinterService15 extends POSPrinterService14
{
	// Capabilities
	public int     getCapJrnCartridgeSensor() throws JposException;
	public int     getCapJrnColor() throws JposException;
	public int     getCapRecCartridgeSensor() throws JposException;
	public int     getCapRecColor() throws JposException;
	public int     getCapRecMarkFeed() throws JposException;
	public boolean getCapSlpBothSidesPrint() throws JposException;
	public int     getCapSlpCartridgeSensor() throws JposException;
	public int     getCapSlpColor() throws JposException;
	
	// Properties
	public int     getCartridgeNotify() throws JposException;
	public void    setCartridgeNotify(int notify) throws JposException;
	public int     getJrnCartridgeState() throws JposException;
	public int     getJrnCurrentCartridge() throws JposException;
	public void    setJrnCurrentCartridge(int cartridge) throws JposException;
	public int     getRecCartridgeState() throws JposException;
	public int     getRecCurrentCartridge() throws JposException;
	public void    setRecCurrentCartridge(int cartridge) throws JposException;
	public int     getSlpCartridgeState() throws JposException;
	public int     getSlpCurrentCartridge() throws JposException;
	public void    setSlpCurrentCartridge(int cartridge) throws JposException;
	public int     getSlpPrintSide() throws JposException;
	
	// Methods
	public void    changePrintSide(int side) throws JposException;
	public void    markFeed(int type) throws JposException;
	
}
