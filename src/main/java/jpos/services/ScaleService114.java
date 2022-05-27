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
// ScaleService114
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Scale for release 1.14.
//
//   Automatically generated from ScaleControl114.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface ScaleService114 extends ScaleService113
{
	// Capabilities
	public boolean getCapFreezeValue() throws JposException;
	public boolean getCapReadLiveWeightWithTare() throws JposException;
	public boolean getCapSetPriceCalculationMode() throws JposException;
	public boolean getCapSetUnitPriceWithWeightUnit() throws JposException;
	public boolean getCapSpecialTare() throws JposException;
	public boolean getCapTarePriority() throws JposException;
	
	// Properties
	public int     getMinimumWeight() throws JposException;
	
	// Methods
	public void    doPriceCalculating(int[] weightValue, int[] tare, long[] unitPrice, long[] unitPriceX, int[] weightUnitX, int[] weightNumeratorX, int[] weightDenominatorX, long[] price, int timeout) throws JposException;
	public void    freezeValue(int item, boolean freeze) throws JposException;
	public void    readLiveWeightWithTare(int[] weightData, int[] tare, int timeout) throws JposException;
	public void    setPriceCalculationMode(int mode) throws JposException;
	public void    setSpecialTare(int mode, int data) throws JposException;
	public void    setTarePrioity(int priority) throws JposException;
	public void    setUnitPriceWithWeightUnit(long unitPrice, int weightUnit, int weightNumerator, int weightDenominator) throws JposException;
	
}
