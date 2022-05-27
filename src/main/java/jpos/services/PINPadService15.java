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
// PINPadService15
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to PIN Pad for release 1.5.
//
//   Automatically generated from PINPadControl15.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface PINPadService15 extends PINPadService14
{
	// Properties
	public byte[]  getTrack4Data() throws JposException;
	public void    setTrack4Data(byte[] track4Data) throws JposException;
	
}
