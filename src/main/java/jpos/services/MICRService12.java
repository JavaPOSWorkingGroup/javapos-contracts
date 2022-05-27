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
// MICRService12
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to MICR for release 1.2.
//
//   Automatically generated from MICRControl12.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface MICRService12 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public boolean getCapValidationDevice() throws JposException;
	
	// Properties
	public String  getAccountNumber() throws JposException;
	public String  getAmount() throws JposException;
	public boolean getAutoDisable() throws JposException;
	public void    setAutoDisable(boolean autoDisable) throws JposException;
	public String  getBankNumber() throws JposException;
	public int     getCheckType() throws JposException;
	public int     getCountryCode() throws JposException;
	public int     getDataCount() throws JposException;
	public boolean getDataEventEnabled() throws JposException;
	public void    setDataEventEnabled(boolean dataEventEnabled) throws JposException;
	public String  getEPC() throws JposException;
	public String  getRawData() throws JposException;
	public String  getSerialNumber() throws JposException;
	public String  getTransitNumber() throws JposException;
	
	// Methods
	public void    beginInsertion(int timeout) throws JposException;
	public void    beginRemoval(int timeout) throws JposException;
	public void    clearInput() throws JposException;
	public void    endInsertion() throws JposException;
	public void    endRemoval() throws JposException;
	
}
