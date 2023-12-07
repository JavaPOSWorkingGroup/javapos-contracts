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
// RemoteOrderDisplayControl18
//
//   Interface defining all new capabilities, properties and
//   methods that are specific to Remote Order Display for release 1.8.
//
// Modification history
// ------------------------------------------------------------------
// 03-Jun-2003 JavaPOS Release 1.8                                BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface RemoteOrderDisplayControl18 extends RemoteOrderDisplayControl17
{
	// Capabilities
	public boolean getCapStatisticsReporting() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;

	// Methods
	public void    resetStatistics(String statisticsBuffer)
										 throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer)
										 throws JposException;
	public void    updateStatistics(String statisticsBuffer)
										 throws JposException;
}