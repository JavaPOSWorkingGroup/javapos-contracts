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
// LineDisplayService17
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Line Display for release 1.7.
//
//   Automatically generated from LineDisplayControl17.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface LineDisplayService17 extends LineDisplayService16
{
	// Capabilities
	public boolean getCapBitmap() throws JposException;
	public boolean getCapMapCharacterSet() throws JposException;
	public boolean getCapScreenMode() throws JposException;
	
	// Properties
	public boolean getMapCharacterSet() throws JposException;
	public void    setMapCharacterSet(boolean mapCharacterSet) throws JposException;
	public int     getMaximumX() throws JposException;
	public int     getMaximumY() throws JposException;
	public int     getScreenMode() throws JposException;
	public void    setScreenMode(int screenMode) throws JposException;
	public String  getScreenModeList() throws JposException;
	
	// Methods
	public void    displayBitmap(String fileName, int width, int alignmentX, int alignmentY) throws JposException;
	public void    setBitmap(int bitmapNumber, String fileName, int width, int alignmentX, int alignmentY) throws JposException;
	
}
